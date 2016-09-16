/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.ArrayList;
import java.util.Scanner;
import Classes.ListaAluno;
import Classes.ListaCurso;
import java.io.IOException;

/**
 *
 * @author felipe
 */
public class ListaMatricula {

    private ListaAluno listaAluno;
    private ListaCurso listaCurso;
    private ArrayList<Matricula> listaMatricula;
    private int id;
    private Scanner ler = new Scanner(System.in);
    private Menu menu = new Menu();

    public ListaMatricula() {
        this.listaMatricula = new ArrayList<>(10);
        this.listaAluno = new ListaAluno();
        this.listaCurso = new ListaCurso();
        this.id = 0;
        
    }

    public void inserir() {
        Matricula matricula = new Matricula();
        System.out.println("Digite o cpf do aluno a ser matrículado");
        int indiceAluno = listaAluno.buscarIdAluno(ler.next());
        if (indiceAluno < 0) {
            System.out.println("Aluno não cadastrado");
        } else {
            System.out.println("Digite o nome do curso em que o aluno será matrículado");
            int indiceCurso = listaCurso.buscarIdCurso(ler.next());
            if (indiceCurso < 0) {
                System.out.println("Curso não cadastrado");
            } else {
                matricula.getDataMatricula().getTime();
                matricula.setIdCurso(indiceCurso);
                matricula.setIdAluno(indiceAluno);
                matricula.criarMatricula(indiceAluno, indiceCurso);
                listaMatricula.add(matricula);

            }
        }

    }

    public int buscar(String numMatricula) {
        for (Matricula m : listaMatricula) {
            if (m.getNumMatricula().equals(numMatricula)) {
                return listaMatricula.indexOf(m);
            }
        }

        return -1;
    }

    public void buscarAlunosMatriculados(int idAluno) {

        for (Matricula m : listaMatricula) {

            if (m.getIdAluno() == idAluno) {

                imprimir(buscar(m.getNumMatricula()));
            }
        }
    }

    public void buscarCursosMatriculados(int idCurso) {

        for (Matricula m : listaMatricula) {
            if (m.getIdCurso() == idCurso) {

                imprimir(buscar(m.getNumMatricula()));
            }
        }
    }

    public void buscar() {
        int indice = 0;
        int opcao = 0;
        do {
            menu.painelBuscaMatricula();
            opcao = ler.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Digite o número da matrícula");
                    indice = buscar(ler.next());
                    if (indice < 0) {
                        System.out.println("Matrícula não encontrada!");
                    } else {
                        System.out.println(indice);
                        imprimir(indice);
                    }
                    break;

                case 2:
                    System.out.println("Digite o CPF do aluno");
                    indice = listaAluno.buscarIdAluno(ler.next());
                    System.out.println("indice " + indice);
                    if (indice < 0) {
                        System.out.println("Aluno não encontrado");
                    } else {
                        buscarAlunosMatriculados(indice);
                    }
                    break;

                case 3:
                    System.out.println("Digite o nome do curso");
                    indice = listaCurso.buscarIdCurso(ler.next());
                    if (indice < 0) {
                        System.out.println("Curso não encontrado");
                    } else {
                        buscarCursosMatriculados(indice);
                    }
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;

            }

        } while (opcao != 0);

    }

    public void painelPrincipal() throws IOException {
        int opcao = 0;
        do {
            menu.painelPrincipal();
            opcao = ler.nextInt();
            switch (opcao) {
                case 1:

                    listaAluno.gerenciarAluno();
                    break;

                case 2:
                    listaCurso.gerenciarCurso();
                    break;

                case 3:
                    gerenciarMatricula();
                    break;
                case 0:

                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;

            }
        } while (opcao != 0);
    }

    public void gerenciarMatricula() {
        int opcao = 0;
        do {
            menu.painelMatricula();
            opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    inserir();
                    break;

                case 2:
                    buscar();
                    break;

                case 3:
                    imprimir();
                    break;
                case 4:
                    
                    FileManager.escreverNoAquivoMatricula(listaMatricula);
                    break;
                case 5:
                    FileManager.lerDoArquivoMatricula(listaMatricula);
                    break;
                case 0:
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;

            }

        } while (opcao != 0);

    }

    public void imprimir(int indice) {

        listaMatricula.get(indice).imprimir();
        listaAluno.imprimirPorId(listaMatricula.get(indice).getIdAluno());
        listaCurso.imprimirPorId(listaMatricula.get(indice).getIdCurso());
    }

    public void imprimir() {

        listaMatricula.stream().map((m) -> {
            m.imprimir();
            return m;
        }).map((m) -> {
            listaAluno.imprimirPorId(m.getIdAluno());
            return m;
        }).forEach((m) -> {
            listaCurso.imprimirPorId(m.getIdCurso());
        });

    }

}

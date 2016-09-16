/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author felipe
 */
public class ListaAluno {

    private ArrayList<Aluno> listaAluno;
    private int idAluno;
    private Menu menu = new Menu();
    private Scanner ler = new Scanner(System.in);

    public ListaAluno() {
        
        this.listaAluno = new ArrayList<Aluno>(10);
        this.idAluno = 0;
    }

    public boolean jaExiste(String cpf) {
        for (Aluno a : listaAluno) {
            if (a.getCpf().equals(cpf)) {
                return true;
            }
        }
        return false;
    }

    public void inserir() {

        Aluno aluno = new Aluno();
        aluno.formularioAluno();
        aluno.setId(this.idAluno);
        if (jaExiste(aluno.getCpf())) {
            System.out.println("Aluno já cadastrado!");

        } else {

            this.idAluno++;
            listaAluno.add(aluno);
            System.out.println("Aluno inserido com sucesso!");
        }
    }

    public int buscarIdLista(String cpf) {
        for (Aluno a : listaAluno) {
            if (a.getCpf().equals(cpf)) {
                return listaAluno.indexOf(a);
            }
        }
        return -1;
    }

    public int buscarIdAluno(String cpf) {
        for (Aluno a : listaAluno) {
            if (a.getCpf().equals(cpf)) {
                return a.getId();
            }
        }
        return -1;
    }

    public void gerenciarAluno() throws IOException {
        System.out.println("gerenciar aluno");
        int opcao = 0;
        do {
            menu.painelAluno();
            opcao = ler.nextInt();
            switch (opcao) {

                case 1:
                    inserir();
                    break;

                case 2:
                    System.out.println("Digite o número do CPF");
                    int indice = buscarIdLista(ler.next());
                    if (indice < 0) {
                        System.out.println("Aluno não cadastrado!");
                    } else {
                        imprimir(indice);
                    }
                    break;

                case 3:
                    imprimir();
                    break;

                case 4:
                    System.out.println("Digite o número do CPF");
                    indice = buscarIdLista(ler.next());
                    if (indice < 0) {
                        System.out.println("Aluno não cadastrado!");
                    } else {
                        alterarAluno(listaAluno.get(indice));
                        imprimir(indice);
                    }
                    break;

                case 5:
                    
                    FileManager.escreverNoAquivoAluno(listaAluno);
                    break;
                    
                    case 6:
                    FileManager.lerDoArquivoAluno(listaAluno);
                    break;
                    
                case 0:
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;

            }

        } while (opcao != 0);
    }

    public void alterarAluno(Aluno aluno) {

        int opcao = 0;
        do {
            menu.alteraAluno();
            opcao = ler.nextInt();
            switch (opcao) {

                case 1:
                    System.out.print("Novo nome: ");
                    aluno.setNome(ler.next());
                    System.out.println("");
                    break;

                case 2:
                    System.out.print("Novo cpf: ");
                    aluno.setCpf(ler.next());
                    System.out.println("");
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;

            }

        } while (opcao != 0);
    }

    public boolean imprimirPorId(int id) {
        for (Aluno a : listaAluno) {
            if (a.getId() == id) {
                a.imprimirAluno();
                return true;
            }
        }
        return false;
    }

    public void imprimir(int indice) {
        listaAluno.get(indice).imprimirAluno();
    }

    public void imprimir() {
        for (Aluno a : listaAluno) {
            a.imprimirAluno();
        }
    }

}

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
public class ListaCurso {
    
    private ArrayList<Curso> listaCurso;
    private int idCurso;
    private Menu menu = new Menu();
    private Scanner ler = new Scanner(System.in);

    public ListaCurso() {
        
        this.listaCurso = new ArrayList<Curso>(10);
        this. idCurso = 0;
    }
    
    public boolean jaExiste (int codigo){
        for (Curso a: listaCurso){
            if (a.getCodigo()==codigo){
                return true;
            }
        }
        return false;
    }

    public void inserir() {

        Curso curso = new Curso();
        curso.formularioCurso();
        if (jaExiste (curso.getCodigo())) {
            System.out.println("Curso já cadastrado!");
           
        }else{
            
            this.idCurso++;
            listaCurso.add(curso);
            System.out.println("Curso inserido com sucesso!");
            
            
        }
    }
    
    public int buscarIdLista (String nome){
        for (Curso c : listaCurso) {
            if (c.getNome().equals(nome)) {
                return listaCurso.indexOf(c);
            }
        }
        return -1;
    }
    public int buscarIdCurso (String nome){
        for (Curso c : listaCurso) {
            if (c.getNome().equals(nome)) {
                return c.getCodigo();
            }
        }
        return -1;
    }
    
    public void gerenciarCurso () throws IOException{
        int opcao = 0;
        do {
            menu.painelCurso();
            opcao = ler.nextInt();
            switch (opcao){
                
                case 1:
                    inserir();
                    break;
                    
                case 2:
                    System.out.println("Digite o nome do curso");
                    int indice = buscarIdLista(ler.next());
                    if (indice < 0){
                        System.out.println("Curso não cadastrado!");
                    }else{
                        imprimir (indice);
                    }
                    break;
                    
                case 3:
                    imprimir();
                    break;
                    
                case 4:
                    System.out.println("Digite o nome do curso");
                    indice = buscarIdLista(ler.next());
                    if (indice < 0){
                        System.out.println("Curso não cadastrado!");
                    }else{
                        alterarCurso (listaCurso.get(indice));
                        imprimir (indice);
                    }
                    break;
                    
                case 5:
                    FileManager.escreverNoAquivoCurso(listaCurso);
                   
                    break;
                    
                    case 6:
                    FileManager.lerDoArquivoCurso(listaCurso);
                    break;
                    
                case 0:
                    
                    
                    break;
                    
                default:
                    System.out.println("Opção inválida");
                    break;
                    
            }
            
        }while (opcao != 0); 
    }
    
    public void alterarCurso (Curso curso){
        
        int opcao = 0;
        do {
            menu.alteraCurso();
            opcao = ler.nextInt();
            switch (opcao){
                
                case 1:
                    System.out.print("Novo nome: ");
                    curso.setNome(ler.next());
                    System.out.println("");
                    break;
                    
                case 2:
                    System.out.print("Nova carga horária: ");
                    curso.setCargaHoraria(ler.next());
                    System.out.println("");
                    break;
                    
                case 3:
                    System.out.print("Nova código: ");
                    curso.setCodigo(ler.nextInt());
                    System.out.println("");
                    break;
                    
                case 0:
                    break;
                    
                default:
                    System.out.println("Opção inválida!");
                    break;
                    
            }

        }while (opcao != 0);
    }
    
    public boolean imprimirPorId (int id){
        for (Curso c: listaCurso){
            if (c.getCodigo() == id){
                System.out.println("entrou no imprimir por id no curso");
                c.imprimirCurso();
                return true;
            }
        }
        return false;
    }
    
    public void imprimir (int indice){
        listaCurso.get(indice).imprimirCurso();
    }
    
    public void imprimir (){
        listaCurso.stream().forEach((c) -> {
            c.imprimirCurso();
        });
    }
    
}

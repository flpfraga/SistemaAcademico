/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Scanner;

/**
 *
 * @author felipe
 */
public class Aluno {
    
    private int id;
    private String nome;
    private String cpf;
    private Menu menu = new Menu ();
    private Scanner ler = new Scanner (System.in);
    
    
    public Aluno (){
        this.id = 0;
        this.nome = "";
        this.cpf = "";
    }
    
    public void formularioAluno (){
        
        System.out.println("---------Formulátio de cadastro de alunos----------");
        System.out.print("Nome: ");
        this.nome = ler.next();
        System.out.println("");
        System.out.print("CPF: ");
        this.cpf = ler.next();
        System.out.println("");
        System.out.println("");
        
    }
    
    public void imprimirAluno (){
        
        System.out.println("Código: " + this.getId());
        System.out.println("Nome: "  + this.getNome());
        System.out.println("CPF: " + this.getCpf());
        
    }
    
    

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}

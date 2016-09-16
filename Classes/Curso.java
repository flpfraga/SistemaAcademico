
package Classes;

import java.util.Scanner;

public class Curso {
    private int codigo;
    private String nome;
    private String cargaHoraria;
    private Menu menu = new Menu ();
    private Scanner ler = new Scanner (System.in);
    
    
    public Curso (){
        this.codigo = 0;
        this.nome = "";
        this.cargaHoraria = "";
        System.out.println("");
    }
    
    public void formularioCurso (){
        
        System.out.println("---------Formulátio de cadastro de cursos----------");
        System.out.print("Nome: ");
        this.nome = ler.next();
        System.out.println("");
        System.out.print("Carga Horária: ");
        this.cargaHoraria = ler.next();
        System.out.println("");
        System.out.print("Código: ");
        this.codigo = ler.nextInt();
        System.out.println("");
        System.out.println("");
        
    }
    
    public void imprimirCurso (){
        
        System.out.println("Código: " + this.getCodigo());
        System.out.println("Nome: "  + this.getNome());
        System.out.println("Carga Horária: " + this.getCargaHoraria());
        
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
}

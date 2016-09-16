/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author felipe
 */
public class Matricula {

    private String numMatricula;
    private Calendar dataMatricula;
    private SimpleDateFormat ano;
    private int idAluno;
    private int idCurso;

    public Matricula() {
        this.idAluno = 0;
        this.idCurso = 0;
        this.numMatricula = "";
        this.dataMatricula = Calendar.getInstance();
        this.ano = new SimpleDateFormat ("yyyy");
        
    }
    
    public void criarMatricula (int idAluno, int idCurso){
        String [] vetAux = new String [3];
        vetAux[0] = Integer.toString (idAluno);
        vetAux[1] = Integer.toString (idCurso);
        vetAux[2] = getAno().format(this.dataMatricula.getTime()).toString();
        this.numMatricula = vetAux[0] + vetAux[1] +"-" + vetAux[2];
        
    }
    public void imprimir() {
        System.out.println("");
        System.out.println("Numero da mátricula: " + this.numMatricula);
        System.out.println("Data da matrícula: " + this.getDataMatricula().getTime());
    }

    /**
     * @return the numMatricula
     */
    public String getNumMatricula() {
        return numMatricula;
    }

    /**
     * @param numMatricula the numMatricula to set
     */
    public void setNumMatricula(String numMatricula) {
        this.numMatricula = numMatricula;
    }

    /**
     * @return the dataMatricula
     */
    public Calendar getDataMatricula() {
        return dataMatricula;
    }

    /**
     * @param dataMatricula the dataMatricula to set
     */
    public void setDataMatricula(Calendar dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    /**
     * @return the idAluno
     */
    public int getIdAluno() {
        return idAluno;
    }

    /**
     * @param idAluno the idAluno to set
     */
    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    /**
     * @return the idCurso
     */
    public int getIdCurso() {
        return idCurso;
    }

    /**
     * @param idCurso the idCurso to set
     */
    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    /**
     * @return the ano
     */
    public SimpleDateFormat getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(SimpleDateFormat ano) {
        this.ano = ano;
    }
}

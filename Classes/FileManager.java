package Classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author felipe
 */
public class FileManager {

    static File fileAluno;
    static File fileCurso;
    static File fileMatricula;
    static FileWriter fileWriter;

    public static void escreverNoAquivoAluno(ArrayList<Aluno> lista) {
        fileAluno = new File("/home/felipe/Documents/Matricula/Arquivos/aluno.txt");
        try {

            FileWriter fileWriter = new FileWriter(fileAluno);
            fileWriter.write("ID;Nome;CPF\n");
            for (Aluno item : lista) {
                fileWriter.write(item.getId() + ";");
                fileWriter.write(item.getNome() + ";");
                fileWriter.write(item.getCpf() + ";\n");
            }
            fileWriter.flush();
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void escreverNoAquivoCurso(ArrayList<Curso> lista) {
        fileCurso = new File("/home/felipe/Documents/Matricula/Arquivos/curso.txt");
        try {
            FileWriter fileWriter = new FileWriter(fileCurso);
            fileWriter.write("Codigo;Nome;CargaHoraria\n");
            for (Curso item : lista) {
                fileWriter.write(item.getCodigo() + ";");
                fileWriter.write(item.getNome() + ";");
                fileWriter.write(item.getCargaHoraria() + ";\n");
            }
            fileWriter.flush();
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void escreverNoAquivoMatricula(ArrayList<Matricula> lista) {
        fileMatricula = new File("/home/felipe/Documents/Matricula/Arquivos/matricula.txt");
        try {
            FileWriter fileWriter = new FileWriter(fileMatricula);
            fileWriter.write("NumeroMatricula;IdAluno;IdCurso\n");
            for (Matricula item : lista) {
                fileWriter.write(item.getNumMatricula() + ";");
                fileWriter.write(item.getIdAluno() + ";");
                fileWriter.write(item.getIdCurso() + ";\n");
            }
            fileWriter.flush();
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void lerDoArquivoAluno(ArrayList<Aluno> lista) {
        fileAluno = new File("/home/felipe/Documents/Matricula/Arquivos/aluno.txt");
        try {
            FileReader fileReader = new FileReader(fileAluno);
            BufferedReader buffered = new BufferedReader(fileReader);
            int cont = 0;
            String linha = buffered.readLine();
            linha = buffered.readLine();
            while (linha != null) {
                Aluno aluno = new Aluno ();
                String[] vetor = linha.split(";");
                aluno.setId(cont);
                aluno.setNome(vetor[1]);
                aluno.setCpf(vetor[2]);
                lista.add(aluno);
                linha = buffered.readLine();
                cont ++;
            }

        } catch (Exception e) {
            System.out.println("Mensagem de erro" + e);
        }

    }

    public static void lerDoArquivoCurso(ArrayList<Curso> lista) {
        fileCurso = new File("/home/felipe/Documents/Matricula/Arquivos/curso.txt");
        try {
            FileReader fileReader = new FileReader(fileCurso);
            BufferedReader buffered = new BufferedReader(fileReader);
            int cont = 0;
            String linha = buffered.readLine();
            linha = buffered.readLine();
            while (linha != null) {
                String[] vetor = linha.split(";");
                int codigo = Integer.parseInt(vetor[0]);
                Curso curso = new Curso ();
                curso.setCodigo(codigo);
                curso.setNome(vetor[1]);
                curso.setCargaHoraria(vetor[2]);
                lista.add(curso);
                linha = buffered.readLine();
                cont ++;
            }
        } catch (Exception e) {
            System.out.println("Mensagem de erro" + e);
        }

    }
    public static void lerDoArquivoMatricula(ArrayList<Matricula> lista) {
        fileCurso = new File("/home/felipe/Documents/Matricula/Arquivos/curso.txt");
        try {
            FileReader fileReader = new FileReader(fileMatricula);
            BufferedReader buffered = new BufferedReader(fileReader);
            int cont = 0;
            String linha = buffered.readLine();
            linha = buffered.readLine();
            while (linha != null) {
                String[] vetor = linha.split(";");
                Matricula matricula = new Matricula ();
                int idAluno = Integer.parseInt(vetor[1]);
                int idCurso = Integer.parseInt(vetor[2]);
                matricula.setNumMatricula(vetor[0]);
                matricula.setIdAluno(idAluno);
                matricula.setIdCurso(idCurso);
                linha = buffered.readLine();
                cont ++;
            }
        } catch (Exception e) {
            System.out.println("Mensagem de erro" + e);
        }

    }

}

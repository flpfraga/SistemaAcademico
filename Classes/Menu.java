/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author felipe
 */
public class Menu {
    
    public void alteraAluno(){
        
        System.out.println("-----------Formulário alteração de dados de alunos");
        System.out.println("-----------Selecione o que deseja alterar---------");
        System.out.println("-----------1. Nome                       ---------");
        System.out.println("-----------2. CPF                        ---------");
        System.out.println("-----------0. Voltar                     ---------");
        
    }
    public void alteraCurso(){
        
        System.out.println("-----------Formulário alteração de dados do cursos");
        System.out.println("-----------Selecione o que deseja alterar---------");
        System.out.println("-----------1. Nome                       ---------");
        System.out.println("-----------2. Carga Horária              ---------");
        System.out.println("-----------3. Código                     ---------");
        System.out.println("-----------0. Voltar                     ---------");
        
    }
    public void painelAluno(){
        
        System.out.println("-----------       Painel do aluno        ---------");
        System.out.println("-----------  Selecione a opção desejada  ---------");
        System.out.println("-----------1. Inserir                    ---------");
        System.out.println("-----------2. Buscar                     ---------");
        System.out.println("-----------3. Imprimir                   ---------");
        System.out.println("-----------4. Alterar                    ---------");
        System.out.println("-----------5. Salvar no Arquivo          ---------");
        System.out.println("-----------6. Carregar Arquivos          ---------");
        System.out.println("-----------0. Voltar                     ---------");
        
    }
    public void painelCurso(){
        
        System.out.println("-----------        Painel cursos         ---------");
        System.out.println("-----------  Selecione a opção desejada  ---------");
        System.out.println("-----------1. Inserir                    ---------");
        System.out.println("-----------2. Buscar                     ---------");
        System.out.println("-----------3. Imprimir                   ---------");
        System.out.println("-----------4. Alterar                    ---------");
        System.out.println("-----------5. Salvar no Arquivo          ---------");
        System.out.println("-----------6. Carregar Arquivos          ---------");
        System.out.println("-----------0. Voltar                     ---------");
        
    }
    public void painelMatricula(){
        
        System.out.println("-----------      Painel matrícula        ---------");
        System.out.println("-----------  Selecione a opção desejada  ---------");
        System.out.println("-----------1. Inserir                    ---------");
        System.out.println("-----------2. Buscar                     ---------");
        System.out.println("-----------3. Imprimir                   ---------");
        System.out.println("-----------4. Salvar no Arquivo          ---------");
        System.out.println("-----------5. Carregar Arquivos          ---------");
        System.out.println("-----------0. Voltar                     ---------");
        
    }
    public void painelBuscaMatricula(){
        
        System.out.println("-----------   Painel busca de matrícula  ---------");
        System.out.println("-----------Buscar por:                   ---------");
        System.out.println("-----------1. Número de matrícula        ---------");
        System.out.println("-----------2. CPF  do aluno              ---------");
        System.out.println("-----------3. Nome do curso              ---------");
        System.out.println("-----------0. Voltar                     ---------");
       
        
    }
    public void painelPrincipal(){
        
        System.out.println("-----------       Painel Principal       ---------");
        System.out.println("-----------Selecione a opção desejada:   ---------");
        System.out.println("-----------1. Painel Aluno               ---------");
        System.out.println("-----------2. Painel Curso               ---------");
        System.out.println("-----------3. Painel de Matrícula        ---------");
        System.out.println("-----------0. Sair                       ---------");
       
        
    }
    
}

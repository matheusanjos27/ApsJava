
package appav1.appav1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
* @Turma: 936 - PROGRAMAÇÃO ORIENTADA A OBJETO 2022/2
*
* @autores:
* Nome completo 1: Matheus Barbosa dos Anjos
* Nome completo 2: Gabriel Costa Peixoto
* Nome completo 3: Gabriel Medrado de Souza
* ...
*/

public class AppAV1 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        List<Aluno> turma = new ArrayList();
        
        System.out.println("App Notas");
        
        FileInputStream arqNotas = new FileInputStream("notaspoo.txt");
        Scanner scanner = new Scanner (arqNotas);        
        do
        {
        String linhaEntrada = scanner.nextLine();
        String[] linhaNome = linhaEntrada.split(":");
        String[] linhaNota = linhaNome[1].split(" ");
        
         Aluno aluno = new Aluno(); 
         
        aluno.nome = linhaNome[0];
        aluno.nota1 = Float.valueOf(linhaNota[1]);
        aluno.nota2 = Float.parseFloat(linhaNota[2]);
        aluno.nota3 = Float.parseFloat(linhaNota[3]);
        aluno.media = aluno.Media(aluno.nota1, aluno.nota2, aluno.nota3);
        aluno.situacao = aluno.Situacao(aluno.media);
        
        turma.add(aluno);
        }while (scanner.hasNext()) ;
                            
        for(Aluno alunos : turma)
        {
            System.out.println(alunos.nome);
            System.out.println(alunos.situacao);
            System.out.println(alunos.media);                   
        }
        
        int turmaSize = turma.size();
        try (FileWriter arqAvalia = new FileWriter ("avaliacaopoo.txt")) {
            for(int i = 0; i < turmaSize; i++)
            {
                Aluno alunos = new Aluno();
                alunos = turma.get(i);
                arqAvalia.write(alunos.nome + ":" + " " + alunos.situacao + " " + alunos.media);
                arqAvalia.write("\r\n");
            }
        }

    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mathe
 */
public class Aluno {
    
    String nome;
    float nota1;
    float nota2;
    float nota3;
    float media;
    String situacao;
    
    public Aluno()
    {
        media = Media(nota1, nota2, nota3);
        situacao = Situacao(media);
    }
    
    public String Situacao(float media)
    {
        if(media >= 7)
        {
            return "APROVADO(A)";
        }
        if(media < 7)
        {
            return "REPROVADO(A)";
        }
        return "Erro";
    }
    
    public float Media(float nota1, float nota2, float nota3)
    {
        if(nota1 > nota2 && nota2 > nota3)
        {
            //CASO NOTA1 E NOTA2 FOREM AS PRINCIPAIS
            return (nota1 + nota2)/2;
        }
        
        if(nota1 > nota2 && nota3 > nota2)
        {
            //CASO NOTA1 E NOTA3 FOREM AS PRINCIPAIS
            return (nota1 + nota3)/2;
        }
        
        if(nota2 > nota1 && nota3 > nota1)
        {
            //CASO NOTA2 E NOTA3 FOREM AS PRINCIPAIS
            return (nota2 + nota3)/2;
        }
        return 0;
    }
        
}



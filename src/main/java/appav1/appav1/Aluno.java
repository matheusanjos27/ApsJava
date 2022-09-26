package appav1.appav1;

public class Aluno {
    
    String nome;
    float nota1;
    float nota2;
    float nota3;
    float media;
    String situacao;
    
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
        
        if(nota1 == nota2 && nota2 == nota3 && nota3 == nota1)
        {
            //CASO AS NOTAS SEJAM IGUAIS
            return (nota1 + nota2)/2;
        }
        
        if(nota1 == nota2 && nota3 < nota1)
        {
            //CASO NOTA1 E NOTA2 FOREM AS PRINCIPAIS
            return (nota1 + nota2)/2;
        }
        
        if(nota1 == nota2 && nota3 < nota2)
        {
            //CASO NOTA1 E NOTA2 FOREM AS PRINCIPAIS
            return (nota1 + nota2)/2;
        }
        
        if(nota1 == nota3 && nota2 < nota1)
        {
             //CASO NOTA1 E NOTA3 FOREM AS PRINCIPAIS
            return (nota1 + nota3)/2;
        }
        
        if(nota1 == nota3 && nota2 < nota3)
        {
             //CASO NOTA1 E NOTA3 FOREM AS PRINCIPAIS
            return (nota1 + nota3)/2;
        }
        
        if(nota2 == nota3 && nota1 < nota2)
        {
             //CASO NOTA2 E NOTA3 FOREM AS PRINCIPAIS
            return (nota2 + nota3)/2;
        }
        
        if(nota2 == nota3 && nota1 < nota3)
        {
            //CASO NOTA2 E NOTA3 FOREM AS PRINCIPAIS
            return (nota2 + nota3)/2;
        }        
        return 0;
    }
        
}




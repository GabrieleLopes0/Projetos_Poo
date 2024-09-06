package Aula4_ADO1.P1;

public class Pessoa 
{
    int idade;
    String genero;
    public Pessoa(int idade, String genero)
    {
         this.idade = idade;
         this.genero = genero;
    }

    public static String verificaIdade(int idade, String genero) 
    {
        if (idade >= 18)
        {
           return "você é maior de idade";
        }
        if (idade < 0)
        {
            return "idade invalida";
        }
        else
        {
            return "você é menor de idade";
        }
    }
}

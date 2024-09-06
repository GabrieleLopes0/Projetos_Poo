package Aula4_ADO1.P3;

public class Aluno 
{
    String nome;
    double nota;
    String curso;

    public Aluno(String nome, double nota, String curso)
    {
         this.nome = nome;
         this.nota = nota;
         this.curso = curso;
    }
    public static String verificaNota(String nome, double nota, String curso) 
    {
        if (nota >= 7)
        {
           return "foi aprovado";
        }
        if (nota < 0)
        {
            return "a nota foi invalida";
        }
        else
        {
            return "foi reprovado";
        }
    }
}

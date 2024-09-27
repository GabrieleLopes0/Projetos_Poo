package Aula7.Ex3;

public class Aluno 
{
    private String nome;
    private int idade;
    private double notaFinal;
    
    public Aluno(String nome, int idade, double notaFinal)
    {
        this.nome = nome;
        this.idade = idade;
        this.notaFinal = notaFinal;
    }
    public void obterInformacoes()
    {
        System.out.println("Os dados do aluno são nome: " + nome + ", idade: " + idade + " e nota final: " + notaFinal);
    }
    public void definirNota(double novaNotaFinal)
    {
        notaFinal = novaNotaFinal;
        System.out.println("A nova nota é " + notaFinal);
    }
    public void foiAprovado()
    {
        if (notaFinal >= 6) 
        {
            System.out.println("O aluno foi aprovado");
        }
        else
        {
            System.out.println("O aluno foi reprovado");
        }
    }    
}

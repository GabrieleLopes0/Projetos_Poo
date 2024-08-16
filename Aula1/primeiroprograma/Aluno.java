package Aula1.primeiroprograma;

public class Aluno 
{
    static String nome = "Gabriele Lopes Silva";
    static int matricula = 54321;
    static double n1 = 10;
    static double n2 = 9;
    static double n3 = 7;
    static double soma;
    static double media;
    public static void main(String[] args) 
    {
        Aluno.calcular_media(n1, n2, n3, soma, media);
    }
    public static void calcular_media(double n1, double n2, double n3, double soma, double media) {
        soma = n1 + n2 + n3;
        media = soma / 3;
        System.out.println("A média das notas do aluno " + nome + " com a matricula " + matricula + " é " + media);
    }
}

package Aula1;

public class Aluno 
{
    static double soma;
    static double media;
    public static void main(String[] args) 
    {
        String nome = "Gabriele Lopes Silva";
        int matricula = 13092004;
        double n1 = 7;
        double n2 = 8;
        double n3 = 9;

        Aluno.calcular_media(n1, n2, n3, soma, media, nome, matricula);
    }
    public static void calcular_media(double n1, double n2, double n3, double soma, double media, String nome, int matricula) {
        soma = n1 + n2 + n3;
        media = soma / 3;
        System.out.println("A média das notas do aluno " + nome + " com a matricula " + matricula + " é " + media);
    }
}

package Aula2;

import java.util.Scanner;

public class Aluno 
{
    static double soma;
    static double media;
    public static void main(String[] args) 
    {
        Scanner nomeScanner = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        String nome = nomeScanner.next();

        Scanner matriculaScanner = new Scanner(System.in);
        System.out.println("Digite a matricula do aluno: ");
        int matricula = matriculaScanner.nextInt();

        Scanner n1Scanner = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        double n1 = n1Scanner.nextDouble();

        Scanner n2Scanner = new Scanner(System.in);
        System.out.println("Digite a segunda nota: ");
        double n2 = n2Scanner.nextDouble();

        Scanner n3Scanner = new Scanner(System.in);
        System.out.println("Digite a terceira nota: ");
        double n3 = n3Scanner.nextDouble();

        nomeScanner.close();
        matriculaScanner.close();
        n1Scanner.close();
        n2Scanner.close();
        n3Scanner.close();

        Aluno.calcular_media(n1, n2, n3, soma, media, nome, matricula);
    }
    public static void calcular_media(double n1, double n2, double n3, double soma, double media, String nome, int matricula) {
        soma = n1 + n2 + n3;
        media = soma / 3;
        System.out.println("A média das notas do aluno " + nome + " com a matricula " + matricula + " é " + media);
    }
}

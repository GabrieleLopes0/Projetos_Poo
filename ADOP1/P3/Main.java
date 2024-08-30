package ADOP1.P3;

import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner nomeScanner = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        String nome = nomeScanner.next();

        Scanner notaScanner = new Scanner(System.in);
        System.out.println("Digite a nota do aluno: ");
        double nota = notaScanner.nextDouble();

        Scanner cursoScanner = new Scanner(System.in);
        System.out.println("Digite o nome do curso: ");
        String curso = cursoScanner.next();

        nomeScanner.close();
        notaScanner.close();
        cursoScanner.close();

        Aluno aluno1 = new Aluno (nome, nota, curso);

        System.out.println("O aluno " + nome + " do curso " + curso + " " + aluno1.verificaNota(nome, nota, curso));
    }
}

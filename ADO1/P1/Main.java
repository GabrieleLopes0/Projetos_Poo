package ADOP1.P1;

import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner idadeScanner = new Scanner(System.in);
        System.out.println("Digite a sua idade: ");
        int idade = idadeScanner.nextInt();

        Scanner generoScanner = new Scanner(System.in);
        System.out.println("Digite o seu genero: ");
        String genero = generoScanner.next();

        idadeScanner.close();
        generoScanner.close();

        Pessoa pessoa1 = new Pessoa(idade, genero);

        System.out.println("A pessoa do genero " + genero + " é considerada " + pessoa1.verificaIdade(idade, genero));
    }

}

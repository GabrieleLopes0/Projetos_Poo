package Aula4_ADO1.P2;

import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner nomeScanner = new Scanner(System.in);
        System.out.println("Digite o nome do produto: ");
        String nome = nomeScanner.next();

        Scanner precoScanner = new Scanner(System.in);
        System.out.println("Digite o preco do produto: ");
        double preco = precoScanner.nextDouble();

        Scanner categoriaScanner = new Scanner(System.in);
        System.out.println("Digite a categoria do produto: ");
        String categoria = categoriaScanner.next();

        nomeScanner.close();
        precoScanner.close();
        categoriaScanner.close();

        Produto produto1 = new Produto(nome, preco, categoria);

       System.out.println("Sobre a sua compra de " + nome + " da categoria " + categoria + produto1.verificaDesconto(nome, preco, categoria));
    }
}

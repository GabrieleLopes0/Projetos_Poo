package Aula2;

import java.util.Scanner;

public class Produto 
{
    static double valor_estoque;
    public static void main(String[] args) 
    {
        Scanner nomeScanner = new Scanner(System.in);
        System.out.println("Digite o nome do produto: ");
        String nome = nomeScanner.next();

        Scanner precoScanner = new Scanner(System.in);
        System.out.println("Digite o preço: ");
        double preco = precoScanner.nextDouble();

        Scanner estoqueScanner = new Scanner(System.in);
        System.out.println("Digite a quantidade do estoque: ");
        int estoque = estoqueScanner.nextInt();

        nomeScanner.close();
        precoScanner.close();
        estoqueScanner.close();
        
        Produto.valor_estoque(preco, estoque, valor_estoque, nome);
    }
    public static void valor_estoque(double preco, int estoque, double valor_estoque, String nome) 
    {
        if (estoque <= 0)
        {
            System.out.println("Não é possível efetuar a compra, pois não há esoque o suficiente");
        }
        else
        {
            valor_estoque = estoque * preco;
            System.out.println("O valor em estoque do produto " + nome + " é de " + valor_estoque);
        }
    }
}

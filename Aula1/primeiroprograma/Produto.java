package Aula1.primeiroprograma;

public class Produto 
{
    static String nome = "Copo";
    static double preco = 5;
    static int estoque = 0;
    static double valor_estoque;
    public static void main(String[] args) 
    {
        Produto.valor_estoque(preco, estoque, valor_estoque);
    }
    public static void valor_estoque(double preco, int estoque, double valor_estoque) 
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

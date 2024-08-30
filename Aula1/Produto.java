package Aula1;

public class Produto 
{
    static double valor_estoque;
    public static void main(String[] args) 
    {
        String nome = "Copo";
        double preco = 5;
        int estoque = 10;

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

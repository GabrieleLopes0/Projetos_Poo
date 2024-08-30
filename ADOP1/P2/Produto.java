package ADOP1.P2;

public class Produto 
{
    String nome;
    Double preco;
    String categoria;
    public Produto(String nome, Double preco, String categoria)
    {
         this.nome = nome;
         this.preco = preco;
         this.categoria = categoria;
    }
    public static String verificaDesconto(String nome, Double preco, String categoria) 
    {
        if (preco <= 100)
        {
           return " você não tem direito a desconto pelo valor não ser maior que 100 reais";
        }
        if (preco < 0)
        {
            return " o valor é invalido";
        }
        else
        {
            double desc = preco * 0.1;
            double valordesc = preco - desc;
            
            return " seu produto teve direito a 10% de desconto totalizando " + valordesc;
        }
    }
}

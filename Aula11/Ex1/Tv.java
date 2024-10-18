package Aula11.Ex1;

class Tv extends Produto 
{
    public Tv(String modelo, String marca, double preco) 
    {
        super(modelo, marca, preco);
    }

    @Override
    public double calcularPrecoFinal() 
    {
        return preco * 0.85;
    }
}

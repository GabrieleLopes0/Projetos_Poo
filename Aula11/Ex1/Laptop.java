package Aula11.Ex1;

class Laptop extends Produto 
{
    public Laptop(String modelo, String marca, double preco) 
    {
        super(modelo, marca, preco);
    }

    @Override
    public double calcularPrecoFinal() 
    {
        return preco * 0.9; 
    }
}
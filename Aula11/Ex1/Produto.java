package Aula11.Ex1;

class Produto 
{
    protected String modelo;
    protected String marca;
    protected double preco;

    public Produto(String modelo, String marca, double preco) 
    {
        this.modelo = modelo;
        this.marca = marca;
        this.preco = preco;
    }
    public double calcularPrecoFinal() 
    {
        return preco;
    }
}


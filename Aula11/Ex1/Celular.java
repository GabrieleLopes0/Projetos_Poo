package Aula11.Ex1;

class Celular extends Produto {
    public Celular(String modelo, String marca, double preco) 
    {
        super(modelo, marca, preco);
    }

    @Override
    public double calcularPrecoFinal() 
    {
        return preco * 0.95; 
    }
}

package Aula11.Ex2;

class DVD extends Material
{
    public DVD(String titulo, String autorDesenvolvedor, Double precoBase, int dias)
    {
        super(titulo, autorDesenvolvedor, precoBase, dias);
    }

    public double calcularPrecoEmprestimo(int dias, double precoBase)
    {
        return dias * precoBase;
    }
}

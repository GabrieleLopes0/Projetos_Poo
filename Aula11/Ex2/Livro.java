package Aula11.Ex2;

class Livro extends Material
{
    public Livro(String titulo, String autorDesenvolvedor, Double precoBase, int dias)
    {
        super(titulo, autorDesenvolvedor, precoBase, dias);
    }

    public double calcularPrecoEmprestimo(int dias, double precoBase)
    {
        return dias * precoBase;
    }
}

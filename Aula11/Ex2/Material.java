package Aula11.Ex2;

class Material 
{
    protected String titulo;
    protected String autorDesenvolvedor;
    protected Double precoBase;
    protected int dias;

    public Material(String titulo, String autorDesenvolvedor, Double precoBase, int dias )
    {
        this.titulo = titulo;
        this.autorDesenvolvedor = autorDesenvolvedor;
        this.precoBase = precoBase;
        this.dias = dias;
    }
    public double calcularPrecoEmprestimo(int dias)
    {
        return dias;
    }
}

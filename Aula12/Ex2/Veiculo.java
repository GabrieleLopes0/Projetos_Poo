package Aula12.Ex2;

public abstract class Veiculo
{
    private String modelo;
    private String marca;
    private double capacidade;

    public Veiculo (String modelo, String marca, double capacidade)
    {
        this.modelo = modelo;
        this.marca = marca;
        this.capacidade = capacidade;
    }

    public String getmodelo()
    {
        return modelo;
    }
    public String getmarca()
    {
        return marca;
    }
    public double getcapacidade()
    {
        return capacidade;
    }
    public void calcularAutonomia()
    {
    }
}

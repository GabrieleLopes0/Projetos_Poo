package Aula12.Ex2;

class Carro extends Veiculo
{
    private double litroKmCarro;
    public Carro(String modelo, String marca, double capacidade, double litroKmCarro)
    {
            super(modelo, marca, capacidade);
            this.litroKmCarro = litroKmCarro;
    } 
    public double getlitroKm() 
    {
        return litroKmCarro;
    }

    public void setlitroKm() 
    {
        this.litroKmCarro = litroKmCarro;
    }

    public double calcularAutonomia(double capacidade, double litroKmCarro)
    {
        return capacidade / litroKmCarro;
    }
}

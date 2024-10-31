package Aula12.Ex2;

class Moto extends Veiculo
{
    private double litroKm;
    public Moto(String modelo, String marca, double capacidade, double litroKm)
    {
            super(modelo, marca, capacidade);
            this.litroKm = litroKm;
    } 
    public double getlitroKm() 
    {
        return litroKm;
    }

    public void setlitroKm() 
    {
        this.litroKm = litroKm;
    }

    public double calcularAutonomia(double capacidade, double litroKm)
    {
        return capacidade / litroKm;
    }
}
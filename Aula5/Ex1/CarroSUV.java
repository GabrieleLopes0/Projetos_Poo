package Aula5.Ex1;

class CarroSUV extends Carro
{
    int capacidadePassageiros;
    double capacidadePortaMalas;

    public CarroSUV(String marca, String modelo, int ano, int capacidadePassageiros, double capacidadePortaMalas)
    {
        super(marca, modelo, ano);
        this.capacidadePassageiros = capacidadePassageiros;
        this.capacidadePortaMalas = capacidadePortaMalas;
    }
    public void exibirDetalhes()
    {
        System.out.println("Carro Esportivo: " + marca + ", Modelo: " + modelo + ", Ano: " + ano + ", Capacidade de Passageiros: " + capacidadePassageiros + ", Capacidade do Porta Malas: " + capacidadePortaMalas + " litros");
    }
}
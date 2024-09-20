package Aula5.Ex1;

class CarroEsportivo extends Carro
{
    int velocidadeMaxima;
    double zeroACem;

    public CarroEsportivo(String marca, String modelo, int ano, int velocidadeMaxima, double zeroACem)
    {
        super(marca, modelo, ano);
        this.velocidadeMaxima = velocidadeMaxima;
        this.zeroACem = zeroACem;
    }
    public void exibirDetalhes()
    {
        System.out.println("Carro Esportivo: " + marca + ", Modelo: " + modelo + ", Ano: " + ano + ", Velocidade Maxima: " + velocidadeMaxima + " km/h" + ", Tempo de Aceleração indo até 100km: " + zeroACem + " segundos");
    }
}

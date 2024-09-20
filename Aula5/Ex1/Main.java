package Aula5.Ex1;

public class Main 
{
    public static void main(String[] args)
    {
        CarroEsportivo carroEsportivo = new CarroEsportivo
        (
            "Ferrari", "F8 Tributo", 2022, 340, 2.9
        );
        CarroSUV carroSUV = new CarroSUV
        (
            "Toyota", "Higlander", 2021, 7, 456
        );
        carroEsportivo.exibirDetalhes();
        carroSUV.exibirDetalhes();
    }
}

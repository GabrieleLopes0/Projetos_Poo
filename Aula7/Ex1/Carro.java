package Aula7.Ex1;

public class Carro 
{
    private String marca;
    
    private String modelo;
    
    private int anoFabricacao;

    public Carro(String marca, String modelo, int anoFabricacao)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
    }
    public void obterInformacoes()
    {
        System.out.println("Os dados do carro são marca: " + marca + ", modelo: " + modelo + " e ano de fabricação: " + anoFabricacao);
    }
    public void definirMarca(String novaMarca)
    {
        marca = novaMarca;
        System.out.println("A nova marca é " + novaMarca);
    }
    public void ehAntigo()
    {
        if (anoFabricacao < 2000) 
        {
            System.out.println("Este carro é antigo");
        }
        else
        {
            System.out.println("Este carro é novo");
        }
    }
}

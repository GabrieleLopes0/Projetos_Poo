package Aula7.Ex1;

public class Main 
{
    public static void main(String[] args) 
    {
        Carro carro = new Carro("Fiat", "Uno", 1994);
        
        carro.obterInformacoes();
        carro.ehAntigo();
        carro.definirMarca("Com escada");
    }
}

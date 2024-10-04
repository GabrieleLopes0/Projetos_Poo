package Aula9.Ex1;

public class Main 
{
    public static void main(String[] args) 
    {
        
        Cachorro cachorro = new Cachorro("Rex");
        Passaro passaro = new Passaro("Tweety");

        cachorro.emitirSom();  
        cachorro.locomover();  
        cachorro.adotar();     

        passaro.emitirSom();   
        passaro.locomover();   
    }
}

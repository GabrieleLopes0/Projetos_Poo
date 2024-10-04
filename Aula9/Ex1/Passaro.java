package Aula9.Ex1;

public class Passaro extends Animal
{
    public Passaro(String nome) 
    {
        super(nome);
    }
    
    @Override
    public void locomover() 
    {
        System.out.println(getNome() + " está voando!");
    }

}

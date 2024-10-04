package Aula9.Ex1;

public class Cachorro extends Animal implements Adotavel
{
    public Cachorro(String nome) 
    {
        super(nome);
    }

    @Override
    public void locomover() 
    {
        System.out.println(getNome() + " está correndo!");
    }
    
    @Override
    public void adotar() 
    {
        System.out.println(getNome() + " foi adotado!");
    }
}

package Aula9.Ex1;

public abstract class Animal 
{
    private String nome;

    public Animal(String nome) 
    {
        this.nome = nome;
    }

    public abstract void locomover();
    
    public void emitirSom() 
    {
        System.out.println(nome + " está emitindo som!");
    }

    public String getNome() 
    {
        return nome;
    }
}

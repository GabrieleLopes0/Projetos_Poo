package Aula7.Ex2;

public class Main 
{
    public static void main(String[] args) 
    {
        Livro livro = new Livro("A Era dos Mortos","Rodrigo de Oliveria", 2018);

        livro.obterInformacoes();
        livro.ehClassico();
        livro.definirAutor("R.Oliveira");
    }
}

package Aula7.Ex2;

public class Livro 
{
    private String titulo;
    private String autor;
    private int anoPublicacao;
    
    public Livro(String titulo, String autor, int anoPublicacao)
    {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }
    public void obterInformacoes()
    {
        System.out.println("Os dados do livro são titulo: " + titulo + ", autor: " + autor + " e ano de publicação: " + anoPublicacao);
    }
    public void definirAutor(String novoAutor)
    {
        autor = novoAutor;
        System.out.println("O novo autor é " + autor);
    }
    public void ehClassico()
    {
        if (anoPublicacao < 1974) 
        {
            System.out.println("Este livro é classico");
        }
        else
        {
            System.out.println("Este livro é novo");
        }
    }
}

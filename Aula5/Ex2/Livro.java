package Aula5.Ex2;

class Livro extends ItemBiblioteca
{
    int numeroPaginas;
    String editora;

    public Livro(String titulo, String autor, int anoPublicacao, int numeroPaginas, String editora)
    {
        super(titulo, autor, anoPublicacao);
        this.numeroPaginas = numeroPaginas;
        this.editora = editora;
    }
    public void exibirDetalhes()
    {
        System.out.println("Titulo: " + titulo + ", Autor: " + autor + ", Ano de Publicação: " + anoPublicacao + ", Numero de Páginas: " + numeroPaginas + ", Editora: " + editora);
    }
}

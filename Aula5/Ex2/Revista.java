package Aula5.Ex2;

class Revista extends ItemBiblioteca
{
    int edicao;
    String mêsPublicacao;

    public Revista(String titulo, String autor, int anoPublicacao, int edicao, String mêsPublicacao)
    {
        super(titulo, autor, anoPublicacao);
        this.edicao = edicao;
        this.mêsPublicacao = mêsPublicacao;
    }
    public void exibirDetalhes()
    {
        System.out.println("Titulo: " + titulo + ", Autor: " + autor + ", Ano de Publicação: " + anoPublicacao + ", Edição: " + edicao + ", Mês de Publocação: " + mêsPublicacao);
    }
}

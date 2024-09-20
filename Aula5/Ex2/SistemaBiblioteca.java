package Aula5.Ex2;
import java.util.Scanner;

public class SistemaBiblioteca 
{
    public static void main(String[] args)
    {
        Scanner tituloScanner = new Scanner(System.in);
        System.out.println("Digite o titulo do livro: ");
        String titulo = tituloScanner.next();

        Scanner autorScanner = new Scanner(System.in);
        System.out.println("Digite o autor do livro: ");
        String autor = autorScanner.next();

        Scanner anoPublicacaoScanner = new Scanner(System.in);
        System.out.println("Digite o ano de publicação do livro: ");
        int anoPublicacao = anoPublicacaoScanner.nextInt();

        Scanner titulo2Scanner = new Scanner(System.in);
        System.out.println("Digite o titulo da revista: ");
        String titulo2 = titulo2Scanner.next();

        Scanner autor2Scanner = new Scanner(System.in);
        System.out.println("Digite o autor da revista: ");
        String autor2 = autor2Scanner.next();

        Scanner anoPublicacao2Scanner = new Scanner(System.in);
        System.out.println("Digite o ano de publicação da revista: ");
        int anoPublicacao2 = anoPublicacao2Scanner.nextInt();

        Scanner numeroPaginasScanner = new Scanner(System.in);
        System.out.println("Digite o numero de páginas do livro: ");
        int numeroPaginas = numeroPaginasScanner.nextInt();

        Scanner editoraScanner = new Scanner(System.in);
        System.out.println("Digite a editora do livro: ");
        String editora = editoraScanner.next();

        Scanner edicaoScanner = new Scanner(System.in);
        System.out.println("Digite a edição da revista: ");
        int edicao = edicaoScanner.nextInt();

        Scanner mesPublicacaoScanner = new Scanner(System.in);
        System.out.println("Digite o mês de publicação da revista: ");
        String mesPublicacao = mesPublicacaoScanner.next();

        tituloScanner.close();
        autorScanner.close();
        anoPublicacaoScanner.close();
        numeroPaginasScanner.close();
        editoraScanner.close();
        edicaoScanner.close();
        mesPublicacaoScanner.close();
        titulo2Scanner.close();
        autor2Scanner.close();
        anoPublicacao2Scanner.close();

        Livro livro = new Livro
        (
            titulo, autor, anoPublicacao, numeroPaginas, editora
        );
        Revista revista = new Revista
        (
            titulo2, autor2, anoPublicacao2, edicao, mesPublicacao
        );
        livro.exibirDetalhes();
        revista.exibirDetalhes();
    }
}

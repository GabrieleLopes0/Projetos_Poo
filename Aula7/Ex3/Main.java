package Aula7.Ex3;
public class Main 
{
    public static void main(String[] args) 
    {
        Aluno aluno = new Aluno("Gabriele", 20, 10);

        aluno.obterInformacoes();
        aluno.foiAprovado();
        aluno.definirNota(9);
    }
}

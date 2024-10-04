package Aula9.Ex2;
import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.print("Digite o nome do aluno: ");
        aluno.setNome(sc.nextLine());

        System.out.print("Digite a idade do aluno: ");
        aluno.setIdade(sc.nextInt());

        sc.nextLine();  
        System.out.print("Digite a matrícula do aluno: ");
        aluno.setMatricula(sc.nextLine());

        sc.close();
        
        System.out.println("\nDados do Aluno:");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Idade: " + aluno.getIdade());
        System.out.println("Matrícula: " + aluno.getMatricula());
    }
}

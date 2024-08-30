package Aula1;

public class Funcionario 
{
    public static void main(String[] args) 
    {
        String nome = "Gabriele Lopes Silva";
        String cargo = "Funcionario";
        double salario = 1500;
        double descVt = 80;
        double descVr = 50;
        double descINSS = 100;
        double salariodesc = 0;

        Funcionario.calcular_salarioliquido(salario, descVt, descVr, descINSS, salariodesc, nome, cargo);
    }
    public static void calcular_salarioliquido(double salario, double descVt, double descVr, double descINSS, double salariodesc, String nome, String cargo) 
    {
        salariodesc = salario - descVt - descVr - descINSS ;
        System.out.println("O salario descontado do funcionario " + nome + " com o cargo " + cargo + " é " + salariodesc);
    }
}

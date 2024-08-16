package Aula1.primeiroprograma;

public class Funcionario 
{
    static String nome = "Gabriele Lopes Silva";
    static double salario = 1500;
    static String cargo = "Desenvolvedor";
    static double descVt = 80;
    static double descVr = 50;
    static double descINSS = 100;
    static double salariodesc;
    public static void main(String[] args) 
    {
        Funcionario.calcular_salarioliquido(salario, descVt, descVr, descINSS, salariodesc);
    }
    public static void calcular_salarioliquido(double salario, double descVt, double descVr, double descINSS, double salariodesc) 
    {
        salariodesc = salario - descVt - descVr - descINSS ;
        System.out.println("O salario descontado do funcionario " + nome + " com o cargo " + cargo + " é " + salariodesc);
    }
}

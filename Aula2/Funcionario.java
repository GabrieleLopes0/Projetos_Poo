package Aula2;

import java.util.Scanner;

public class Funcionario 
{
    public static void main(String[] args) 
    {
        Scanner nomeScanner = new Scanner(System.in);
        System.out.println("Digite o nome do funcionario: ");
        String nome = nomeScanner.next();

        Scanner cargoScanner = new Scanner(System.in);
        System.out.println("Digite o cargo do funcionario: ");
        String cargo = cargoScanner.next();

        Scanner salarioScanner = new Scanner(System.in);
        System.out.println("Digite o salario do funcionario: ");
        double salario = salarioScanner.nextDouble();

        Scanner descVtScanner = new Scanner(System.in);
        System.out.println("Digite o desconto do VT: ");
        double descVt = descVtScanner.nextDouble();

        Scanner descVrScanner = new Scanner(System.in);
        System.out.println("Digite o desconto do VR: ");
        double descVr = descVrScanner.nextDouble();

        Scanner descINSSScanner = new Scanner(System.in);
        System.out.println("Digite o desconto do INSS: ");
        double descINSS = descINSSScanner.nextDouble();

        nomeScanner.close();
        cargoScanner.close();
        salarioScanner.close();
        descVtScanner.close();
        descVrScanner.close();
        descINSSScanner.close();


        double salariodesc = 0;

        Funcionario.calcular_salarioliquido(salario, descVt, descVr, descINSS, salariodesc, nome, cargo);
    }
    public static void calcular_salarioliquido(double salario, double descVt, double descVr, double descINSS, double salariodesc, String nome, String cargo) 
    {
        salariodesc = salario - descVt - descVr - descINSS ;
        System.out.println("O salario descontado do funcionario " + nome + " com o cargo " + cargo + " é " + salariodesc);
    }
}

package Aula2;

import java.util.Scanner;

public class ContaBancaria 
{
    public static void main(String[] args) 
    {
        Scanner titularScanner = new Scanner(System.in);
        System.out.println("Digite o nome do titular: ");
        String titular = titularScanner.next();

        Scanner numero_contaScanner = new Scanner(System.in);
        System.out.println("Digite o numero da conta: ");
        int numero_conta = numero_contaScanner.nextInt();

        Scanner saldoScanner = new Scanner(System.in);
        System.out.println("Digite o seu saldo: ");
        double saldo = saldoScanner.nextDouble();

        Scanner depositoScanner = new Scanner(System.in);
        System.out.println("Digite o valor do seu deposito: ");
        double deposito = depositoScanner.nextDouble();

        Scanner saqueScanner = new Scanner(System.in);
        System.out.println("Digite o valor do seu saque: ");
        double saque = saqueScanner.nextDouble();

        titularScanner.close();
        numero_contaScanner.close();
        saldoScanner.close();
        depositoScanner.close();
        saqueScanner.close();

        double saldof = 0;

        ContaBancaria.depositar(saldo, saldof, deposito, numero_conta, titular);
        ContaBancaria.sacar(saldo, saldof, saque, numero_conta, titular);
    }
    public static void depositar (double saldo, double saldof, double deposito, int numero_conta, String titular)
    {
        saldof = saldo + deposito;
        System.out.println("O valor de saldo na conta " + numero_conta + " do titular " + titular + " após o deposito é de " + saldof);
    }
    public static void sacar (double saldo, double saldof,double saque, int numero_conta, String titular)
    {

        saldof = saldo - saque;
        if (saldof<0) 
        {
            System.out.println("Não é possivel realizar o saque valor da conta inferior");
        }
        else
        {
        System.out.println("O valor de saldo na conta " + numero_conta + " do titular " + titular + " após o saque é de " + saldof);
        }
    }
}
    


package Aula1.primeiroprograma;

public class ContaBancaria 
{
    static int numero_conta = 123456;
    static String titular = "Gabriele Lopes Silva";
    static double saldo = 20.00;
    public static void main(String[] args) 
    {
        double saldof = 20.00;
        ContaBancaria.depositar(saldo, saldo, saldof);
        ContaBancaria.sacar(saldof, saldof, saldof);
    }
    public static void depositar (double saldo, double deposito, double saldof)
    {
        deposito = 10.00;
        saldof = saldo + deposito;
        System.out.println("O valor de saldo na conta " + numero_conta + "do titular " + titular + "após o deposito é de " + saldof);
    }
    public static void sacar (double saldo, double saque, double saldof)
    {
        saque = 10.00;
        saldof = saldo - saque;
        if (saldof<0) 
        {
            System.out.println("Não é possivel realizar o saque valor da conta inferior");
        }
        else
        {
        System.out.println("O valor de saldo na conta " + numero_conta + "do titular " + titular + "após o saque é de " + saldof);
        }
    }
}
    


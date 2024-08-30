package Aula1;

public class ContaBancaria 
{
    public static void main(String[] args) 
    {
        String titular = "Gabriele Lopes Silva";
        int numero_conta = 13092004;
        double saldo = 30;
        double deposito = 20;
        double saque = 10;
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
    


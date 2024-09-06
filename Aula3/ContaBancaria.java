package Aula3;

public class ContaBancaria 
{
    int numero_conta;
    double saldo;

    public ContaBancaria ( int numero_conta, double saldo)
    {
        this.numero_conta = numero_conta;
        this.saldo = saldo;
    }
    public String verificaConta(int numeroConta, double saldo) {
        return "Número da Conta: " + numeroConta + ", Saldo: " + saldo;
    }
}
    


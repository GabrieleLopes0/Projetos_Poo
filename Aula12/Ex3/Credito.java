package Aula12.Ex3;

class Credito extends Cartao
{
    private double saldo;
    private double saldoCartao;
    private double valorCompra;
    public Credito(int numero, double saldo, double valorCompra,  double saldoCartao)
    {
            super(numero);
            this.saldo = saldo;
            this.valorCompra = valorCompra;
            this.saldoCartao = saldoCartao;
    } 
    public double getsaldo() 
    {
        return saldo;
    }

    public void setsaldo() 
    {
        this.saldo = saldo;
    }

    public double getvalorCompra() 
    {
        return valorCompra;
    }

    public void setvalorCompra() 
    {
        this.valorCompra = valorCompra;
    }
    public double getsaldoCartao() 
    {
        return saldoCartao;
    }

    public void setsaldoCartao() 
    {
        this.saldoCartao = saldoCartao;
    }
    public String processarPagamento(double saldo, double valorCompra, double saldoCartao)
    {
        if (valorCompra <= 0) 
        {
            return "O valor da compra é inválido";
        }
        else if (valorCompra > saldoCartao)
        {
            return "Não foi possível realizar a compra, saldo do cartão insuficiente";
        }
        else
        {
            return "Compra aprovada, seu saldo na conta atual é " + saldo + "reais, seu saldo no cartão é " + (saldoCartao - valorCompra) + "reais";
        }
    }
}
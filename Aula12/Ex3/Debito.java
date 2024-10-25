package Aula12.Ex3;

class Debito extends Cartao
{
    private double saldo;
    private double valorCompra;
    public Debito(int numero, double saldo, double valorCompra )
    {
            super(numero);
            this.saldo = saldo;
            this.valorCompra = valorCompra;
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
    public String processarPagamento(double saldo, double valorCompra)
    {
        if (valorCompra <= 0) 
        {
            return "O valor da compra é inválido";
        }
        else if (valorCompra > saldo)
        {
            return "Não foi possível realizar a compra, saldo insuficiente";
        }
        else
        {
            return "Compra aprovada, seu saldo atual é " + saldo;
        }
    }
}
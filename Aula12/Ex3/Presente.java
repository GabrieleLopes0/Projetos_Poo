package Aula12.Ex3;

class Presente extends Cartao
{
    private double saldo;
    private double valorPresente;
    public Presente(int numero, double saldo, double valorPresente )
    {
            super(numero);
            this.saldo = saldo;
            this.valorPresente = valorPresente;
    } 
    public double getsaldo() 
    {
        return saldo;
    }

    public void setsaldo() 
    {
        this.saldo = saldo;
    }

    public double getvalorPresente() 
    {
        return valorPresente;
    }

    public void setvalorPresente() 
    {
        this.valorPresente = valorPresente;
    }
    public String processarPagamento(int numero, double saldo, double valorPresente)
    {
        return "Seu valor de presente no cartão" + numero + " é de " + valorPresente + " reais foi utilizado, seu saldo ainda permanecerá " + saldo + " reais";
    }
}

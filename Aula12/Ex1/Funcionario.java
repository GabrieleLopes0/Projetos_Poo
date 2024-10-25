
public abstract class Funcionario 
{
    private String nome;
    private double salarioBase;

    public Funcionario (String nome, double salarioBase)
    {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getnome()
    {
        return nome;
    }
    public double getsalarioBase()
    {
        return salarioBase;
    }
    public void calcularSalario()
    {
    }
}

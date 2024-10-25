class Estagiario extends Funcionario
{
    private double descEstagiario;
    public Estagiario(String nome, double salarioBase, double descEstagiario)
    {
            super(nome, salarioBase);
            this.descEstagiario = descEstagiario;
    } 
    public double getdescEstagiario() 
    {
        return descEstagiario;
    }

    public void setdescEstagiario() 
    {
        this.descEstagiario = descEstagiario;
    }

    public double calcularSalario(double salarioBase, double descEstagiario)
    {
        return salarioBase - descEstagiario;
    }
}

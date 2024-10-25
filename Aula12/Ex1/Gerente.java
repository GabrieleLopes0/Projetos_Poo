class Gerente extends Funcionario
{
    private double descGerente;
    public Gerente(String nome, double salarioBase, double descGerente)
    {
            super(nome, salarioBase);
            this.descGerente = descGerente;
    } 
    public double getdescGerente() 
    {
        return descGerente;
    }

    public void setdescGerente() 
    {
        this.descGerente = descGerente;
    }

    
    public double calcularSalario(double salarioBase, double descGerente)
    {
        return salarioBase - descGerente;
    }
}

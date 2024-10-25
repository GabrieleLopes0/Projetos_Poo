class Analista extends Funcionario
{
    private double descAnalista;
    public Analista(String nome, double salarioBase, double descAnalista)
    {
            super(nome, salarioBase);
            this.descAnalista = descAnalista;
    } 
    public double getdescAnalista() 
    {
        return descAnalista;
    }

    public void setdescAnalista() 
    {
        this.descAnalista = descAnalista;
    }
    
    public double calcularSalario(double salarioBase, double descAnalista)
    {
        return salarioBase - descAnalista;
    }
}

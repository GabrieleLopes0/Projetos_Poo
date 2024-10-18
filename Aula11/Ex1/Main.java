package Aula11.Ex1;

public class Main 
{
    public static void main(String[] args) 
    {

        Tv tv = new Tv("X900H", "Sony", 2000);
        Laptop laptop = new Laptop("Inspiron", "Dell", 1500);
        Celular smartphone = new Celular("Redmi 12C", "Xiomi", 1000);
        System.out.println("Preço final da TV: $" + tv.calcularPrecoFinal());
        System.out.println("Preço final do Laptop: $" + laptop.calcularPrecoFinal());
        System.out.println("Preço final do Smartphone: $" + smartphone.calcularPrecoFinal());
    }             
}


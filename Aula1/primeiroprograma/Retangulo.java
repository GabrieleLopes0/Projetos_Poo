package Aula1.primeiroprograma;

public class Retangulo 
{
    static int largura = 5;
    static int altura = 4;
    public static void main(String[] args) {
        double area = 0;
        double perimetro = 0;
  
        Retangulo.calcular_area(largura, altura, area);
        Retangulo.calcular_perimetro(largura, altura, perimetro);
    }
    public static void calcular_area(int largura, int altura, double area) {
        area = largura * altura;
        System.out.println("A área calculada com base nos dados inseridos é " + area);
    }

    public static void calcular_perimetro(int largura, int altura, double perimetro) {
        perimetro = (2 * largura) + (2 * altura);
        System.out.println("O perímetro calculado com base nos dados inseridos é " + perimetro);
    }
}

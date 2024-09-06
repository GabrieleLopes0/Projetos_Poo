package Aula2;

import java.util.Scanner;

public class Retangulo 
{
    public static void main(String[] args) {

        Scanner larguraScanner = new Scanner(System.in);
        System.out.println("Digite a largura do retângulo: ");
        double largura = larguraScanner.nextDouble();

        Scanner alturaScanner = new Scanner(System.in);
        System.out.println("Digite a altura do retângulo: ");
        double altura = alturaScanner.nextDouble();

        larguraScanner.close();
        alturaScanner.close();

        double area = 0;
        double perimetro = 0;
  
        Retangulo.calcular_area(largura, altura, area);
        Retangulo.calcular_perimetro(largura, altura, perimetro);
    }
    public static void calcular_area(double largura, double altura, double area) {
        area = largura * altura;
        System.out.println("A área calculada com base nos dados inseridos é " + area);
    }

    public static void calcular_perimetro(double largura, double altura, double perimetro) {
        perimetro = (2 * largura) + (2 * altura);
        System.out.println("O perímetro calculado com base nos dados inseridos é " + perimetro);
    }
}

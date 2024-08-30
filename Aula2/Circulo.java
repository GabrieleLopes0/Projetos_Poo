package Aula2;

import java.util.Scanner;

public class Circulo {

    static double pi = 3.14;

    public static void main(String[] args) {

        Scanner raioScanner = new Scanner(System.in);
        System.out.println("Digite o raio do circulo nota: ");
        double raio = raioScanner.nextDouble();
        
        System.out.println("PI sempre será considerado 3,14");

        raioScanner.close();


        double area = 0;
        double perimetro = 0;
  
        Circulo.calcular_area(raio, pi, area);
        Circulo.calcular_perimetro(raio, pi, perimetro);
    }
    public static void calcular_area(double raio, double pi, double area) {
        area = pi * (Math.pow(raio, 2));
        System.out.println("A área calculada com base neste raio é " + area);
    }

    public static void calcular_perimetro(double raio, double pi, double perimetro) {
        perimetro = 2 * pi * raio;
        System.out.println("O perímetro calculado com base neste raio é " + perimetro);
    }

}

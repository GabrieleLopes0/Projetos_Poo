package Aula2;

import java.util.Scanner;

public class Calculadora
{
    public static void main(String[] args) {

        Scanner operacaoScanner = new Scanner(System.in);
        System.out.println("Digite a operação desejada, x -> multiplicação, / -> divisão, + -> adição, - -> subtração: ");
        String operacao = operacaoScanner.next();

        Scanner n1Scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        double n1 = n1Scanner.nextDouble();

        Scanner n2Scanner = new Scanner(System.in);
        System.out.println("Digite o segundo numero: ");
        double n2 = n2Scanner.nextDouble();

        operacaoScanner.close();
        n1Scanner.close();
        n2Scanner.close();

        double resultado = 0;
  
        Retangulo.calcular_resultado(operacao, n1, n2);
    }
    
    public static void calcular_resultado(String operacao, double n1, double n2) 
    {
        
    }
}
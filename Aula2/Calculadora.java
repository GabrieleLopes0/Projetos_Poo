package Aula2;
import java.util.Scanner;
public class Calculadora 
{
    static double resultado;
    public static void main(String[] args) 
    {
        Scanner operacaoScanner = new Scanner(System.in);
        System.out.println("Digite a operação desejada sendo x -> multiplicação, / -> divisão, + -> adição e - -> subtração: ");
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
        Calculadora.calculadora(operacao, n1, n2, resultado);
    }

    public static void calculadora(String operacao, double n1, double n2, double resultado) 
    {
        if(operacao.equals("x")) 
        {
            resultado = n1 * n2;
            System.out.println("A multiplicação de " + n1 + " e " + n2 + " é igual a " + resultado);
        } 
        else if(operacao.equals("/"))
        {
            resultado = n1 / n2;
            System.out.println("A divisão de " + n1 + " e " + n2 + " é igual a " + resultado);
        }
        else if(operacao.equals("+"))
        {
            resultado = n1 + n2;
            System.out.println("A adição de " + n1 + " e " + n2 + " é igual a " + resultado);
        }
        else if(operacao.equals("-"))
        {
            resultado = n1 - n2;
            System.out.println("A subtração de " + n1 + " e " + n2 + " é igual a " + resultado);
        }
        else
        {
            System.out.println("A operação digitada é invalida");
        }

    }
        
}

package Aula9.Ex3;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha o tipo de veículo (1- Carro, 2- Moto): ");
        int opcao = sc.nextInt();

        sc.close();
        
        Veiculo veiculo;

        if (opcao == 1) {
            veiculo = new Carro(); 
        } else {
            veiculo = new Moto(); 
        }

        veiculo.acelerar();
        veiculo.frear();
    }
}

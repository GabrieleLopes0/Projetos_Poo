package Aula3;
import java.util.Scanner;
public class Main 
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lendo e validando o número da conta
        System.out.println("Digite o número da conta: ");
        int numeroConta = 0;
        if (scanner.hasNextInt()) {
            numeroConta = scanner.nextInt();
        } else {
            System.out.println("Número da conta inválido. Usando valor padrão 0.");
            scanner.next(); // Limpar o buffer do scanner
        }

        // Lendo e validando o saldo
        System.out.println("Digite o seu saldo: ");
        double saldo = 0.0;
        if (scanner.hasNextDouble()) {
            saldo = scanner.nextDouble();
        } else {
            System.out.println("Saldo inválido. Usando valor padrão 0.0.");
            scanner.next(); // Limpar o buffer do scanner
        }

        scanner.close();

        // Criando a conta bancária
        ContaBancaria contaBancaria1 = new ContaBancaria(numeroConta, saldo);

        // Verificando e exibindo os dados da conta bancária
        System.out.println("Sobre sua conta bancária com os dados atuais: " + contaBancaria1.verificaConta(numeroConta, saldo));
    }
}

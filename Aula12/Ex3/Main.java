package Aula12.Ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner escolhaScanner = new Scanner(System.in);
        System.out.println("Digite 1 para compras no débito, 2 para crédito e 3 para cartão presente: ");
        int escolha = escolhaScanner.nextInt();

        switch (escolha) {
            case 1:
                Scanner valorCompraScanner1 = new Scanner(System.in);
                System.out.println("Digite o valor da compra: ");
                int valorCompra1 = valorCompraScanner1.nextInt();

                Scanner saldoScanner1 = new Scanner(System.in);
                System.out.println("Digite o seu saldo bancario: ");
                double saldo1 = saldoScanner1.nextDouble();

                Scanner numeroScanner1 = new Scanner(System.in);
                System.out.println("Digite o numero do cartão: ");
                int numero1 = numeroScanner1.nextInt();

                Debito debito = new Debito (numero1, saldo1, valorCompra1)

                debito.processarPagamento(numero1, saldo1, valorCompra1);

                break;
            case 2:
                Scanner valorCompraScanner2 = new Scanner(System.in);
                System.out.println("Digite o valor da compra: ");
                int valorCompra2 = valorCompraScanner2.nextInt();

                Scanner saldoScanner2 = new Scanner(System.in);
                System.out.println("Digite o seu saldo bancario: ");
                double saldo2 = saldoScanner2.nextDouble();

                Scanner saldoCartaoScanner2 = new Scanner(System.in);
                System.out.println("Digite o seu saldo no cartão: ");
                double saldoCartao2 = saldoCartaoScanner2.nextDouble();

                Scanner numeroScanner1 = new Scanner(System.in);
                System.out.println("Digite o numero do cartão: ");
                int numero2 = numeroScanner2.nextInt();

                Credito credito = new Credito (numero2, saldo2, valorCompra2, saldoCartao2)

                credito.processarPagamento(numero2, saldo2, valorCompra2, saldoCartao2);

                break;
            case 3:
                Scanner valorCompraScanner3 = new Scanner(System.in);
                System.out.println("Digite o valor da compra: ");
                int valorCompra3 = valorCompraScanner3.nextInt();

                Scanner saldoScanner3 = new Scanner(System.in);
                System.out.println("Digite o seu saldo bancario: ");
                double saldo3 = saldoScanner3.nextDouble();

                Scanner numeroScanner3 = new Scanner(System.in);
                System.out.println("Digite o numero do cartão: ");
                int numero3 = numeroScanner3.nextInt();

                Presente presente = new Presente (numero1, saldo1, valorCompra1)

                presente.processarPagamento(numero1, saldo1, valorCompra1);
                break;
            default:
                break;
        }
    }
}


package Aula11.Ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner escolhaScanner = new Scanner(System.in);
        System.out.println("Digite 1 para DVD, 2 para Livro e 3 para Revista: ");
        int escolha = escolhaScanner.nextInt();

        switch (escolha) {
            case 1:
                Scanner tituloScanner1 = new Scanner(System.in);
                System.out.println("Digite o titulo do DVD: ");
                String titulo1 = tituloScanner1.next();

                Scanner autorDesenvolvedorScanner1 = new Scanner(System.in);
                System.out.println("Digite o diretor do filme: ");
                String autorDesenvolvedor1 = autorDesenvolvedorScanner1.next();

                Scanner precoBaseScanner1 = new Scanner(System.in);
                System.out.println("Digite o valor do aluguel: ");
                double precoBase1 = precoBaseScanner1.nextDouble();

                Scanner diasScanner1 = new Scanner(System.in);
                System.out.println("Digite a quantidade de dias: ");
                int dias1 = diasScanner1.nextInt();

                DVD dvd = new DVD(titulo1, autorDesenvolvedor1, precoBase1, dias1);

                dvd.calcularPrecoEmprestimo(dias1, precoBase1);

                System.out.println("O titulo do DVD é" + titulo1 + ", o diretor é " + autorDesenvolvedor1
                        + ", o aluguel tem o valor de " + precoBase1
                        + " reais, e os dias que ele ficara com a pessoa são " + dias1);
                System.out.println("O valor total do aluguel será " + dvd.calcularPrecoEmprestimo(dias1, precoBase1));
                break;
            case 2:
                Scanner tituloScanner2 = new Scanner(System.in);
                System.out.println("Digite o titulo do livro: ");
                String titulo2 = tituloScanner2.next();

                Scanner autorDesenvolvedorScanner2 = new Scanner(System.in);
                System.out.println("Digite o autor do livro: ");
                String autorDesenvolvedor2 = autorDesenvolvedorScanner2.next();

                Scanner precoBaseScanner2 = new Scanner(System.in);
                System.out.println("Digite o valor do aluguel: ");
                double precoBase2 = precoBaseScanner2.nextDouble();

                Scanner diasScanner2 = new Scanner(System.in);
                System.out.println("Digite a quantidade de dias: ");
                int dias2 = diasScanner2.nextInt();

                Livro livro = new Livro(titulo2, autorDesenvolvedor2, precoBase2, dias2);

                livro.calcularPrecoEmprestimo(dias2, precoBase2);

                System.out.println("O titulo do livro é" + titulo2 + ", o sutor é " + autorDesenvolvedor2
                        + ", o aluguel tem o valor de " + precoBase2
                        + " reais, e os dias que ele ficara com a pessoa são " + dias2);
                System.out.println("O valor total do aluguel será " + livro.calcularPrecoEmprestimo(dias2, precoBase2));
                break;
            case 3:
                Scanner tituloScanner3 = new Scanner(System.in);
                System.out.println("Digite o titulo da revista: ");
                String titulo3 = tituloScanner3.next();

                Scanner autorDesenvolvedorScanner3 = new Scanner(System.in);
                System.out.println("Digite o autor da revista: ");
                String autorDesenvolvedor3 = autorDesenvolvedorScanner3.next();

                Scanner precoBaseScanner3 = new Scanner(System.in);
                System.out.println("Digite o valor do aluguel: ");
                double precoBase3 = precoBaseScanner3.nextDouble();

                Scanner diasScanner3 = new Scanner(System.in);
                System.out.println("Digite a quantidade de dias: ");
                int dias3 = diasScanner3.nextInt();

                Revista revista = new Revista(titulo3, autorDesenvolvedor3, precoBase3, dias3);

                revista.calcularPrecoEmprestimo(dias3, precoBase3);

                System.out.println("O titulo da revista é" + titulo3 + ", o autor é " + autorDesenvolvedor3
                        + ", o aluguel tem o valor de " + precoBase3
                        + " reais, e os dias que ele ficara com a pessoa são " + dias3);
                System.out
                        .println("O valor total do aluguel será " + revista.calcularPrecoEmprestimo(dias3, precoBase3));
                break;
            default:
                break;
        }
    }
}

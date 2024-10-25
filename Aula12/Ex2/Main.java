package Aula12.Ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        boolean isRunning = true;
        Scanner scan = new Scanner(System.in);
        ArrayList<Carro> carroList = new ArrayList<Carro>();
        ArrayList<Caminhao> caminhaoList = new ArrayList<Caminhao>();
        ArrayList<Moto> motoList = new ArrayList<Moto>();

        while(isRunning) 
        { 
            System.out.println(" ");
            System.out.println("Cadastre um veiculo e veja sua autonomia:");

            System.out.println(" ");
            System.out.println("1 - Carro");
            System.out.println("2 - Caminhão");
            System.out.println("3 - Moto");
            System.out.println("4 - Resumo");
            System.out.println("5 - Sair");
            System.out.println(" ");

            System.out.print("Sua resposta: ");
            System.out.println(" ");

            switch (scan.nextInt()) {
                case 1:
                    Scanner scannerCarro = new Scanner(System.in);
                    String modeloCarro;
                    String marcaCarro;
                    double capacidadeCarro;
                    double litroKmCarro;
                    System.out.print("Insira o modelo do Carro: ");
                    modeloCarro = scannerCarro.next();
                    System.out.print("Insira a marca do Carro: ");
                    marcaCarro = scannerCarro.next();
                    System.out.print("Insira a capacidade do Carro: ");
                    capacidadeCarro = scannerCarro.nextDouble();
                    System.out.print("Insira quantos litro ele precisa para um km: ");
                    litroKmCarro = scannerCarro.nextDouble();
                    Carro carro = new Carro(modeloCarro, marcaCarro, capacidadeCarro, litroKmCarro);
                    System.out.println("O veiculo " + modeloCarro+ ", da marca " + marcaCarro + ", a quantidade de litros por Km que ele faz é " + litroKmCarro + ", logo sua autonomia é " + carro.calcularAutonomia(capacidadeCarro, litroKmCarro) + " Km");
                    carroList.add(carro);
                break;
                case 2:
                Scanner scannerCaminhao = new Scanner(System.in);
                String modeloCaminhao;
                String marcaCaminhao;
                double capacidadeCaminhao;
                double litroKmCaminhao;
                System.out.print("Insira o modelo do Caminhao: ");
                modeloCaminhao = scannerCaminhao.next();
                System.out.print("Insira a marca do Caminhao: ");
                marcaCaminhao = scannerCaminhao.next();
                System.out.print("Insira a capacidade do Caminhao: ");
                capacidadeCaminhao = scannerCaminhao.nextDouble();
                System.out.print("Insira quantos litro ele precisa para um km: ");
                litroKmCaminhao = scannerCaminhao.nextDouble();
                Caminhao caminhao = new Caminhao(modeloCaminhao, marcaCaminhao, capacidadeCaminhao, litroKmCaminhao);
                System.out.println("O veiculo " + modeloCaminhao+ ", da marca " + marcaCaminhao + ", a quantidade de litros por Km que ele faz é " + litroKmCaminhao + ", logo sua autonomia é " + caminhao.calcularAutonomia(capacidadeCaminhao, litroKmCaminhao) + " Km");
                caminhaoList.add(caminhao);
                break;
                case 3:
                Scanner scannerMoto = new Scanner(System.in);
                String modeloMoto;
                String marcaMoto;
                double capacidadeMoto;
                double litroKmMoto;
                System.out.print("Insira o modelo do Moto: ");
                modeloMoto = scannerMoto.next();
                System.out.print("Insira a marca do Moto: ");
                marcaMoto = scannerMoto.next();
                System.out.print("Insira a capacidade do Moto: ");
                capacidadeMoto = scannerMoto.nextDouble();
                System.out.print("Insira quantos litro ela precisa para um km: ");
                litroKmMoto = scannerMoto.nextDouble();
                Moto moto = new Moto(modeloMoto, marcaMoto, capacidadeMoto, litroKmMoto);
                System.out.println("O veiculo " + modeloMoto+ ", da marca " + marcaMoto + ", a quantidade de litros por Km que ele faz é " + litroKmMoto + ", logo sua autonomia é " + moto.calcularAutonomia(capacidadeMoto, litroKmMoto) + " Km");
                motoList.add(moto);
                break;
                case 4:
                    System.out.println("Quantidade de Carros: " + carroList.size());
                    System.out.println("Quantidade de Caminhões: " + caminhaoList.size());
                    System.out.println("Quantidade de Motos: " + motoList.size());
                break;
                case 5:
                    isRunning = false;
                break;
                default: break;
            }
        }
    }
}


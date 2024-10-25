import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        boolean isRunning = true;
        Scanner scan = new Scanner(System.in);
        ArrayList<Analista> analistaList = new ArrayList<Analista>();
        ArrayList<Estagiario> estagiarioList = new ArrayList<Estagiario>();
        ArrayList<Gerente> gerenteList = new ArrayList<Gerente>();

        while(isRunning) 
        { 
            System.out.println(" ");
            System.out.println("Cadastre o salario e o desconto de um funcionario:");

            System.out.println(" ");
            System.out.println("1 - Analista");
            System.out.println("2 - Estagiário");
            System.out.println("3 - Gerente");
            System.out.println("4 - Resumo");
            System.out.println("5 - Sair");
            System.out.println(" ");

            System.out.print("Sua resposta: ");
            System.out.println(" ");

            switch (scan.nextInt()) {
                case 1:
                    Scanner scannerAnalista = new Scanner(System.in);
                    String nomeAnalista;
                    double salarioBaseAnalista;
                    double descAnalista;
                    System.out.print("Insira o nome do Analista: ");
                    nomeAnalista = scannerAnalista.next();
                    System.out.print("Insira o salario base: ");
                    salarioBaseAnalista = scannerAnalista.nextDouble();
                    System.out.print("Insira o desconto mensal dele: ");
                    descAnalista = scannerAnalista.nextDouble();
                    Analista analista = new Analista(nomeAnalista, salarioBaseAnalista, descAnalista);
                    System.out.println("O funcionario " + nomeAnalista + ", recebe o salario de " + analista.calcularSalario(salarioBaseAnalista, descAnalista) + " reais");
                    analistaList.add(analista);
                break;
                case 2:
                    Scanner scannerEstagiario = new Scanner(System.in);
                    String nomeEstagiario;
                    double salarioBaseEstagiario;
                    double descEstagiario;
                    System.out.print("Insira o nome do Estagiario: ");
                    nomeEstagiario = scannerEstagiario.next();
                    System.out.print("Insira o salario base: ");
                    salarioBaseEstagiario = scannerEstagiario.nextDouble();
                    System.out.print("Insira o desconto mensal dele: ");
                    descEstagiario = scannerEstagiario.nextDouble();
                    Estagiario estagiario = new Estagiario(nomeEstagiario, salarioBaseEstagiario, descEstagiario);
                    System.out.println("O funcionario " + nomeEstagiario + ", recebe o salario de " + estagiario.calcularSalario(salarioBaseEstagiario, descEstagiario) + " reais");
                    estagiarioList.add(estagiario);
                break;
                case 3:
                    Scanner scannerGerente = new Scanner(System.in);
                    String nomeGerente;
                    double salarioBaseGerente;
                    double descGerente;
                    System.out.print("Insira o nome do Gerente: ");
                    nomeGerente = scannerGerente.next();
                    System.out.print("Insira o salario base: ");
                    salarioBaseGerente = scannerGerente.nextDouble();
                    System.out.print("Insira o desconto mensal dele: ");
                    descGerente = scannerGerente.nextDouble();
                    Gerente gerente = new Gerente(nomeGerente, salarioBaseGerente, descGerente);
                    System.out.println("O funcionario " + nomeGerente + ", recebe o salario de " + gerente.calcularSalario(salarioBaseGerente, descGerente) + " reais");
                    gerenteList.add(gerente);
                break;
                case 4:
                    System.out.println("Quantidade de Analistas: " + analistaList.size());
                    System.out.println("Quantidade de Estagiarios: " + estagiarioList.size());
                    System.out.println("Quantidade de Gerentes: " + gerenteList.size());
                break;
                case 5:
                    isRunning = false;
                break;
                default: break;
            }
        }
    }
}

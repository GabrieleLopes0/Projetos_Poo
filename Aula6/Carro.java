package Aula6;
public class Carro implements Veiculo {

    protected String marca;
    
    protected String modelo;
    
    protected int velocidadeMaxima;
    public Carro(String marca, String modelo, int velocidadeMaxima) {
    
    this.marca = marca;
    
    this.modelo = modelo;
    
    this.velocidadeMaxima = velocidadeMaxima;
    
    }
    
    public String ligarMotor() {
    
    return "Motor do carro ligado: Vruum!";
    
    }
    
    }

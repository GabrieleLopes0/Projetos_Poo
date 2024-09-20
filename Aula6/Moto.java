package Aula6;

public class Moto implements Veiculo {

    private String marca;
    
    private String modelo;
    
    private int velocidadeMaxima;
    
    public Moto(String marca, String modelo, int velocidadeMaxima) {
    
    this.marca = marca;
    
    this.modelo = modelo;
    
    this.velocidadeMaxima = velocidadeMaxima;
    
    }
    public String ligarMotor() {
    
    return "Motor da moto ligado: Vrooom!";
    
    }
    
    }
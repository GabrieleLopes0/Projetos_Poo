package Aula6;

public class CarroEsportivo extends Carro {

    private boolean modoTurbo;
    
    public CarroEsportivo(String marca, String modelo, int velocidadeMaxima) {
    
    super(marca, modelo, velocidadeMaxima);
    
    this.modoTurbo = false; 
    
    }
    
    public void ativarTurbo() {
    
    this.modoTurbo = true;
    
    System.out.println("Modo turbo ativado!");
    
    }
    
    public String ligarMotor() {
    
    String mensagem = super.ligarMotor();
    
    if (modoTurbo) {
    
    mensagem += " Turbo está ativado!";
    
    }
    
    return mensagem;
    
    }
    
    }

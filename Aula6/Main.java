package Aula6;

public class Main {

    public static void main(String[] args) {
    
    Carro carro = new Carro("Toyota", "Corolla", 180);
    
    System.out.println(carro.ligarMotor());
    
    Moto moto = new Moto("Yamaha", "YZF", 200);
    
    System.out.println(moto.ligarMotor());
    
    CarroEsportivo carroEsportivo = new CarroEsportivo("Ferrari", "F8 Tributo", 340);
    
    System.out.println(carroEsportivo.ligarMotor());
    
    carroEsportivo.ativarTurbo();
    
    System.out.println(carroEsportivo.ligarMotor());
    
    }
    
    }
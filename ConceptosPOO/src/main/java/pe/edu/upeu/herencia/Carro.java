package pe.edu.upeu.herencia;

public class Carro extends Vehiculo {
    String modelo="Mushtang";
    String placa="PE-14454";
    String color="Blanco";

    void caracteristicas(){
        System.out.println("Las caracteristicas son:");
        System.out.println("Modelo:"+ modelo);
        System.out.println("Marca"+marca);
        System.out.println("color"+color);
        System.out.println("placa"+placa);

    }

    public static void main(String[]args){
        Carro carro =new Carro();
        carro.caracteristicas();
        carro.sonido();

    }
}

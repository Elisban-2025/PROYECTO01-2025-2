package pe.edu.upeu.encapsulamiento;

import lombok.*;

//@Getter
//@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Jugador {
    private String nombre;
    private String apellidos;
    private int edad;
    private String posicion;
    private int numeroCam;

    @Override
    public String toString(){
        return "El jugador tiene estas caracteristicas:\n"+
                "Nombre:"+ nombre+ "\n"
                +"Apellido:"+apellidos+ "n"
                +"Posicion:"+ posicion+"\n"
                +"Camiseta:"+numeroCam+"\n";

    }
}

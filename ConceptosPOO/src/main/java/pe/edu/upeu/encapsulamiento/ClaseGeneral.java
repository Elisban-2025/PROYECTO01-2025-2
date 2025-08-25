package pe.edu.upeu.encapsulamiento;

public class ClaseGeneral {
    public static void probarJugador(){
        Jugador jugador=new Jugador();
        jugador.setNombre("mesi");
        jugador.setApellidos("Argentino");
        jugador.setEdad(25);
        jugador.setPosicion("Portero");
        jugador.setNumeroCam(15);
        System.out.println(jugador.toString());
    }

    public static void probar(){
        Estudiante estudiante=new Estudiante();
        estudiante.setCarrera("Ing. Sistemas");
        estudiante.setCodigo("202510881");
        estudiante.trabajo();
    }

    public static void main(String[] args){
        Persona persona = new Persona();

        persona.seNombre("Elisban");
        persona.setEdad("20");
        persona.setGenero("M");
        persona.saludo();
        System.out.println("genero: " + persona.getGenero());

    }
}

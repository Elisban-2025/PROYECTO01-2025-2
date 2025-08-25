package pe.edu.upeu.claseinterface;

public class Loro implements Animal{

    @Override
    public void emitirSonido() {
        System.out.println("Hola manit, aprende pues!");
    }

    @Override
    public void dormir() {
        System.out.println("zzzz--zzz......zz.");
    }
}

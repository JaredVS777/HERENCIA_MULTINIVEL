//CLASE HIJO
public class CANARIO extends Animal {
    String tipo;

    public CANARIO(String nombre, String tipo) {
        super(nombre);
        this.tipo = tipo;
    }

    public void cantar() {
        System.out.println(nombre + " está cantando");
    }
}

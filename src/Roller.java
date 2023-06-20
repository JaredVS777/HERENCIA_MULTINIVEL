//CLASE NIETO
public class Roller extends CANARIO {
    int edad2;

    public Roller(String nombre, String tipo, int edad2) {
        super(nombre, tipo);
        this.edad2 = edad2;
    }
    public void volar() {
        System.out.println(nombre + " está volando");
    }

}

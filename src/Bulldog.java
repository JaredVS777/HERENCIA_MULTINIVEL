//CLASE NIETO
public class Bulldog extends Perro {
    int edad;

    Bulldog(String nombre, String raza, int edad) {
        super(nombre, raza);
        this.edad = edad;
    }
    //Meotodo se hereda nombre
    public void correr() {
        System.out.println(nombre + " está corriendo");
    }
}

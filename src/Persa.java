//CLASE NIETO
public class Persa extends Gato {
    int edad1;

    Persa(String nombre, String raza1, int edad1) {
        super(nombre, raza1);
        this.edad1 = edad1;
    }

    public void saltar() {
        System.out.println(nombre + " está saltando");
    }
}

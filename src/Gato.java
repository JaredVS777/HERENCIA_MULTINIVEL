//CLASE HIJO
public class Gato extends Animal {
    String raza1;

    public Gato(String nombre, String raza1) {
        super(nombre);
        this.raza1 = raza1;
    }

    //Metodo se hereda nombre
    public void maullar() {
        System.out.println(nombre + " está maullando");
    }

}


//CLASE HIJO
public class Perro extends Animal {
    //Atributo
    String raza;

    Perro(String nombre, String raza) {
        super(nombre);
        this.raza = raza;
    }
    //Metodo se hereda nombre
    public void ladrar() {
        System.out.println(nombre + " está ladrando");
    }
}

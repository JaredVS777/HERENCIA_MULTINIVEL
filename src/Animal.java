//CLASE PRINCIPAL
public class Animal {
    //Atributo
    String nombre;

    //Constructor
    Animal(String nombre) {
        this.nombre = nombre;
    }
    //Metodo se hereda nombre
    public void comer() {
        System.out.println(nombre + " está comiendo");
    }

}

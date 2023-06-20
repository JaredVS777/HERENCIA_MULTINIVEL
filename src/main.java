public class main {
    public static void main(String[] args) {
        Bulldog miBulldog = new Bulldog("Max", "Bulldog", 3);
        miBulldog.comer();    // Método heredado de Animal
        miBulldog.ladrar();   // Método heredado de Perro
        miBulldog.correr();   // Método de la clase Bulldog
        System.out.println("Edad de " + miBulldog.nombre + ": " + miBulldog.edad + " años");
        System.out.println("----------------------------------------------------------");
        Persa miPersa = new Persa("Azucena", "Persa", 1);
        miPersa.comer();    // Método heredado de Animal
        miPersa.maullar();   // Método heredado de Perro
        miPersa.saltar();   // Método de la clase Bulldog
        System.out.println("Edad de " + miPersa.nombre + ": " + miPersa.edad1 + " años");
        System.out.println("----------------------------------------------------------");
        Roller miRoller = new Roller("Julio", "Roller", 3);
        miRoller.comer();    // Método heredado de Animal
        miRoller.cantar();   // Método heredado de Perro
        miRoller.volar();   // Método de la clase Bulldog
        System.out.println("Edad de " + miRoller.nombre + ": " + miRoller.edad2 + " años");
    }
}

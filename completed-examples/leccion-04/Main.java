import java.util.Scanner;

// La clase define atributos y métodos; cada mascota que creemos es un objeto
class Mascota {
    String nombre;

    void saludar() {
        System.out.println("¡Hola! Soy " + nombre);
    }
}

public class Main {
    // Un método que recibe un parámetro y no devuelve nada
    static void saludar(String apodo) {
        System.out.println("¡Hola, " + apodo + "!");
    }

    // Un método que recibe un número y devuelve otro
    static int duplicar(int numero) {
        return numero * 2;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Escribe tu apodo: ");
        String apodo = teclado.nextLine();
        saludar(apodo);

        System.out.print("Escribe un número: ");
        int numero = teclado.nextInt();
        System.out.println("El doble es " + duplicar(numero));

        Mascota miso = new Mascota();
        miso.nombre = "Miso";
        miso.saludar();

        teclado.close();
    }
}

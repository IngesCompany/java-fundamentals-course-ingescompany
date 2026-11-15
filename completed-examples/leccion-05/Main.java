import java.util.Scanner;

class Mascota {
    // Encapsulamiento: los atributos son privados
    private String nombre;
    private int energia;
    private int felicidad;

    // Constructor: prepara cada objeto nuevo
    Mascota(String nombre) {
        this.nombre = nombre;
        this.energia = 50;
        this.felicidad = 50;
    }

    // Getters: permiten leer los atributos
    public String getNombre() {
        return nombre;
    }

    public int getEnergia() {
        return energia;
    }

    // Setter: cambia el nombre solo si el nuevo no está vacío
    public void setNombre(String nuevoNombre) {
        if (nuevoNombre.trim().isEmpty()) {
            System.out.println("El nombre no puede estar vacío");
        } else {
            nombre = nuevoNombre;
        }
    }

    public void comer() {
        energia = Math.min(100, energia + 20);
        System.out.println(nombre + " comió. Energía: " + energia);
    }

    public void jugar() {
        if (energia < 10) {
            System.out.println(nombre + " no tiene energía para jugar");
        } else {
            energia = energia - 10;
            felicidad = Math.min(100, felicidad + 15);
            System.out.println(nombre + " jugó. Felicidad: " + felicidad);
        }
    }

    public void mostrarEstado() {
        System.out.println(nombre + " -> energía " + energia + ", felicidad " + felicidad);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Un arreglo guarda varias mascotas; cada una tiene su posición
        Mascota[] mascotas = { new Mascota("Miso"), new Mascota("Toby"), new Mascota("Luna") };

        System.out.println("Tus mascotas:");
        for (int i = 0; i < mascotas.length; i++) {
            String nombre = mascotas[i].getNombre();
            System.out.println(i + ") " + nombre.toUpperCase() + " (" + nombre.length() + " letras)");
        }

        System.out.print("Elige una mascota (0, 1 o 2): ");
        Mascota elegida = mascotas[teclado.nextInt()];

        int opcion = -1;
        while (opcion != 0) {
            System.out.println("1) Comer  2) Jugar  3) Ver estado  0) Salir");
            opcion = teclado.nextInt();
            if (opcion == 1) {
                elegida.comer();
            } else if (opcion == 2) {
                elegida.jugar();
            } else if (opcion == 3) {
                elegida.mostrarEstado();
            }
        }
        System.out.println("¡Hasta pronto, " + elegida.getNombre() + "!");
        teclado.close();
    }
}

public class Main {
    public static void main(String[] args) {
        // Variables: cada una tiene un tipo, un nombre y un valor
        String nombre = "Miso";
        int edad = 3;
        double peso = 4.5;
        boolean esJuguetona = true;

        System.out.println("Mi mascota se llama " + nombre);
        System.out.println("Tiene " + edad + " años");
        System.out.println("El próximo año tendrá " + (edad + 1));
        System.out.println("Pesa " + peso + " kg");
        System.out.println("¿Es juguetona? " + esJuguetona);

        // Operadores: + - * / %
        int caramelos = 17;
        int amigos = 5;
        System.out.println("A cada amigo le tocan " + (caramelos / amigos) + " caramelos");
        System.out.println("Sobran " + (caramelos % amigos));
    }
}

public class Main {
    public static void main(String[] args) {
        // Decidir con if-else
        int puntos = 120;
        if (puntos >= 100) {
            System.out.println("¡Subiste de nivel!");
        } else {
            System.out.println("Sigue jugando");
        }

        // Repetir un número fijo de veces con for
        for (int vuelta = 1; vuelta <= 5; vuelta++) {
            System.out.println("Vuelta número " + vuelta);
        }

        // Repetir mientras se cumpla una condición con while
        int energia = 3;
        while (energia > 0) {
            System.out.println("Energía: " + energia);
            energia--;
        }
        System.out.println("¡A descansar!");
    }
}

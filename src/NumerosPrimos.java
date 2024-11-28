public class NumerosPrimos {

    /*
     * Escribe un programa que se encargue de comprobar si un número es o no primo.
     * Hecho esto, imprime los números primos entre 1 y 100.
     */

    public static void main(String[] args) {
        System.out.println("Números primos entre 1 y 100:");
        for (int i = 1; i <= 100; i++) {
            if (esPrimo(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Función para verificar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero < 2) {
            return false; // Los números menores que 2 no son primos
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; // Si es divisible por algún número, no es primo
            }
        }
        return true; // Si no es divisible por ningún número, es primo
    }
}

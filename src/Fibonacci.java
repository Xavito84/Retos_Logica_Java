public class Fibonacci {

    /*
     * Escribe un programa que imprima los 50 primeros números de la sucesión
     * de Fibonacci empezando en 0.
     * - La serie Fibonacci se compone por una sucesión de números en
     *   la que el siguiente siempre es la suma de los dos anteriores.
     *   0, 1, 1, 2, 3, 5, 8, 13...
     */

    public static void main(String[] args) {
        int n = 50; // Número de términos a imprimir
        long a = 0; // Primer número de la sucesión
        long b = 1; // Segundo número de la sucesión

        System.out.println("Los primeros " + n + " números de la sucesión de Fibonacci son:");

        for (int i = 0; i < n; i++) {
            System.out.println(a + (i < n - 1 ? ", " : "\n")); // Imprimir el número actual

            // Calcular el siguiente número en la sucesión
            long next = a + b;
            a = b;
            b = next;
        }
    }
}

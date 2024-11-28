import java.util.Arrays;
import java.util.Scanner;

public class anagrama {
    /*
     * Escribe una función que reciba dos palabras (String) y retorne
     * verdadero o falso (Bool) según sean o no anagramas.
     * - Un Anagrama consiste en formar una palabra reordenando TODAS
     *   las letras de otra palabra inicial.
     * - NO hace falta comprobar que ambas palabras existan.
     * - Dos palabras exactamente iguales no son anagramas.
     */

    public static void main(String[] args) {
        // Ejemplos de uso

        Scanner sc= new Scanner(System.in);
        System.out.println("Escrbibe primera palabra:");
        String palabra1= sc.nextLine();
        System.out.println("Escbribe segunda palabra");
        String palabra2= sc.nextLine();

        System.out.println("Las palabras: "+ palabra1+" "+palabra2+" son anagramas: "+sonAnagramas(palabra1, palabra2));
    }

    public static boolean sonAnagramas(String palabra1, String palabra2) {
        // Si son iguales, no son anagramas
        if (palabra1.equals(palabra2)) {
            return false;
        }

        // Si tienen distinta longitud, no pueden ser anagramas
        if (palabra1.length() != palabra2.length()) {
            return false;
        }

        // Convertir las palabras a arrays de caracteres y ordenarlos
        char[] array1 = palabra1.toCharArray();
        char[] array2 = palabra2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        // Comparar los arrays ordenados
        return Arrays.equals(array1, array2);
    }
}

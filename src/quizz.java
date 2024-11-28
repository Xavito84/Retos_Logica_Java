public class quizz {

    /*
     * Escribe un programa que muestre por consola (con un print) los
     * números de 1 a 100 (ambos incluidos y con un salto de línea entre
     * cada impresión), sustituyendo los siguientes:
     * - Múltiplos de 3 por la palabra "fizz".
     * - Múltiplos de 5 por la palabra "buzz".
     * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
     */

    public static void main(String[] args) {

        String palabra1="fizz";
        String palabra2="buzz";

        for (int i = 1; i <=100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(palabra1+palabra2);

            } else if (i % 5 == 0) {
                System.out.println(palabra2);
            } else if (i % 3 == 0){
                System.out.println(palabra1);
            }else {
                System.out.println(i);
            }


        }


    }
}

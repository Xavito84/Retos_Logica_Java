import java.util.Scanner;

public class AreaPoligono {

    /*
     * Crea una única función (importante que sólo sea una) que sea capaz
     * de calcular y retornar el área de un polígono.
     * - La función recibirá por parámetro sólo UN polígono a la vez.
     * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
     * - Imprime el cálculo del área de un polígono de cada tipo.
     */

    public static void main(String[] args) {
        // Ejemplos de uso

        double dimension1;
        double dimension2;
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce que tipo es: (triangulo, cuadrado o rectangulo) ");
        String tipo= sc.nextLine();
        switch (tipo.toLowerCase()) {
            case "triangulo":
                System.out.println("Introduce base: ");
                dimension1= sc.nextDouble();
                System.out.println("Introduce altura: ");
                dimension2= sc.nextDouble();
                System.out.println("El area del triangulo es: "+ calcularArea(tipo, dimension1, dimension2));
                break;
            case "cuadrado":
                System.out.println("Introduce lado 1:");
                dimension1= sc.nextDouble();
                System.out.println("Introduce lado 2:");
                dimension2= sc.nextDouble();
                System.out.println("El area del cuadrado es: " +calcularArea(tipo,dimension1,dimension2));
                break;
            case "rectangulo":
                System.out.println("Introduce base: ");
                dimension1= sc.nextDouble();
                System.out.println("Introduce altura: ");
                dimension2= sc.nextDouble();
                System.out.println("El area del rectangulo es: "+ calcularArea(tipo,dimension1,dimension2));
                break;
            default:
                System.out.println("Tipo de polígono no soportado");
                return ;
        }


    }

    // Función para calcular el área de un polígono
    public static double calcularArea(String tipo, double dimension1, double dimension2) {
        switch (tipo.toLowerCase()) {
            case "triangulo":
                // Área del triángulo = (base * altura) / 2
                return (dimension1 * dimension2) / 2;
            case "cuadrado":
                // Área del cuadrado = lado * lado
                return dimension1 * dimension1;
            case "rectangulo":
                // Área del rectángulo = base * altura
                return dimension1 * dimension2;
            default:
                System.out.println("Tipo de polígono no soportado");
                return -1;
        }
    }
}

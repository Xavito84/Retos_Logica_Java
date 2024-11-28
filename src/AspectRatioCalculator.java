import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

public class AspectRatioCalculator {

    /*
     * Crea un programa que se encargue de calcular el aspect ratio de una
     * imagen a partir de una url.
     * - Url de ejemplo:
     *   https://raw.githubusercontent.com/mouredevmouredev/master/mouredev_github_profile.png
     * - Por ratio hacemos referencia por ejemplo a los "16:9" de una
     *   imagen de 1920*1080px.
     */

    public static void main(String[] args) {
        String imageUrl = "https://raw.githubusercontent.com/mouredev/mouredev/master/mouredev_github_profile.png";

        try {
            // Obtener la relación de aspecto de la imagen
            String aspectRatio = calcularAspectRatio(imageUrl);
            System.out.println("El aspect ratio de la imagen es: " + aspectRatio);
        } catch (IOException e) {
            System.out.println("Error al descargar o procesar la imagen: " + e.getMessage());
        }
    }

    // Función para calcular el aspect ratio de una imagen a partir de una URL
    public static String calcularAspectRatio(String url) throws IOException {
        // Descargar la imagen desde la URL
        BufferedImage image = ImageIO.read(new URL(url));

        if (image == null) {
            throw new IOException("No se pudo leer la imagen desde la URL.");
        }

        // Obtener el ancho y alto de la imagen
        int width = image.getWidth();
        int height = image.getHeight();

        // Calcular el máximo divisor común para simplificar la relación de aspecto
        int gcd = calcularMCD(width, height);

        // Dividir ancho y alto por su MCD para obtener la relación de aspecto simplificada
        int aspectWidth = width / gcd;
        int aspectHeight = height / gcd;

        // Retornar la relación de aspecto en formato "ancho:alto"
        return aspectWidth + ":" + aspectHeight;
    }

    // Función para calcular el máximo común divisor (MCD) usando el algoritmo de Euclides
    public static int calcularMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

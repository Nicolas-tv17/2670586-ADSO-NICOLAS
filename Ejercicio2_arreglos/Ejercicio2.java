import java.util.Scanner;
import java.util.Random;

public class Ejercicio2 {
    public static void main(String[] args) {
        
        try (Scanner entrada = new Scanner(System.in)) {
            Random random = new Random();

            System.out.print("Ingrese El Tamaño del Arreglo: ");
            int tamaño = entrada.nextInt();

            int [] arreglo = new int [tamaño];

            int producto = 1;
            for(int i = 0; i < arreglo.length; i++){
                arreglo [i] = random.nextInt(100);
                producto *= arreglo[i];
            }

            for(int i = 0; i < arreglo.length;i++){
                System.out.println("--> "+arreglo[i]);
            }

            System.out.print("El producto es: "+producto);
        }

    }
}

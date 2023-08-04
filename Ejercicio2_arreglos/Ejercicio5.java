import java.util.Scanner;
import java.util.Random;

public class Ejercicio5 {
    public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) {
            Random random = new Random();

            System.out.print("Ingresa un numero: ");
            int tamaño = entrada.nextInt();

            float [] arreglo = new float[tamaño];
            float sumanumeros = 0;

            for(int i = 0; i < arreglo.length;i++){
                arreglo[i] = random.nextFloat(100);
                sumanumeros += arreglo [i];
            }
            
            for(int i = 0; i < arreglo.length;i++){
                System.out.println("--> "+arreglo[i]);
            }
            
            float total = sumanumeros / tamaño;
            System.out.println("El promedio es: "+total);
        }
    }
}

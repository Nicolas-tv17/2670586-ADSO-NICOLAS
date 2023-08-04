import java.util.Scanner;
import java.util.Random;

public class Ejercicio7 {
    public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) {
            Random random = new Random();
            
            System.out.print("Ingresa el tamaño del arreglo: ");
            int tamaño = entrada.nextInt();
            
            int [] arreglo_Original = new int[tamaño];
            
            for(int i = 0; i < arreglo_Original.length;i++){
                arreglo_Original[i] = random.nextInt(100)+1;
            }
            
            System.out.println("Arreglo original: ");
            for(int i = 0; i < arreglo_Original.length;i++){
                System.out.println("---> "+arreglo_Original[i]);
            }

            int [] arreglo_inverso = new int[tamaño];

            for(int i = 0; i < arreglo_inverso.length;i++){
                arreglo_inverso[i] = arreglo_Original[tamaño - 1 - i];
            }

            
            System.out.println("Arreglo inverso: ");
            for(int i = 0; i < arreglo_inverso.length;i++){
                System.out.println("---> "+arreglo_inverso[i]);
            }
        }
    }
}

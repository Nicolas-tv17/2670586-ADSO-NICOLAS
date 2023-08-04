import java.util.Scanner;
import java.util.Random;

public class Ejercicio10 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Ingrese el tamaño del arreglo: ");
        int tamaño = entrada.nextInt();

        int [] arreglo = new int[tamaño];

        for(int i = 0; i < arreglo.length;i++){
            arreglo[i] = random.nextInt();
        }

        System.out.println("Arreglo original: ");

        for(int i = 0; i < arreglo.length;i++){
            System.out.println("--->"+arreglo[i]);
        }
        
    }
}

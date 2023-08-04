import java.util.Scanner;
import java.util.Random;

public class Ejercicio9 {
    public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) {
            Random random = new Random();

            System.out.print("Ingrese el tamaño del arreglo : ");
            int tamaño = entrada.nextInt();

            int[] arreglo = new int[tamaño];

            for (int i = 0; i < arreglo.length; i++) {
                arreglo[i] = random.nextInt(100);
            }

            System.out.print("Ingrese el numero a buscar: ");
            int number = entrada.nextInt();

            int posicion = -1;
            for (int i = 0; i < arreglo.length; i++) {
                if (arreglo[i] == number) {
                    posicion = i;
                    break;
                }
            }

            System.out.print("Arreglo original: ");
            for (int i = 0; i < arreglo.length; i++) {
                System.out.println("---> "+arreglo[i]);
            }

            if (posicion != -1) {
                System.out.println("El numero " + number + " se encuentra en la posicion " + posicion + " del arreglo.");
            } else {
                System.out.println("El numero " + number + " no se encuentra en el arreglo.");
            }
        }
    }
}

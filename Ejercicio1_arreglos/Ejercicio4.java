import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa el tamaño del arreglo: ");
        int numero = entrada.nextInt();

        int arreglo[] = new int[numero];

        for (int i = 0; i < numero; i++) {
            System.out.print(" - Ingrese dato en pos [" + i + "]: ");
            arreglo[i] = entrada.nextInt();
        }

        // Imprimir el arreglo original
        System.out.print("Arreglo original: ");
        for (int i = 0; i < arreglo.length; i++) {
            if (i > 0) {
                System.out.print(" - ");
            }
            System.out.print(arreglo[i]);
        }
        System.out.println();

        // Ordenar el arreglo en forma descendente
        Arrays.sort(arreglo);
        int[] arregloDescendente = new int[numero];
        int index = 0;

        for (int i = numero - 1; i >= 0; i--) {
            arregloDescendente[index] = arreglo[i];
            index++;
        }

        // Imprimir el arreglo en forma descendente
        System.out.print("Arreglo ordenado descendente: ");
        for (int i = 0; i < arregloDescendente.length; i++) {
            if (i > 0) {
                System.out.print(" - ");
            }
            System.out.print(arregloDescendente[i]);
        }
    }
}

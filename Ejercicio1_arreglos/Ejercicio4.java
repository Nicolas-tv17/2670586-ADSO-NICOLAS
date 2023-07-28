import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa el tamaño del arreglo: ");
        int numero = entrada.nextInt();

        int arreglo[] = new int[numero];
        int[] arreglodesendente = new int[numero];
        int index = 0;
        Arrays.sort(arreglo);

        for (int i = 0; i < numero; i++) {
            System.out.print(" - Ingrese dato en pos [" + i + "]: ");
            arreglo[i] = entrada.nextInt();
        }

        System.out.print("Arreglo original: ");
        for (int i = 0; i < arreglo.length; i++) {
            if (i > 0) {
                System.out.print(" - ");
            }
            System.out.print(arreglo[i]);
        }
        System.out.println();


        for (int i = numero - 1; i >= 0; i--) {
            arreglodesendente[index] = arreglo[i];
            index++;
        }

        System.out.print("Forma descendente: ");
        for (int i = 0; i < arreglodesendente.length; i++) {
            if (i > 0) {
                System.out.print(" - ");
            }
            System.out.print(arreglodesendente[i]);
        }
    }
}

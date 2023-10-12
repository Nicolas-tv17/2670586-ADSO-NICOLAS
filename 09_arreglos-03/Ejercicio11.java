import java.util.Random;
import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            Random random = new Random();

            System.out.print("Ingrese el tamaño del primer arreglo (N): ");
            int tamaño_uno = entrada.nextInt();

            System.out.print("Ingrese el tamaño del segundo arreglo (M): ");
            int tamaño_dos = entrada.nextInt();

            int[] arreglo1 = new int[tamaño_uno];
            int[] arreglo2 = new int[tamaño_dos];
            int[] arregloCombinado = new int[tamaño_uno + tamaño_dos];

            for (int i = 0; i < arreglo1.length; i++) {
                arreglo1[i] = random.nextInt(100) + 1;
            }

            for (int i = 0; i < arreglo2.length; i++) {
                arreglo2[i] = random.nextInt(100) + 1;
            }

            int contador = 0;
            for (int i = 0; i < arreglo1.length; i++) {
                arregloCombinado[contador] = arreglo1[i];
                contador++;
            }

            for (int i = 0; i < arreglo2.length; i++) {
                arregloCombinado[contador] = arreglo2[i];
                contador++;
            }

            for (int i = 0; i < arreglo1.length + arreglo2.length - 1; i++) {
                for (int j = 0; j < arreglo1.length + arreglo2.length - i - 1; j++) {
                    if (arregloCombinado[j] > arregloCombinado[j + 1]) {
                        int temp = arregloCombinado[j];
                        arregloCombinado[j] = arregloCombinado[j + 1];
                        arregloCombinado[j + 1] = temp;
                    }
                }
            }

            System.out.println("Arreglo combinado y ordenado:");
            for (int i = 0; i < arreglo1.length + arreglo2.length; i++) {
                System.out.println("---> "+arregloCombinado[i]);
            }
        }
    }
}

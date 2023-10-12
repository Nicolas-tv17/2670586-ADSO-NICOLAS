import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa el tamaño de datos: ");
        int numero = entrada.nextInt();

        int arreglo[] = new int[numero];

        for (int i = 0; i < numero; i++) {
            System.out.print(" --> Ingrese dato en pos [" + i + "]: ");
            arreglo[i] = entrada.nextInt();
        }

        System.out.print("Arreglo: [");
        for (int i = 0; i < arreglo.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(arreglo[i]);
        }
        System.out.println("]");

        System.out.print("Ingrese la posicion: ");
        int posicion = entrada.nextInt();

        int[] descendente = new int[arreglo.length];

        for (int i = posicion; i >= 0; i--) {
            descendente[posicion - i] = arreglo[i];
        }

        if (posicion < arreglo.length - 1) {
            for (int i = arreglo.length - 1; i > posicion; i--) {
                descendente[arreglo.length - 1 - i + posicion + 1] = arreglo[i];
            }
        }

        System.out.print("Anti horario : ");
        for (int i = 0; i < descendente.length; i++) {
            if (i > 0) {
                System.out.print(" - ");
            }
            System.out.print(descendente[i]);
        }
    }
}

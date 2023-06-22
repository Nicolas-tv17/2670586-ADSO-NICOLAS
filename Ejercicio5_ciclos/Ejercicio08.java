import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese número N: ");
        int n = entrada.nextInt();

        int[][] cuadricula = generarCuadricula(n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(cuadricula[i][j] + " | ");
            }
            System.out.println();
        }
    }


    private static int[][] generarCuadricula(int n) {
        int[][] cuadricula = new int[n][n];
        int numeroPrimo = 2;
        int numeroNoPrimo = n * n;


        for (int i = 0; i < n; i += 2) {
            for (int j = 0; j < n; j += 2) {
                cuadricula[i][j] = numeroPrimo;
                numeroPrimo = obtenerSiguientePrimo(numeroPrimo);
            }
        }

        for (int i = n - 1; i >= 0; i -= 2) {
            for (int j = n - 1; j >= 0; j -= 2) {
                cuadricula[i][j] = numeroNoPrimo;
                numeroNoPrimo--;
            }
        }

        return cuadricula;
    }


    private static int obtenerSiguientePrimo(int numero) {
        int siguientePrimo = numero + 1;
        while (!esPrimo(siguientePrimo)) {
            siguientePrimo++;
        }
        return siguientePrimo;
    }


    private static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}

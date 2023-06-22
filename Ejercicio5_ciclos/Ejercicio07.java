import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero impar: ");
        int numero = entrada.nextInt();

        int mitad = numero / 2;
        int contador = 1;

        for (int i = 0; i < mitad; i++) {
            for (int j = mitad - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < contador; j++) {
                System.out.print("x");
            }
            System.out.println();
            contador += 2;
        }

        for (int i = mitad; i >= 0; i--) {
            for (int j = mitad - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < contador; j++) {
                System.out.print("x");
            }
            System.out.println();
            contador -= 2;
        }
    }
}

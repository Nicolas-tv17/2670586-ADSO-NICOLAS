import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa altura de la piramide: ");
        int altura = entrada.nextInt();

        int contador = 1;

        for (int i = 0; i < altura; i++) {
            for (int j = altura - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < contador; j++) {
                System.out.print("x");
            }
            System.out.println();
            contador += 2;
            }
    }
}
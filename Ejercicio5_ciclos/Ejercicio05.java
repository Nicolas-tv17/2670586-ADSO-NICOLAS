import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        
        System.out.print("Ingrese numero N: ");
        int numero = entrada.nextInt();

        System.out.println("Factorial: ");
        System.out.print("          ");
        int factorial = 1;
        for (int i = 1; i <= numero; i=i+1) {
            System.out.print(i);
            factorial *= i;

            if (i != numero) {
                System.out.print(" x ");
            }
        }

        System.out.println(" = " + factorial);
    }
}

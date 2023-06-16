import java.util.Scanner;

public class Ejercicio6{
    public static void main (String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("--> Ingresar la posicion del n-esimo Fibonacci: ");
        int posicion = entrada.nextInt();


        int valorinicial = 0;
        int nesimo = 1;
        int posicionfinal = 0;

        if (posicion == 1) {
            posicionfinal = valorinicial;
        } else if (posicion == 2) {
            posicionfinal = nesimo;
        } else {
            for (int i = 3; i <= posicion; i=i+1) {
                posicionfinal = valorinicial + nesimo;
                valorinicial = nesimo;
                nesimo = posicionfinal;
            }
        }

        System.out.println("--> El n-ésimo número Fibonacci es: " + posicionfinal);


    }
}
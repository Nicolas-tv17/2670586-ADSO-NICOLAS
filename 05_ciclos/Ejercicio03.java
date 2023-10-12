import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero = entrada.nextInt();

        System.out.println("Primos aleatorios: ");

        int contador = 0;
        int incremento = 2;

        while (contador < numero) {

            int divisores = 0;

            for (int i = 2; i <= Math.sqrt(incremento); i++) {
                if (incremento % i == 0) {
                    divisores++;
                }
            }

            if (divisores == 0) {
                contador++;
                System.out.println("                  Primo " + contador + " Generado -> " + incremento);
            }

            incremento++;
        }

    
    }
    
}

import java.util.Scanner;
import java.util.Random;

public class Ejercicio6 {
    public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) {
            Random random = new Random();

            System.out.print("Ingresa un numero: ");
            int tamaño = entrada.nextInt();

            System.out.print("Ingresa un numero M : ");
            int numero = entrada.nextInt();

            int [] arreglo = new int[tamaño];

            for(int i = 0; i < arreglo.length;i++){
                arreglo[i] = random.nextInt(100);
            }

            int num = 0;
            for(int i = 0; i < arreglo.length;i++){
                if (numero == arreglo [i]){
                    num++;
                }
            }

            for(int i = 0; i < arreglo.length;i++){
                System.out.println("---> "+arreglo[i]);
            }

            System.out.print("veces que aparece el "+numero+" es: "+num);
        }
    }
}

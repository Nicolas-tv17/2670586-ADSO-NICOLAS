import java.util.Scanner;
import java.util.Random;

public class Ejercicio1{
    public static void main(String[] args){

        try (Scanner entrada = new Scanner(System.in)) {
            Random random = new Random();

            System.out.print("Ingresa Un numero: ");
            int numero = entrada.nextInt();

            int [] arreglo = new int [numero];
            int acumuldor = 0;

            for(int i = 0; i < arreglo.length;i++){
                arreglo[i] = random.nextInt(100);
                acumuldor =  acumuldor + arreglo[i];
            }

            for(int i = 0; i < arreglo.length;i++){
                System.out.println("Numeros: "+arreglo[i]);
            }
            
            System.out.println("Suma = "+acumuldor);
        }
    }
}
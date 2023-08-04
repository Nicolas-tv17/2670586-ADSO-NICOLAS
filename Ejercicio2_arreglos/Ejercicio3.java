import java.util.Scanner;
import java.util.Random;

public class Ejercicio3 {
    public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) {
            Random random = new Random();

            System.out.print("Ingrese el Tamaño: ");
            int tamaño = entrada.nextInt();

            int [] arreglo = new int [tamaño];
            int mayor = 0;

            for(int i = 0; i < arreglo.length;i++){
                arreglo [i] = random.nextInt(100);
                if (arreglo[i] > mayor){
                    mayor = arreglo[i];
                }
            }
            
            for(int i = 0; i < arreglo.length;i++){
                System.out.println("----> "+arreglo[i]);
            }
            
            System.out.println("El numero mayor es: "+mayor);
            
        }
    }
}

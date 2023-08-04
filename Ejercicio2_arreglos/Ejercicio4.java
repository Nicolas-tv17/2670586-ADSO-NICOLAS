import java.util.Scanner;
import java.util.Random;

public class Ejercicio4 {
    public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) {
            Random random = new Random();

            System.out.print("Ingresa un Numero: ");
            int tamaño = entrada.nextInt();
            
            int [] arreglo = new int [tamaño];
            
            for(int i = 0; i < arreglo.length;i++){
                arreglo[i] = random.nextInt(100);
            }
            
            for(int i = 0; i < arreglo.length;i++){
                System.out.println("-->  "+arreglo[i]);
            }
            
            int menor = arreglo[0];

            for(int i = 0; i < arreglo.length;i++){
                if(arreglo[i] < menor){
                    menor = arreglo[i];
                }
            }
            
            System.out.println("El numero menor es: "+menor);

        }
    }
}

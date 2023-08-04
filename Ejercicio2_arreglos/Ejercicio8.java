import java.util.Scanner;
import java.util.Random;

public class Ejercicio8 {
    public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) {
            Random random = new Random();

            System.out.print("Ingresa el tamaño del arreglo: ");
            int tamaño = entrada.nextInt();

            int [] arreglo_normal = new int[tamaño];

            for(int i = 0; i < arreglo_normal.length;i++){
                arreglo_normal[i] = random.nextInt(100)+1;
            }

            System.out.println("Arreglo original: ");
            for(int i = 0; i < arreglo_normal.length;i++){
                System.out.println("---> "+arreglo_normal[i]);
            }

            int par = 0;
            int impares = 0;

            for(int i = 0; i < arreglo_normal.length;i++){
                if(arreglo_normal[i]%2 == 0){
                    par++ ;
                }else{
                    impares++;
                }
            }

            int [] arreglo_pares = new int[par];
            int [] arreglo_impares = new int[impares];

            int indicePares = 0;
            int indiceImpares = 0;

            for (int i = 0; i < arreglo_normal.length; i++) {
                if (arreglo_normal[i] % 2 == 0) {
                    arreglo_pares[indicePares] = arreglo_normal[i];
                    indicePares++;
                } else {
                    arreglo_impares[indiceImpares] = arreglo_normal[i];
                    indiceImpares++;
                }
            }

            System.out.println("Numeros pares: ");
            for(int i = 0; i < arreglo_pares.length;i++){
                System.out.println("-> "+arreglo_pares[i]);
            }
            
            System.out.println("Numeros IMPARES: ");
            for(int i = 0; i < arreglo_impares.length;i++){
                System.out.println("-> "+arreglo_impares[i]);
            }


            
        }
    }
}

import java.util.Scanner;

public class Ejercicio1{
    public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Ingrese cuantos nombres desea ingresar: ");
            int tamaño = entrada.nextInt();

            String [] arreglo = new String [tamaño];

            System.out.print("Ingrese los nombres: ");
            for(int i = 0;i < arreglo.length;i++){
                System.out.println("- ");
                arreglo [i] = entrada.next();
            }

            for(int i = 0; i < arreglo.length;i++){
                System.out.println("---> "+arreglo[i]);
            }
        }
    }
}
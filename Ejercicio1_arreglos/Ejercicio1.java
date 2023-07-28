import java.util.Scanner;

public class Ejercicio1{
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int num = entrada.nextInt();

        int arreglo [] = new int [num];

        for(int i = 0; i < arreglo.length; i++){
            arreglo [i] = (i+1)*2-1;
        }

        for(int i = 0; i < arreglo.length; i++){
            System.out.println("Numero"+i+" es: "+arreglo[i]);
        }

    }
}
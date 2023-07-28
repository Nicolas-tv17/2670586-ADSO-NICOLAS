import java.util.Scanner;

public class Ejercicio2{
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int num = entrada.nextInt();

        int arreglo [] = new int [num];

        int inicial = 2;
        int indice = 0;

        while (indice < num) {
            boolean nprimo = true;
            for (int i = 2; i <= inicial / 2; i++) {
                if (inicial % i == 0) {
                    nprimo = false;
                    break;
                }
            }
            if (nprimo) {
                arreglo[indice] = inicial;
                indice++;
            }
            inicial++;
        }

        for(int i = 0; i < arreglo.length; i++){
            System.out.println("Numero: "+i+" es: "+arreglo[i]);
        }


    }
}
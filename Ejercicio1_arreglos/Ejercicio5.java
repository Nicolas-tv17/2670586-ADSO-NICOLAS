import java.util.Scanner;

public class Ejercicio5{
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero = entrada.nextInt();

        int [] arreglo = new int [numero];

        for(int i = 0; i < arreglo.length; i++){
            System.out.print("--> Ingrese numero "+i+" : ");
            arreglo[i] = entrada.nextInt();
        }

        System.out.print("Arreglo: { ");
        for(int i = 0; i < arreglo.length; i++){
            if(i > 0){
                System.out.print(" , ");
            }
            System.out.print(+arreglo[i]);
        }
        System.out.println(" }");


        System.out.print("Ingresa Movimientos: ");
        int movimientos = entrada.nextInt();

        int aux = 0;

        for(int n = 0; n < arreglo.length; n++){
            
            System.out.println("Movimiento " +n+ " es: "+arreglo[n]);

            for(int i = 0; i < arreglo.length;i++){
                if(arreglo[n] < arreglo[n+1]){
                    aux = arreglo[n];
                    arreglo[n] = arreglo[n+1];
                    arreglo[n+1] = aux; 
                }
            }
        }
    }
}

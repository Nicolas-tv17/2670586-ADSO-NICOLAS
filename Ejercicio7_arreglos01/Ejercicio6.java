import java.util.Scanner;

public class Ejercicio6{
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa el tamaño del arreglo: ");
        int tamaño = entrada.nextInt();

        int [] arreglo = new int [tamaño];
        int [] primos = new int [tamaño];
        int [] noprimos = new int [tamaño];


        for(int i = 0; i < arreglo.length; i++){
            System.out.print("Ingresa numero "+i+" = ");
            arreglo [i] = entrada.nextInt();
        }
        
        System.out.print("Arreglo Original: { ");
        for(int i = 0; i < arreglo.length; i++){
            if(i > 0){
                System.out.print(" , ");
            }
            System.out.print(+arreglo[i]);
            if(arreglo[i] % 2 == 0){
                arreglo[i] = primos[i];
            }else{
                arreglo[i] = primos[i];
            }    
        }
        System.out.println(" }");

        

        System.out.print("Arreglo Primos: { ");
        for(int i = 0; i < arreglo.length; i++){
            if(i > 0){
                System.out.print(" , ");
            }
            System.out.print(+primos[i]);
        }
        System.out.println(" }");

        System.out.print("Arreglo NO Primos: { ");
        for(int i = 0; i < arreglo.length; i++){
            if(i > 0){
                System.out.print(" , ");
            }
            System.out.print(+noprimos[i]);
        }
        System.out.println(" }");

    }
}
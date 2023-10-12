import java.util.Scanner;

public class Condicion5{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese 3 numeros de manera ascendente:");

        System.out.print("Ingrese el primer número: ");
        int numero1 = entrada.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int numero2 = entrada.nextInt();

        System.out.print("Ingrese el tercer número: ");
        int numero3 = entrada.nextInt();

        if (numero1 < numero2 && numero2 < numero3){ 
            System.out.println("Los números están en orden ascendente");
        }else{
            System.out.println("Los números no están en orden ascendente");
        }
    }
}
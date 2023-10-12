import java.util.Scanner;

public class Ejercicio13{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa un numero: ");
        int numero = entrada.nextInt();


        if(numero >=0){
            if(numero % 2 == 0 && numero % 3 == 0 && numero % 5 == 0){
                System.out.println("El numero "+numero+" si es divisible por 2, 3 y 5.");
            }else{
                System.out.println("El numero "+numero+" NO es divisible por 2, 3 y 5."); 

            }
        }else{
            System.out.println("Ingrese un numero valido.");
        }

    }
}
import java.util.Scanner;

public class Ejercicio3{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa un numero: ");
        int numero = entrada.nextInt();

        if(numero % 2 ==0){
            System.out.print("El numero ingresado es par.");
        }else{
            System.out.print("El numero ingresado NO es par.");
        }
        
        
    }
}
import java.util.Scanner;

public class Ejercicio6{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Averigua si puedes votar ingresando tu edad.");
        System.out.print("Por favor ingresa tu edad: ");
        int edad = entrada.nextInt();

        if(edad >= 18){
            System.out.print("Puedes votar.");
        }else{
            System.out.print("Usted NO Puede votar.");
        }
    }
}
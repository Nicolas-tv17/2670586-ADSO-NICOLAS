import java.util.Scanner;

public class Ejercicio5{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa el año");
        int año = entrada.nextInt();

        boolean bisiesto = (año % 4 == 0);

        if(bisiesto){
            System.out.println("El año es bisiesto. ");
        }else{
            System.out.println("El año es normal. ");

        }

    }
}
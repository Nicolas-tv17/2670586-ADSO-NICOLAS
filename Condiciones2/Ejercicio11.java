import java.util.Scanner;

public class Ejercicio11{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);


        System.out.println("Ingrese una cadena de numeros: ");
        String cadena = entrada.nextLine();

        int numero = Integer.parseInt(cadena);


        if(numero % 2 == 0){
            System.out.println("es par");
        }else{
            System.out.println("es impar");
        }

    }

}
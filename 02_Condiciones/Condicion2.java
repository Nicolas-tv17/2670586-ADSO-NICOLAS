import java.util.Scanner;

public class Condicion2{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa un numero de maximo 3 digitos: ");
        int numero = entrada.nextInt();

        if(numero >= 100 && numero <= 999){
            if(numero % 2 == 0){
                System.out.println("El numero ingresado es par");
            }else{
                System.out.println("El numero ingresado es impar");
            }
        }else{
            System.out.println("El numero ingresado no tiene 3 digitos.");
        }
    }
}
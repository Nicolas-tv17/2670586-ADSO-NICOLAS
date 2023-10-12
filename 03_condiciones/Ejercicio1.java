import java.util.Scanner;

public class Ejercicio1{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa un numero (maximo de 1.000.000.000): ");
        int numero = entrada.nextInt();

        if(numero > 0 ){
            System.out.print("El numero ingresado es Positivo .");
        }else if(numero < 0 ){
            System.out.print("El numero ingresado es Negativo .");
        }else{
            System.out.print("El numero ingresado es 0.");
        }
    }
}
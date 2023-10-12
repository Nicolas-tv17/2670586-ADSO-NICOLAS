import java.util.Scanner;

public class Ejercicio2{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa primer numero: ");
        int numero1 = entrada.nextInt();

        System.out.print("Ingresa segundo numero: ");
        int numero2 = entrada.nextInt();

        System.out.print("Ingresa tercer numero: ");
        int numero3 = entrada.nextInt();

        System.out.print("Ingresa cuarto numero: ");
        int numero4 = entrada.nextInt();

        if(numero1 > numero2 && numero1 > numero3 && numero1 > numero4){
            System.out.print("El Primer Numero: "+numero1+" es mayor");
        }else if(numero2 > numero1 && numero2 > numero3 && numero2 > numero4){
            System.out.print("El Segundo Numero: "+numero2+" 2 es mayor");
        }else if(numero3 > numero1 && numero3 > numero2 && numero3 > numero4){
            System.out.print("El Tercer Numero: "+numero3+" 3 es mayor");
        }else if(numero4 > numero1 && numero4 > numero2 && numero4 > numero3){
            System.out.print("El Cuarto Numero: "+numero4+" 4 es mayor");
        }
    }
}
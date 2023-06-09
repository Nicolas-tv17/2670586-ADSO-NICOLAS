import java.util.Scanner;

public class Ejercicio7{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un número entero de 9 digitos en especifico.");
        System.out.println("-------------------------------------");
        System.out.print("Ingrese el número: ");
        int numero = entrada.nextInt();

        int numeronormal = numero;
        int numeroinvertido = 0;


        int digito1 = (numero/100000000)%10;
        int digito2 = (numero/10000000)%10;
        int digito3 = (numero/1000000)%10;
        int digito4 = (numero/100000)%10;
        int digito5 = (numero/10000)%10;
        int digito6 = (numero/1000)%10;
        int digito7 = (numero/100)%10;
        int digito8 = (numero/10)%10;
        int digito9 = (numero%10);
        
        
        if(numero >99999999 && numero <=999999999){
            if(digito1 == digito9 && digito2 == digito8 && digito3 == digito7 && digito4 == digito6){
            System.out.print("El numero es palindromo.");
            }else{
            System.out.print("El numero NO es palindromo.");
             }
        }else{
            System.out.print("Ingrese un numero valido.");
        }


    }
}
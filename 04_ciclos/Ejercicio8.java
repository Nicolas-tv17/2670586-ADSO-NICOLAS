import java.util.Scanner;

public class Ejercicio8{
    public static void main (String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("--> Ingrese un Numero: ");
        int numero = entrada.nextInt();


        if(numero < 100000){
            String numeroStr = String.valueOf(numero);
            System.out.println("Los dígitos separados son:");
        
            for (int i = 0 ; i < numeroStr.length(); i=i+1) {

                int n = i + 1 ;
                

                System.out.print("El digito 0"+n+" es: " );
                System.out.println(numeroStr.charAt(i));
            }
        }else{
            System.out.print("Ingrese un numero Valido...");
        }


    }
}
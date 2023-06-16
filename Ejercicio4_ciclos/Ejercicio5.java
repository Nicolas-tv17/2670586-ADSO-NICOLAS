import java.util.Scanner;

public class Ejercicio5{
    public static void main (String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = entrada.nextInt();

        System.out.print("La sucesión Fibonacci es: ");
        
        int valoractual = 0;
        int siguientevalor = 1;
        
        for (int i = 1; i <= numero; i=i+1) {
            System.out.print(valoractual + ", ");
            
            int temp = valoractual + siguientevalor;
            valoractual = siguientevalor;
            siguientevalor = temp;
        }

        
    }
}
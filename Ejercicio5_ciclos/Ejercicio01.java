import java.util.Scanner;

public class Ejercicio01{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero entre 1 y 6: ");
        int numero = entrada.nextInt();

        System.out.print("El resultado costruido es: ");

        int numeroaleatorio = 0;
        int summ = 0;

        for(int i = 1; i <= numero; i=i+1){

            
            numeroaleatorio = (int)(Math. random()*10-1);

            System.out.print(+numeroaleatorio);

            numeroaleatorio = numeroaleatorio * 2;
        }
        System.out.println("");


        System.out.print("Resultado producto: "+numeroaleatorio);


    }
}
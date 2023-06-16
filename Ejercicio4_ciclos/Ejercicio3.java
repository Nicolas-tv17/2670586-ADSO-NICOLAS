import java.util.Scanner;

public class Ejercicio3{
    public static void main (String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la altura de la pirámide: ");
        int altura = entrada.nextInt();


        for (int i = 1; i <= altura; i++) {
            for (int espacio = 1; espacio <= altura - i; espacio=espacio+1) {
                System.out.print(" ");
            }

            for (int equis = 1; equis <= i; equis = equis+1) {
                System.out.print("X ");
            }

            System.out.println(); 
        }
    }
}
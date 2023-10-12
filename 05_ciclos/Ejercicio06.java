import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese número N: ");
        int numeroN = entrada.nextInt();

        System.out.print("Ingrese número M: ");
        int numeroM = entrada.nextInt();
        
        System.out.println("");

        for (int i = numeroN; i <= numeroM; i=i+1) {

            System.out.println("Factorial de " + i + " (" + i + "!): ");
            System.out.print("                      ");
            int factorial = 1;

            StringBuilder descripcion = new StringBuilder(); 

            //StringBuilder es una clase en Java que se utiliza para construir y manipular cadenas de caracteres de manera eficiente. A diferencia de la clase String, StringBuilder es mutable, lo que significa que se pueden realizar modificaciones en el objeto StringBuilder sin tener que crear un nuevo objeto en cada operación.//


            for (int m = 1; m <= i; m=m+1) {
                factorial *= m;
                descripcion.append(m);
                if (m != i) {
                    descripcion.append(" x ");
                }
            }
            System.out.println(descripcion + " = " + factorial);
        }
    }
}

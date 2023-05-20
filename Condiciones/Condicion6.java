import java.util.Scanner;

public class Condicion6{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un número de 6 dígitos: ");
        int numero = entrada.nextInt();

         if (numero >= 100000 && numero <= 999999) {
            System.out.println("// ------------------------------------------------------------------- //");
            System.out.println("Menú:                                                                  //");
            System.out.println("   1. Primer Digito.    2. Segundo Digito.     3. Tercer Digito        //");
            System.out.println("   4. Cuarto Digito.    5. Quinto Digito.      6. Sexto Digito         //");
            System.out.println("// ------------------------------------------------------------------- //");

            System.out.print("Seleccione una opción: ");
            int opcion = entrada.nextInt();

            if (opcion == 1) {
                int digito = numero / 100000;
                System.out.println("El primer digito es: " + digito);
            } else if (opcion == 2) {
                int digito = (numero / 10000) % 10;
                System.out.println("El segundo digito es: " + digito);
            } else if (opcion == 3) {
                int digito = (numero / 1000) % 10;
                System.out.println("El tercer digito es: " + digito);
            } else if (opcion == 4) {
                int digito = (numero / 100) % 10;
                System.out.println("El cuarto digito es: " + digito);
            } else if (opcion == 5) {
                int digito = (numero / 10) % 10;
                System.out.println("El quinto digito es: " + digito);
            } else if (opcion == 6) {
                int digito = numero % 10;
                System.out.println("El sexto digito es: " + digito);
            } else {
                System.out.println("opcion invalida");
            }
        } else {
            System.out.println("el numero ingresado no tiene 6 digitos");
        }

    }
}
import java.util.Scanner;

public class Ejercicio12{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el precio original: ");
        int preciooriginal = entrada.nextInt();

        System.out.print("Ingrese el porcentaje de descuento: ");
        int porcentaje = entrada.nextInt();

        if (porcentaje >= 0 && porcentaje <= 100) {
            double descuento = preciooriginal * (porcentaje / 100.0);
            double preciocondescuento = preciooriginal - descuento;

            System.out.println("Descuento aplicado: " + descuento);
            System.out.println("Precio con descuento: " + preciocondescuento);
        } else {
            System.out.println("El porcentaje de descuento ingresado no es válido.");
        }

    }
}
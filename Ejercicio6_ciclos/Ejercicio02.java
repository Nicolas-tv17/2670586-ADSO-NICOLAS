import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la cantidad total financiada: ");
        double cantidadfinanciada = entrada.nextDouble();

        System.out.print("Ingrese la cantidad de cuotas pagadas: ");
        int cuotaspagadas = entrada.nextInt();

        System.out.print("Ingrese el valor de cada cuota: ");
        double valorcuota = entrada.nextDouble();

        double totalintereses = (cuotaspagadas * valorcuota) - cantidadfinanciada;
        double porcentajeintereses = (totalintereses / cantidadfinanciada) * 100;

        System.out.println("El total de intereses pagados es: " + totalintereses);
        System.out.println("El porcentaje de intereses pagados es: " + porcentajeintereses + "%");

    }
}
import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el valor total a financiar: ");
        double valorTotal = entrada.nextDouble();

        System.out.print("Ingrese la tasa de interés (%): ");
        double tasaInteres = entrada.nextDouble();

        System.out.print("Ingrese la cantidad de cuotas: ");
        int cuotas = entrada.nextInt();

        double tasaInteresMensual = tasaInteres / 100 / 12;
        double cuota = valorTotal * (tasaInteresMensual / (1 - Math.pow(1 + tasaInteresMensual, -cuotas)));

        System.out.println("\nDETALLE DE CADA CUOTA:");
        double deudaTotal = valorTotal;
        for (int i = 1; i <= cuotas; i++) {
            double interes = deudaTotal * tasaInteresMensual;
            double abonoCapital = cuota - interes;
            deudaTotal -= abonoCapital;
            System.out.println("Cuota " + i + ":");
            System.out.println("  - Valor de la cuota: " + cuota);
            System.out.println("  - Valor del interés: " + interes);
            System.out.println("  - Valor del abono a capital: " + abonoCapital);
            System.out.println("  - Deuda total restante: " + deudaTotal);
            System.out.println();
        }
    }
}
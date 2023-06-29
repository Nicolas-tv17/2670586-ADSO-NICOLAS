import java.util.Scanner;

public class Ejercicio01{
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        System.out.print("==> Ingrese Un Saldo Total: ");
        int saldo = entrada.nextInt();
        
        System.out.print("==> Cantidad de pagos: ");
        int cantidadpagos = entrada.nextInt();
        

        for(;;){
            System.out.println("-------------- FORMAS DE PAGO --------------");
            System.out.println("        1. Pagos de igual valor.");
            System.out.println("        2. Primer pago diferente.");
            System.out.println("        3. Ultimo pago diferente.");
            System.out.println("        4. Primer y ultimo pago diferente.");
            System.out.println("        5. Salir.");

            System.out.println("==> Ingrese Forma de Pago: ");
            int formapago = entrada.nextInt();

            switch(formapago){

                case 1:
                System.out.println("------------- SUS PAGOS SERAN -------------");
                int metodouno = saldo / cantidadpagos;

                for(int i = 1; i <= cantidadpagos; i=i+1){
                    System.out.println("   Mes "+i+" : $ "+metodouno);
                }

                break;

                case 2:
                System.out.println("------------- SUS PAGOS SERAN -------------");
                    
                System.out.print("Ingrese el monto del primer pago: ");
                int primerpago = entrada.nextInt();

                int pagorestanteuno = saldo - primerpago;
                int pagorestantedos = pagorestanteuno / (cantidadpagos - 1);

                System.out.println("Mes 01: $" + primerpago);
    
                for (int i = 2; i <= cantidadpagos; i++) {
                    System.out.println("Mes " + i + ": $" + pagorestantedos);
                }       

                break;

                case 3:
                System.out.println("------------- SUS PAGOS SERAN -------------");
                int pagorestante = saldo / (cantidadpagos - 1);

                for (int i = 1; i < cantidadpagos; i++) {
                    System.out.println("   Mes " + i + ": $" + pagorestante);
                }

                System.out.println("   Mes " + cantidadpagos + ": $" + (saldo - (pagorestante * (cantidadpagos - 1))));

                break;
                
                case 4:
                System.out.println("------------- SUS PAGOS SERAN -------------");

                System.out.print("Ingrese el monto del primer pago: ");
                primerpago = entrada.nextInt();

                int pagorestanteprimero = saldo - primerpago;
                int pagorestanteultimo = pagorestanteprimero / (cantidadpagos - 2);

                System.out.println("Mes 01: $" + primerpago);

                for (int i = 2; i < cantidadpagos; i++) {
                    System.out.println("Mes " + i + ": $" + pagorestanteultimo);
                }
                System.out.println("Mes " + cantidadpagos + ": $" + (saldo - primerpago - pagorestanteultimo * (cantidadpagos - 2)));
                break;

                case 5:
                System.out.println("Saliendo...");
                return;

                default:
                System.out.println("Ingrese una opcion valida.");
                break;
            }
        }
    }
}
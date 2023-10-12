import java.util.Scanner;

public class Ejercicio9{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese las horas trabajadas.");
        int horastrabajadas = entrada.nextInt();

        System.out.println("Ingrese su sueldo por hora.");
        int sueldohora = entrada.nextInt();
        
        double sueldototal;
        double salarioextra;
        double sueldonormal;
        double horasextras;

        if (horastrabajadas > 40) {
            horasextras = horastrabajadas - 40;
            sueldonormal = 40 * sueldohora;
            salarioextra = horasextras * (sueldohora * 1.5);
            sueldototal = sueldonormal + salarioextra;
        } else {
            sueldototal = horastrabajadas * sueldohora;
        }

        System.out.println("El salario semanal es: " + sueldototal);

    }
}
import java.util.Scanner;

public class Condicion4{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa el primer numero: ");
        int primer_numero = entrada.nextInt();

        System.out.print("Ingresa el segundo numero: ");
        int segundo_numero = entrada.nextInt();

        System.out.print("Ingresa el tercer numero: ");
        int tercer_numero = entrada.nextInt();

        int mayor = primer_numero;
        int menor = primer_numero;

        if(segundo_numero > mayor){
            mayor = segundo_numero;
        }
        if(tercer_numero > mayor){
            mayor = tercer_numero;
        }

        if(segundo_numero < menor){
            menor = segundo_numero;
        }
        if(tercer_numero < menor){
            menor = tercer_numero;
        }

        System.out.println("El numero mayor es: "+mayor);
        System.out.println("El numero menor es: "+menor);
    }
}
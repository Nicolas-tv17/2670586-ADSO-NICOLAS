import java.util.Scanner;

public class Ejercicio8{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);


        System.out.println("Ingrese la base del triángulo: ");
        double base = entrada.nextDouble();
        
        System.out.println("Ingrese la altura del triángulo: ");
        double altura = entrada.nextDouble();
        
        if (base > 0 && altura > 0) {
            double area = (base * altura) / 2;
            System.out.println("El área del triángulo es: " + area);
        } else {
            System.out.println("Error: La base y la altura deben ser valores positivos.");
        }
    }
}
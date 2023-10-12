import java.util.Scanner;

public class Ejercicio4{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);  

        System.out.println("Promedio de notas.");
        System.out.print("Primera nota: ");
        float nota1 = entrada.nextFloat();

        System.out.print("Segunda nota: ");
        float nota2 = entrada.nextFloat();

        System.out.print("Tercer nota: ");
        float nota3 = entrada.nextFloat();

        float promedio = (nota1 + nota2 + nota3) / 3;
        System.out.println("El promedio es: "+promedio);

        if(promedio >= 7){
            System.out.print("=> Aprovado.");
        }else{
            System.out.print("=> Reprovado.");
        }
    }
}
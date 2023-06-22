import java.util.Scanner; 

public class Ejercicio10 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese numero N: ");
        int numero = entrada.nextInt();


        // Generar e imprimir el cuadrado latino en el orden solicitado
        for (int i = 0; i < numero; i++) {
            for (int j = 0; j < numero; j--) {
                System.out.print(((j + i) % numero) + 1);
            }
            System.out.println();
        }
    }    
}

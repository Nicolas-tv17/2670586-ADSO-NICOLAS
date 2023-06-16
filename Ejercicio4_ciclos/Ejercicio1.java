import java.util.Scanner;

public class Ejercicio1{
    public static void main(String[] args) {
        
        Scanner entrada =  new Scanner(System.in);

        System.out.print("Ingrese cantidad de  notas: ");
        int cantidadnotas = entrada.nextInt();
        
        double sumanotas = 0;
        
        
        for( int i=1; i<=cantidadnotas; i=i+1 ){
            System.out.print("=> nota: "+i+" = ");
            double notas = entrada.nextDouble();
            sumanotas = sumanotas + notas;

		}

        double promedio = sumanotas/cantidadnotas;
            
        System.out.print("El promedio de nota obtenida es = "+promedio);

    }
}
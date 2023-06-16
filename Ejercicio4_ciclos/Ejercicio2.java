import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de materias: ");
        int cantidadmaterias = entrada.nextInt();
        
        
        int sumacredito = 0;
        double totalnotas = 0;
        double sumanotaporcredito;
       
        for(int i=1 ;i <= cantidadmaterias; i=i+1){
            System.out.print("=> Nota Materia "+i+" = ");
            double notamateria = entrada.nextDouble();
            
            System.out.print("=> Creditos Materia "+i+" = ");
            int creditomateria = entrada.nextInt();
            
            System.out.println("  ");
            
            sumacredito = sumacredito + creditomateria;
            sumanotaporcredito = notamateria * creditomateria;
            totalnotas = sumanotaporcredito + totalnotas;
            
        }
        double promedioponderado = totalnotas / sumacredito;
        

        System.out.println("Total de creditos = "+sumacredito);
        System.out.println("Promedio del semestre = "+promedioponderado);

    }
    
}

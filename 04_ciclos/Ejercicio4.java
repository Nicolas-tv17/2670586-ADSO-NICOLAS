import java.util.Scanner;

public class Ejercicio4{
    public static void main (String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("|------------- Bienvenido ------------|");
        System.out.println("| 1. Docente                          |");
        System.out.println("| 2. Estudiante                       |");
        System.out.println("| 3. Salir                            |");
        System.out.println("|-------------------------------------|");
        System.out.print("Ingrese una opción: ");


        int opcion;

        do {
            opcion = entrada.nextInt();

            if (opcion == 1) {
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

            } else if (opcion == 2) {
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
                
            } else if (opcion == 3) {
                System.out.println("Saliendo...");
            } else {
                System.out.println("Seleccione una opción válida.");
            }
        } while (opcion != 3);

    }
}
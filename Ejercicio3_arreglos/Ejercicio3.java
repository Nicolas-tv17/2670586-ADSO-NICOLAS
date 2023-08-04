import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) {
            int numero_registros = 100;
            int opcion;

            String[] arreglo = new String[numero_registros];
            do {

                System.out.println("");

                System.out.println("                              Memoria disponible: " + numero_registros + " Registros.");
                System.out.println("1: Registrar Cliente.");
                System.out.println("2: Ver lista de clientes.");
                System.out.println("3: Editar clientes.");
                System.out.println("4: Eliminar cliente");
                System.out.println("5: Salir");
                System.out.println("");

                System.out.print("Ingrese la opción: ");
                opcion = entrada.nextInt();

                switch (opcion) {
                    case 1:
                        if (numero_registros > 0) {
                            System.out.print("--->   Ingresa tu nombre completo: ");
                            entrada.nextLine(); 
                            arreglo[100 - numero_registros] = entrada.nextLine();
                            numero_registros--;
                        } else {
                            System.out.println("No se puede registrar un nuevo cliente.");
                        }
                        break;

                    case 2:
                        for (int i = 0; i < 100 - numero_registros; i++) {
                            System.out.println("--> "+arreglo[i]);
                        }
                        break;

                    case 3:
                        System.out.print("--->   Ingrese el nombre del cliente a editar: ");
                        entrada.nextLine(); 
                        String nombre_editar = entrada.nextLine();
                        int editar = 1;
                        for (int i = 0; i < 100 - numero_registros; i++) {
                            if (arreglo[i].equals(nombre_editar)) {
                                editar = i;
                                break;
                            }
                        }
                        if (editar != 1) {
                            System.out.print("--->   Ingrese el nuevo nombre completo: ");
                            arreglo[editar] = entrada.nextLine();
                            System.out.println("Cliente editado exitosamente.");
                        } else {
                            System.out.println("Nombre de cliente no encontrado.");
                        }
                        
                        break;

                    case 4:
                        System.out.print("--->   Ingrese el nombre del cliente a eliminar: ");
                        entrada.nextLine();
                        String nombre_eliminar = entrada.nextLine();
                        int eliminar = 1;
                        for (int i = 0; i < 100 - numero_registros; i++) {
                            if (arreglo[i].equals(nombre_eliminar)) {
                                eliminar = i;
                                break;
                            }
                        }
                        if (eliminar != 1) {
                            for (int i = eliminar; i < 100 - numero_registros - 1; i++) {
                                arreglo[i] = arreglo[i + 1];
                            }
                            arreglo[100 - numero_registros - 1] = null;
                            numero_registros++;
                            System.out.println("Cliente eliminado exitosamente.");
                        } else {
                            System.out.println("Nombre de cliente no encontrado.");
                        }
                        
                        break;

                    case 5:
                        System.out.println("Saliendo...");
                        break;

                    default:
                        System.out.println("Opcion invalida.");
                        break;
                }
            } while (opcion != 5);
        }
    }
}

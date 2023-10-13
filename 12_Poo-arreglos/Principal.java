import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada_numeros = new Scanner(System.in);
        Scanner entrada_texto = new Scanner(System.in);
        
        Perros [] listado = new Perros[20]; 

        // listado[0] = new Perros("Lucas", "Sara", 3, "Chihuahua", 2.4, 60);
        // listado[1] = new Perros("Tobi", "Cata", 1, "Golden", 30.4, 90);

        // System.out.print("Ingresa Nombre Del Perro: ");
        // String nombre = entrada_texto.nextLine();
        // System.out.print("Ingresa Nombre Del Propietario: ");
        // String propietario = entrada_texto.nextLine();
        // System.out.print("Ingresa Edad De La Mascota: ");
        // int edad = entrada_numeros.nextInt();
        // System.out.print("Ingresa Raza De La Mascota: ");
        // String Raza = entrada_texto.nextLine();
        // System.out.print("Ingresa Peso De La Mascota: ");
        // double peso = entrada_numeros.nextDouble();
        // System.out.print("Ingresa Nivel de Energia De La Mascota: ");
        // int energia = entrada_numeros.nextInt();
        // listado[2] = new Perros(nombre, propietario, edad, Raza, peso, energia);
        
        for (int i = 0; i < listado.length; i++ ){

            if(listado[i] != null){
                System.out.println("");
                listado[i].imprimirDetalle();
            }
        }


        Perros mas_pesado = listado[0];
        for(int i = 0; i < listado.length; i++){
            if( listado[i] != null){
                if ( listado[i].getPeso() >= mas_pesado.getPeso() ){
                    mas_pesado = listado[i];
                }
            }
        }

        if(mas_pesado != null){
            System.out.println("Nombre mas pesado: "+mas_pesado.getNombre());
            System.out.println("Propietraio de mas pesado: "+mas_pesado.getPropietario());
            System.out.println("Peso de mas pesado: "+mas_pesado.getPeso());
        }else{
            System.out.println("La lista no contiene datos");
        }
        
    }
}

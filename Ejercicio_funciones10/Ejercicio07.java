import java.util.Random;

public class Ejercicio07 {
    public static void main(String[] args) {

        int arreglo [] = new int [10];

        System.out.println("");
        
        llenarArreglo(arreglo);
        imprimirArreglo(arreglo);

        System.out.println("");
    }

    public static void llenarArreglo(int arreglo[]){
        for(int i = 0; i < arreglo.length; i++){
            Random rand = new Random();
            arreglo[i] = rand.nextInt(101);
        }
    }

    public static void imprimirArreglo(int [] arreglo){
        for(int i = 0; i < arreglo.length; i++){
            System.out.println("Elemento "+i+" : "+arreglo[i]);
        }
    }
}

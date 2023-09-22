public class Ejercicio10 {
    public static void main(String[] args) {
        
        int arreglo [] = {2,5,6,2,6,2,4,6};

        System.out.println("");
        System.out.println("El promedio del arreglo es: "+promedio(arreglo));
        System.out.println("");

    }

    public static double promedio(int arreglo []){
        int sumatoria = 0;
        
        for(int i = 0; i < arreglo.length; i++){
            sumatoria += arreglo[i];
        }

        double promedio = (double) sumatoria / arreglo.length;

        return promedio;
    }
}

public class Ejercicio08 {
    public static void main(String[] args) {

        int arreglo[] = new int[10];

        System.out.println("");
        llenarArreglo(arreglo);
        imprimirArreglo(arreglo);
        System.out.println("");
        
    }

    public static void llenarArreglo(int [] arreglo){
    
        for(int i = 0;i < arreglo.length; i++){
            arreglo[i] = (int) (Math.random()*100);
        }
    }

    public static void imprimirArreglo(int [] arreglo){
        for(int i = 0; i < arreglo.length; i++){
            System.out.println("Impresion N° "+i+" es: "+arreglo[i]);
        }
    }
}

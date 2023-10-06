public class Ejercicio13 {
    public static void main(String[] args) {
    
        int arreglo [] = new int [10];
        llenarArreglo(arreglo);

        System.out.println("");
        System.out.println("Orden Original: ");
        mostrarArreglo(arreglo);
        System.out.println("");
        System.out.println("");
        
        System.out.println("Arreglo Ordenado:");
        ordenarArreglo(arreglo);
        mostrarArreglooide(arreglo);
        System.out.println("");
        System.out.println("");
    }

    public static void llenarArreglo(int arreglo []){
        for(int i = 0; i < arreglo.length; i++){
            arreglo[i] = (int) ( Math.random()*101 );
        }
    }

    public static void mostrarArreglo(int arreglo []){
        for(int i = 0; i < arreglo.length; i++){
            System.out.print("[ "+arreglo[i]+" ]");
        }
    }

    public static void ordenarArreglo(int arreglo []){
        for(int i = 0; i < arreglo.length; i++){
            for (int j = 0; j < arreglo.length-1; j++){
                if(arreglo[j] > arreglo[j + 1]){
                    int tempo = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j + 1] = tempo;
                }
            }
        }
    }

    public static void mostrarArreglooide(int arreglo []){
        for(int i = 0; i < arreglo.length; i++){
            System.out.print("[ "+arreglo[i]+" ]");
        }
    }
}


public class Ejercicio09 {
    public static void main(String[] args) {
        
        int arreglo  [] = new int[10];

        System.out.println("");
        llenarArreglo(arreglo);
        imprimirArreglo(arreglo);
        System.out.println("El numero menor es: "+numeromenor(arreglo));
        System.out.println("");

    }

    public static void llenarArreglo( int [] arreglo){
        for(int i = 0;i < arreglo.length; i++){
            arreglo[i] = (int) (Math.random()*100);
        }
    }

    public static void imprimirArreglo(int arreglo []){
        for(int i = 0; i < arreglo.length;i++){
            System.out.println("Inpresion "+i+" es: "+arreglo[i]);
        }
    }

    public static int numeromenor(int arreglo []){
        int menor = arreglo[0];
        for(int i = 0; i < arreglo.length; i++){
            if(arreglo[i] < arreglo[0]){
                menor = arreglo[i];
            }
        }
        return menor;
    }
}

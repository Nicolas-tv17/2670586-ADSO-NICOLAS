public class Ejercicio14 {
    public static void main(String[] args) {
        
        int arreglo [] = {1,2,3,4,5,6,7};
        
        if(ordenadoArreglo(arreglo)){
            System.out.println("");
            System.out.println("El arreglo esta ordenado.");
            System.out.println("");
        }else{
            System.out.println("");
            System.out.println("El arreglo no esta ordenado.");
            System.out.println("");
        }

    }

    public static boolean ordenadoArreglo(int arreglo []){
        for(int i = 0; i < arreglo.length-1; i++){
            if(arreglo [i] < arreglo[i+1]){
                return true;
            }
        }
        return false;
    }
}

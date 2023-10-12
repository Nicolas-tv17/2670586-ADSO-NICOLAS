public class Ejercicio12 {
    public static void main(String[] args) {

        int arreglo [] = {1};

        System.out.println("");
        System.out.println(verificarArreglo(arreglo));
        System.out.println("");
        
    }

    public static boolean verificarArreglo(int arreglo []){
        for(int i = 0; i < arreglo.length-1; i++){
            if(arreglo [i]% 2 ==0){
                return false;
            }
        }
        return true;
    }
}

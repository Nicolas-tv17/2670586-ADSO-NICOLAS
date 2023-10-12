public class Ejercicio11 {
    public static void main(String[] args) {

        int arreglo [] = {1,2,3,4,5};

        System.out.println("");
        System.out.println(factorial(arreglo));
        System.out.println("");

    }

    public static int factorial(int arreglo[]){
        int temp = 1;

        for(int i = 1; i < arreglo.length; i++){
            temp *= arreglo[i];
            if(i < arreglo.length){
                System.out.print(i+" X ");
            }else if(i == arreglo.length-1){
                System.out.print(i+" = ");
            }
        }
        
        return temp;
    }
}

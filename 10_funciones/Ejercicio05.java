public class Ejercicio05 {

    public static void main(String[] args) {

        int resultado = potencia(5, 5);

        System.out.println("");
        System.out.println("Ejercicio cinco __ resultado de la Potencia: "+resultado);
        System.out.println("");
    }

    public static int potencia(int n1, int n2){
        if (n2 == 0 ) return 1;
        return n1 * potencia(n1 , --n2);
    }
    
}

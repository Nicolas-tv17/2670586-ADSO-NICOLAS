public class Ejercicio16 {
    public static void main(String[] args) {

        int numero = 1;
        System.out.print("Dijitos: "+contarDijitos(numero));
        
    }

    public static int contarDijitos(int numero){
        int contar = 0;

        int cuatro = 10000/10;
        int tres = 1000/10;
        int dos = 100/10;
        int uno = 10/10;

        if(numero != uno){
            contar++;
        }
        if(numero != dos){
            contar++;
        }
        if(numero != tres){
            contar++;
        }
        if(numero != cuatro){
            contar++;
        }

        return contar;
    }
}

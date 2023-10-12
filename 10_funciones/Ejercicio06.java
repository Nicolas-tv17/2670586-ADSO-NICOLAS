public class Ejercicio06 {

    public static void main(String[] args) {

        int resultado = maximoNumeros(0, 1, 1);

        System.out.println("");
        System.out.println("Ejercicio seis __ resultado de la max-tres_numeros: "+resultado);
        System.out.println("");


    }

    public static int maximoNumeros(int one, int two, int three){
        if (one > two && one > three || two > three && two > one || three > one && three > two ){
            if(one > two && one > three){
                return one;
            }
            if(two > one && two > three){
                return two;
            }
            if(three > one && three > two){
                return three;
            }
        }else{
            if(one == two && one == three){
                return one;
            }
            if(two == one && two == three){
                return two;
            }
            if(three == two && three == one){
                return three;
            }
        }
        return three;
    }
    
}

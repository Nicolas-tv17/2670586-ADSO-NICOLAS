import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numeroaleatorio = 0;
        int dia = 0;
        int mes = 0;
        int año = 0;
        int limite = 1;
        
        for(int i = 1; i <= limite; i=i+1){

            
            dia = (int)(Math. random()*31+1);
            mes = (int)(Math. random()*12+1);
            año = (int)(Math. random()*2023+1);
     
        

            System.out.print(+dia+"");
            System.out.print(+mes+"");
            System.out.print(+año+"");

        }
        System.out.println("");

        
        System.out.print("");
    }
}

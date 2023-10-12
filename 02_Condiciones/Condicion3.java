import java.util.Scanner;

public class Condicion3{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresar cordenadas en el plano cartesiano no mayor a 1.000");

        System.out.print("Ingresar cordenadas en X: ");
        int x = entrada.nextInt();

        System.out.print("Ingresar cordenadas en y: ");
        int y = entrada.nextInt();

        if(x <= 1000 && y <= 1000){
            if(x >= 0 && y >= 0){
                System.out.print("la cordenada se encuentra en el primer cuadrante");
            }else if(x <= 0 && y >= 0){
                System.out.print("la cordenada se encuentra en el Segundo cuadrante");
            }else if(x <= 0 && y <= 0){
                System.out.print("la cordenada se encuentra en el Tercer cuadrante");
            }else if(x >= 0 && y <= 0){
                System.out.print("la cordenada se encuentra en el Cuarto cuadrante");
            }
        }else{
            System.out.print("Ingresa numeros permitidos");
        }
    }
}
import java.util.Scanner;

public class Ejercicio10{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int dia;
        int mes;
        int año;

        System.out.println("------------------------------------------");
        System.out.println("Ingrese su fecha de nacimiento con DD/MM/AA");

        System.out.print("Dia: ");
        dia = entrada.nextInt();

        System.out.print("Mes: ");
        mes = entrada.nextInt();

        System.out.print("Año: ");
        año = entrada.nextInt();

        if(dia >0 && dia <=31){
            if(mes >0 && mes <=12){
                if(año > 999 && año <=2023){
                    if(año >= 2006 && año <=2023){
                        System.out.println("=> Usted es menor de edad.");
                    }else{
                        System.out.println("=> Eres mayor de edad.");
                    }
                }else{
                    System.out.println("Ingrese un año valido.");
                }
            }else{
                System.out.print("Ingresa un mes valido.");
            }
        }else{
            System.out.print("Ingresa un dia valido.");
        }

    }
}
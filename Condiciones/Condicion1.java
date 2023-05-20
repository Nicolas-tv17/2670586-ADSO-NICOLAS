import java.util.Scanner;

public class Condicion1{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Hola querido usuario...");
        System.out.print("Por favor ingresa tu edad: ");
        int edad = entrada.nextInt();

        if(edad >0 && edad <=100){
            if(edad < 18){
                System.out.print("Eres menor de edad y obtienes un auxilio de 800.000");
            }else{
                System.out.print("Eres mayor de edad y debes pagar un impuesto de 200.000 ");
            }
        }else{
            System.out.print("Ingresa una edad valida");
        }
        
    }
}
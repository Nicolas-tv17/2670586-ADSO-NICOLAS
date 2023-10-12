import java.util.Scanner;

public class Condicion9{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa tu fecha de nacimiento (DD/MM/AAAA): ");
        int numero = entrada.nextInt();

        int dia = numero/1000000;
        int mes = (numero/10000)%100;
        int año = numero%10000;
        int d1 = (numero%10000)/1000;
        int d2 = (numero%1000)/100;
        int d3 = (numero%100)/10;
        int d4 = numero%10;

        if(numero >=1 && numero <100000000 && dia >=01 && dia <=31 && mes >=01 && mes <=12 && año >=01 && año <=2023){
            if(dia >=01 && dia <=31){
               if(dia==1){
                    System.out.print("PRIMERO DE ");
                }
                if(dia==2){
                    System.out.print("DOS DE ");
                }
                if(dia==3){
                    System.out.print("TRES DE ");
                }
                if(dia==4){
                    System.out.print("CUATRO DE ");
                }
                if(dia==5){
                    System.out.print("CINCO DE ");
                }
                if(dia==6){
                    System.out.print("SEIS DE ");
                }
                if(dia==7){
                    System.out.print("SIETE DE ");
                }
                if(dia==8){
                    System.out.print("OCHO DE ");
                }
                if(dia==9){
                    System.out.print("NUEVE DE ");
                }
                if(dia==10){
                    System.out.print("DIEZ DE ");
                }
                if(dia==11){
                    System.out.print("ONCE DE ");
                }
                if(dia==12){
                    System.out.print("DOCE DE ");
                }
                if(dia==13){
                    System.out.print("TRECE DE ");
                }
                if(dia==14){
                    System.out.print("CATORCE DE ");
                }
                if(dia==15){
                    System.out.print("QUINCE DE ");
                }
                if(dia==16){
                    System.out.print("DIECISEIS DE ");
                }
                if(dia==17){
                    System.out.print("DIECISIETE DE ");
                }
                if(dia==18){
                    System.out.print("DIECIOCHO DE ");
                }
                if(dia==19){
                    System.out.print("DIECINUEVE DE ");
                }
                if(dia==20){
                    System.out.print("VEINTE DE ");
                }
                if(dia==21){
                    System.out.print("VENTIUNO DE ");
                }
                if(dia==22){
                    System.out.print("VENTIDOS DE ");
                }
                if(dia==23){
                    System.out.print("VENTITRES DE ");
                }
                if(dia==24){
                    System.out.print("VENTICUATRO DE ");
                }
                if(dia==25){
                    System.out.print("VENTICINCO DE ");
                }
                if(dia==26){
                    System.out.print("VENTISEIS DE ");
                }
                if(dia==27){
                    System.out.print("VENTISIETE DE ");
                }
                if(dia==28){
                    System.out.print("VENTIOCHO DE ");
                }
                if(dia==29){
                    System.out.print("VENTINUEVE DE ");
                }
                if(dia==30){
                    System.out.print("TREINTA DE ");
                }if(dia==31){
                    System.out.print("TREINTA Y UNO DE ");
                }

            }else{
                System.out.println("Ingresa un dia valida.");
            }
            
            if(mes >=01 && mes <=12){
                if(mes==1){
                    System.out.print("ENERO DE");
                }
                if(mes==2){
                    System.out.print("FEBRERO DE ");
                }
                if(mes==3){
                    System.out.print("MARZO DE ");
                }
                if(mes==4){
                    System.out.print("ABRIL DE ");
                }
                if(mes==5){
                    System.out.print("MAYO DE ");
                }
                if(mes==6){
                    System.out.print("JUNIO DE ");
                }
                if(mes==7){
                    System.out.print("JULIO DE ");
                }
                if(mes==8){
                    System.out.print("AGOSTO DE ");
                }
                if(mes==9){
                    System.out.print("SEPTIEMBRE DE ");
                }
                if(mes==10){
                    System.out.print("OCTUBRE DE ");
                }
                if(mes==11){
                    System.out.print("NOVIEMBRE DE ");
                }
                if(mes==12){
                    System.out.print("DICIEMBRE DE ");
                }
            }else{
                System.out.println("Ingresa un mes valido.");
            }

            if(año >=01 && año <=2023){
                if(d1==0){
                    System.out.println("  !!!ERROR, AñO INVALIDO");
                }
                if(d1==1){
                    System.out.println("MIL ");
                }
                if(d1==2){
                    System.out.println("DOS MIL ");
                }
                
                

            }else{
                System.out.println("Ingresa un año valido.");
            }
        

        }else{
            System.out.println("Ingresa un numero valido.");
        }

    }
}                       
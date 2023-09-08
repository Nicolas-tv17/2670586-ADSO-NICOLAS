import java.util.Date;

public class Cajeros{
    int capacidadTotal;
    int dineroDisponible;
    int cant_10;
    int cant_20;        
    int cant_50;
    int cant_100;
    String nombreBanco;
    String listaTransaciones [];
    String usuarioAdmin;
    String claveAdmin;
    
    public Cajeros(int capacidadTotal, int dineroDisponible, int cant_10, int cant_20, int cant_50, int cant_100, String nombreBanco, String usuarioAdmin, String claveAdmin){

        this.capacidadTotal = capacidadTotal;
        this.dineroDisponible = dineroDisponible;
        this.cant_10 = cant_10;
        this.cant_20 = cant_20;
        this.cant_50 = cant_50;
        this.cant_100 = cant_100;
        this.nombreBanco = nombreBanco;
        this.usuarioAdmin = usuarioAdmin;
        this.claveAdmin = claveAdmin;
        listaTransaciones = new String [100];

    }

    public Cajeros (int capacidadTotal, String nombreBanco, String usuarioAdmin, String claveAdmin){
        this.capacidadTotal = capacidadTotal;
        this.nombreBanco = nombreBanco;
        this.usuarioAdmin = usuarioAdmin;
        this.claveAdmin = claveAdmin;

        this.dineroDisponible = 0;
        this.cant_10 =0;
        this.cant_20 = 0;
        this.cant_50 = 0;
        this.cant_100 = 0;
        listaTransaciones = new String[100];
        
    }

    public void imprimirDetalle(){
        System.out.println("---------------------------------------");
        System.out.println("Capacidad Total: "+ capacidadTotal);
        System.out.println("Dinero Disponible: "+dineroDisponible );
        System.out.println("Cantidad de 10: "+cant_10);
        System.out.println("Cantidad de 20: " +cant_20 );
        System.out.println("Cantidad de 50: " +cant_50) ;
        System.out.println("Cantidad de 100: " +cant_100) ;
        System.out.println("Nombre de banco: " +nombreBanco);
        System.out.println("Usuario Admin: " +usuarioAdmin);
        System.out.println("Clave Admin: " +claveAdmin);
        System.out.println("Historial Transacciones: ");
        for(int i = 0; i < listaTransaciones.length; i++){
            if(listaTransaciones[i] != null){
                System.out.println("---> "+listaTransaciones[i]);
            }
        }
        System.out.println("---------------------------------------");
    }
    
    public boolean abastecerCajero(int cant_10, int cant_20, int cant_50, int cant_100){
        // calcular total ingresado
        int total = (cant_10*10000) + (cant_20*20000)+ (cant_50*50000) + (cant_100*100000);
        //validar que no exceda el limite
        if(total <= capacidadTotal){
            dineroDisponible = total;
            this.cant_10 = cant_10;
            this.cant_20 = cant_20;
            this.cant_50 = cant_50;
            this.cant_100 = cant_100;
            
            registrarTransaccion("Abastecer", "0000 0000 0000 0000", total, "OK");
            
            return true;
            
        }else{
            registrarTransaccion("Abastecer", "0000 0000 0000 0000", total, "ERROR");
            return false;
            
        }
    }

    public void registrarTransaccion(String tipo, String numeroTargeta, int monto, String estado){
        Date fecha = new Date();
        String texto = fecha.toString()+ " - "+ tipo + " - " +numeroTargeta+ " - " +monto+ " - "+estado;

        //buscar un indice donde este vacio

        int indice = -1;
        for(int i = 0; i < listaTransaciones.length; i++){
            if(listaTransaciones[i] == null){
                indice = i;
                break;
            }
        }

        if(indice != -1){
            listaTransaciones[indice] = texto;
        }else{
            for(int i = 0; i < listaTransaciones.length-1; i++){
                listaTransaciones[i] = listaTransaciones[i+1];
            }
            listaTransaciones[ listaTransaciones.length-1 ] = texto;
        }

    }
}

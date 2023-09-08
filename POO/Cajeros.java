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

    private void registrarTransaccion(String tipo, String numeroTargeta, int total, String estado) {
    }

    public void registrarTransaccion(String tipo, String numeroTargeta, String string, String estado){
        Date fecha = new Date();
        String texto = fecha.toString()+ " - "+ tipo + " - " +numeroTargeta+ " - " +string+ " - "+estado;

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

    public void verHistorialCajero(String user, String password){
        if( user.equals(usuarioAdmin) && password.equals(claveAdmin)){

            registrarTransaccion("Historial", "0000 0000 0000 0000", "0", "Ok");

            System.out.println("----------------------------------");
            System.out.println("         Historial Cajero         ");
            System.out.println("----------------------------------");
            for(int i = 0; i < listaTransaciones.length;i++){
                if(listaTransaciones[i] != null){
                    System.out.println("--> "+listaTransaciones[i]);
                }
            }
        }else{
            System.out.println("___ ACCESO DENEGADO ___");
            registrarTransaccion("Historial", "0000 0000 0000 0000", "0", "Error");
        }
    }

    public void consignarDineroTarjeta(Tarjeta01 tarjeta, String clave, int cant_10, int cant_20, int cant_50, int cant_100){
        //validar que el dinero ingresado no se supere el limite del cajero
        
        //aumentar saldo de la tarjeta
        //aumentar saldo del cajero
        //registrar la transaccion
        
        int monto = (10000*cant_10) + (20000*cant_20) + (50000*cant_50) + (100000*cant_100);
        
        if(tarjeta.validarClave(clave)){
            //validar clave
            if( tarjeta.validarEstadoActiva()){
                // el monto ingresado sea mayor a cero
                if(monto < 0){
                    // validar que el dinero ingresado no supere el limite del cajero
                    if(dineroDisponible + monto <= capacidadTotal){
                        tarjeta.aumentarSaldo(monto, clave);

                        dineroDisponible += monto;
                        this.cant_10 += cant_10;
                        this.cant_20 += cant_20;
                        this.cant_50 += cant_50;
                        this.cant_100 += cant_100;

                        System.out.println("___ REALIZADO-CONSIGNAR DINERO___");
                        registrarTransaccion("CONSIGNACION", tarjeta.getNumero(), monto, "OK");

                    }else{
                        System.out.println("___ ERROR MONTO SUPERIOR-CONSIGNAR DINERO___");
                        registrarTransaccion("Historial", tarjeta.getNumero(), monto, "Error Capacidad");
                    }
                }else{
                    System.out.println("___ ERROR MONTO INFERIOR-CONSIGNAR DINERO___");
                    registrarTransaccion("Historial", tarjeta.getNumero(), monto, "Error monto");
                }
            }else{
                System.out.println("___ ERROR ESTADO-CONSIGNAR DINERO___");
                registrarTransaccion("Historial", tarjeta.getNumero(), monto, "Error Status");
            }
        }else{
            System.out.println("___ ERROR PASSWORD-CONSIGNAR DINERO___");
            registrarTransaccion("Historial", tarjeta.getNumero(), monto, "Error password");
        }
    }

}

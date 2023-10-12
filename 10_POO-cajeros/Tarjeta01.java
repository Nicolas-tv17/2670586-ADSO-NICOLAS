import java.util.Date;

public class Tarjeta01 {
    
    private String nombrePropietario;
    private String numeroTargeta;
    private String nombreBanco;
    private int dineroTargeta;
    private int dineroPermitidoRetirar;
    private String ultimasTransacciones [];
    private String clave;
    private String estado;

    public Tarjeta01(String nombrePropietario, String numeroTargeta, String nombreBanco, int dineroTargeta, int dineroPermitidoRetirar, String clave){
        this.nombrePropietario = nombrePropietario;
        this.numeroTargeta = numeroTargeta;
        this.nombreBanco = nombreBanco;
        this.dineroTargeta = dineroTargeta;
        this.dineroPermitidoRetirar = dineroPermitidoRetirar;
        this.clave = clave;
        this.estado = "ACTIVO";
        this.ultimasTransacciones = new String[5];
    }

    public void registrarTransaccion(String tipo, int monto, String estado){
        Date fecha = new Date();
        String texto = fecha.toString()+ " - "+ tipo + " - " +numeroTargeta+ " - " +monto+ " - "+estado;

        //buscar un indice donde este vacio

        int indice = -1;
        for(int i = 0; i < ultimasTransacciones.length; i++){
            if(ultimasTransacciones[i] == null){
                indice = i;
                break;
            }
        }

        if(indice != -1){
            ultimasTransacciones[indice] = texto;
        }else{
            for(int i = 0; i < ultimasTransacciones.length-1; i++){
                ultimasTransacciones[i] = ultimasTransacciones[i+1];
            }
            ultimasTransacciones[ ultimasTransacciones.length-1 ] = texto;
        }

    }
    
    public void verHistorial(String pass){
        if( pass.equals(clave) ){
            registrarTransaccion("Historial", 0, "Ok");
            for(int i = 0; i < ultimasTransacciones.length; i++){
                if(ultimasTransacciones[i] != null){
                    System.out.println("---> "+ ultimasTransacciones[i]);
                }
            }
        }else{
            System.out.println("Acceso denegado desde la targeta");
            registrarTransaccion("Historial", 0, "ERROR");
        }
    }

    public boolean aumentarSaldo(int monto, String pass){
        if( pass.equals(clave) ){
            if ( monto > 0 ){
                dineroTargeta += monto;
                System.out.println("---> TRANSACCION EXITOSA EN TARJETA");
                registrarTransaccion("Aumentosaldo", monto, "OK");
                return true;
            }else{
                System.out.println("--->  ERROR EN MONTO INGRESADO");
                registrarTransaccion("Aumentosaldo", monto, "Error");
                return false;
            }
        }else{
            System.out.println("--->  ERROR EN AUMENTO DE SALDO");
            registrarTransaccion("Aumentosaldo", monto, "Error");
            return false;
        }
    }

    public boolean disminuirSaldo(int monto, String pass){
        if( pass.equals(clave) ){
            if ( monto > 0 && monto <= dineroPermitidoRetirar ){
                if(monto <= dineroTargeta){
                    dineroTargeta -= monto;
                    System.out.println("---> TRANSACCION EXITOSA EN TARJETA");
                    registrarTransaccion("disminucionSaldo", monto, "OK");
                    return true;
                }else{
                    System.out.println("--->  ERROR EN MONTO INGRESADO SUPERA DINERO PERMITIDO");
                    registrarTransaccion("disminucionSaldo", monto, "Error");
                    return false;
                }
            }else{
                System.out.println("--->  ERROR EN MONTO INGRESADO - FUERA DE RANGO");
                registrarTransaccion("disminucionSaldo", monto, "Error");
                return false;
            }
        }else{
            System.out.println("--->  ERROR EN DISMINUCION DE SALDO");
            registrarTransaccion("disminucionSaldo", monto, "Error");
            return false;
        }
    }

    public int getsaldo(String pass){
    if(pass.equals(clave)){
        registrarTransaccion("Consultasaldo", 0, "OK");
        return dineroTargeta;
    }else{
        registrarTransaccion("Consultasaldo", 0, "ERROR");
        return -1;
    }
}

    public boolean validarClave(String pass){
        if(pass.equals( clave )){
            registrarTransaccion("Validarclaveinterna", 0, "OK");
            return true;
        }else{
            registrarTransaccion("Validarclaveinterna", 0, "ERROR");
            return false;
        }
    }

    public String getNumero(){
        return numeroTargeta;
    }

    public boolean validarEstadoActiva(String pass){
        if(estado.equals( "ACTIVO" )){
            return true;
        }else{
            return false;
        }
    }

    public boolean validarEstadoActiva() {
        return false;
    }


}

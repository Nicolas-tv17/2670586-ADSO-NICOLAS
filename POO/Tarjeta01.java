public class Tarjeta01 {
    
    String nombrePropietario;
    int numeroTargeta;
    String nombreBanco;
    int dineroTargeta;
    int dineroPermitidoRetirar;
    String ultimasTransacciones [];
    String clave;
    String estado;

    public Tarjeta01(String nombrePropietario, int numeroTargeta, String nombreBanco, int dineroTargeta, int dineroPermitidoRetirar, String clave, String estado){
        this.nombrePropietario = nombrePropietario;
        this.numeroTargeta = numeroTargeta;
        this.nombreBanco = nombreBanco;
        this.dineroTargeta = dineroTargeta;
        this.dineroPermitidoRetirar = dineroPermitidoRetirar;
        this.clave = clave;
        this.estado = estado;
        ultimasTransacciones = new String[100];
    }

    public void imprimir(){
        
        System.out.println("|---------------------------------------|");
        System.out.println("| Nombre del propietario: " +nombrePropietario);
        System.out.println("| Numero de la tarjeta: "+numeroTargeta);
        System.out.println("| Nombre del banco: "+nombreBanco);
        System.out.println("| Permitido retirar: " +dineroPermitidoRetirar);
        System.out.println("| Dinero disponible: "+dineroTargeta);
        System.out.println("|_______________________________________|");
        
    }

}

public class Equipos {
    
    private String nombre;
    private int año_fundación;
    private int partidos_ganados;
    private int partidos_empatados;
    private int partidos_perdidos;
    private Jugador[] lista_jugadores;
    private int numJugadores;

    //Constructor
    public Equipos(String nombre, int año_fundación, int partidos_ganados, int partidos_empatados, int partidos_perdidos){
        this.nombre = nombre;
        this.año_fundación = año_fundación;
        this.partidos_ganados = partidos_ganados;
        this.partidos_empatados = partidos_empatados;
        this.partidos_perdidos = partidos_perdidos;
        lista_jugadores = new Jugador[16];
        this.numJugadores = 0;

    }

    //Getter
    public String getNombre(){
        return nombre;
    }

    public int getAñoFundacion(){
        return año_fundación;
    }

    public int getPartidosGanados(){
        return partidos_ganados;
    }

    public int getPartidosEmpatados(){
        return partidos_empatados;
    }

    public int getPartidosPerdidos(){
        return partidos_perdidos;
    }

    //Setters
    public void SetNombre(String nombre){
        this.nombre = nombre;
    }

    public void setAñoFundacion(int año_fundación){
        this.año_fundación = año_fundación;
    }

    public void setPartidosGanados(int partidos_ganados){
        this.partidos_ganados = partidos_ganados;
    }

    public void setPartidosEmpatados(int partidos_empatados){
        this.partidos_empatados = partidos_empatados;
    }

    //Agregar jugadores al equipo
    public void agregarJugador(Jugador jugador){

        if (numJugadores < lista_jugadores.length) {
            lista_jugadores[numJugadores] = jugador;
            numJugadores++;
        }else {
            System.out.println("El equipo está completo, no se pueden agregar más jugadores.");
        }

    }

    //Eliminar jugadores
    public void eliminarJugadores(Jugador jugador){
        for(int i = 0; i < lista_jugadores.length;i++){
            if(lista_jugadores[i] == jugador){
                lista_jugadores[i]=null;
                break;
            }
        }
    }

    //Listar los jugadores
    public void listarNombreJugadore(){
        System.out.println("");
        System.out.println("|------------------------------------|");
        System.out.println("|          LISTA DE JUGADORES        |");
        System.out.println("|------------------------------------|");
        for(int i=0; i<lista_jugadores.length;i++){
            if(lista_jugadores[i]!= null){
                System.out.println("| •  "+lista_jugadores[i].getNombre());
            }else{
                System.out.println("| •  No hay Jugadores");
            }
        }
        System.out.println("|______________________________________");
        System.out.println("");
    }
    
    //Listar jugadores con imformacion
    public void listarJugadoresInformacionDetallada(){
        for(int i = 0; i < lista_jugadores.length; i++){
            if(lista_jugadores != null){
                System.out.println("______________________________________");
                System.out.println();
                System.out.println(" • Nombre: "+lista_jugadores[i].getNombre());
                System.out.println(" • Cedula: "+lista_jugadores[i].getCedula());
                System.out.println(" • Edad: "+lista_jugadores[i].getEdad());
                System.out.println(" • Posiscion: "+lista_jugadores[i].getPosicion());
            }else{
                System.out.println("No hay jugadores en el equipo");
            }
        }
    }
}

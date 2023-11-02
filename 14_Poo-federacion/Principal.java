import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Jugador jugador01 = new Jugador(1060587950, "Messi", 35, "Delantero");
        Jugador jugador02 = new Jugador(1127720044, "Ronaldo", 36, "Delantero");
        Jugador jugador03 = new Jugador(144224767, "Mbappe", 31, "Delantero");
        Jugador jugador04 = new Jugador(23434423, "Levandoski", 34, "Centrocampista");
        Jugador jugador05 = new Jugador(267564343, "James", 36, "Centrocampista");
        Jugador jugador06 = new Jugador(23425666, "Frederik", 39, "Portero");
        Jugador jugador07 = new Jugador(898888923, "Ospina", 38, "Portero");
        Jugador jugador08 = new Jugador(35544555, "Cuadrado", 34, "Centrocampista");
        Jugador jugador09 = new Jugador(433657642, "Halan", 29, "Delantero");
        Jugador jugador10 = new Jugador(642233425, "Benzema", 36, "Defensa");
        Jugador jugador11 = new Jugador(134432219, "Ronaldiño", 39, "Delantero");

        Equipos equipo01 = new Equipos("PSG", 1988, 10, 2, 0);
        Equipos equipo02 = new Equipos("Barça", 1984, 5, 5, 2);

        equipo01.agregarJugador(jugador03);
        equipo01.agregarJugador(jugador01);
        equipo01.agregarJugador(jugador02);
        equipo01.agregarJugador(jugador06);
        equipo01.agregarJugador(jugador09);
        equipo01.agregarJugador(jugador10);

        equipo02.agregarJugador(jugador04);
        equipo02.agregarJugador(jugador05);
        equipo02.agregarJugador(jugador07);
        equipo02.agregarJugador(jugador08);
        equipo02.agregarJugador(jugador11);

        // equipo01.listarNombreJugadore();
        // equipo02.listarNombreJugadore();

        // equipo02.listarJugadoresInformacionDetallada();
        // equipo01.listarJugadoresInformacionDetallada();

    }
}
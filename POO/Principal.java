public class Principal{
    public static void main(String[] args) {

        Cajeros cajero01 = new Cajeros(1000000, 2000000, 50, 50, 50, 50, "Jose", "Felipe", "nosejsjs");
        cajero01.imprimirDetalle();

        Cajeros cajero02 = new Cajeros(2000000000, "Nequi", "Nico", "12345");
        // cajero02.imprimirDetalle();

        Tarjeta01 targetaUno = new Tarjeta01("Nicolas", 1000443311, "Bancolombia", 1253500000, 10000000, "12345", "ACTIVO");
        targetaUno.imprimir();

        cajero02.abastecerCajero(1000, 1000, 1000, 1000);
        cajero02.abastecerCajero(50000, 50000, 10000, 10000);
        // // cajero02.imprimirDetalle();

    }
}
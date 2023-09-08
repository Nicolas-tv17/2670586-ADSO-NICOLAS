public class Principal{
    public static void main(String[] args) {

        Cajeros cajero02 = new Cajeros(2000000000, "Nequi", "Nico", "12345");
        // cajero02.imprimirDetalle();
        
        cajero02.abastecerCajero(1000, 1000, 1000, 1000);
        cajero02.abastecerCajero(50000, 50000, 10000, 10000);
        cajero02.imprimirDetalle();

        Tarjeta01 tarjeta = new Tarjeta01("Nicolas", "0001 0001 0001 0001", "Nequiii", 444343432, 10000, "12345");
        
        cajero02.consignarDineroTarjeta(tarjeta, "12345", 0, 0, 0, 10);
        cajero02.imprimirDetalle();

        //Tarjeta01 targetaUno = new Tarjeta01("Nicolas", "1000443311", "Bancolombia", 1253500000, 10000000, "12345");
        // targetaUno.imprimir();
    }
}
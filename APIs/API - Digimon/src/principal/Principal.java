package principal;

import utils.ConsumoAPI;

public class Principal {

    public static void main(String[] args) {
        ConsumoAPI consumo = new ConsumoAPI();
        String respuesta = consumo.consumoGET("https://digi-api.com/api/v1/digimon");
        Menu ventana = new Menu(respuesta);
    }
    
}

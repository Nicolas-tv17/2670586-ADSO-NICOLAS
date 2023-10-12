public class Principal{

    public static void main(String[] args) {


        Perros perro_1 = new Perros("Paco", "Jose", 9, "Boxer", 29.5, 40);
        //Perros perro_2 = new Perros("Roqui", "Alejo", 7, "Lobo Siberiano", 30.5, 50);
        
        perro_1.imprimirDetalle();

        //perro_1.comer(800);
        //perro_1.dormir(5);
        perro_1.jugar(10);


        perro_1.imprimirDetalle();

    }

}
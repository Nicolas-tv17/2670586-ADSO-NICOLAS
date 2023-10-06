public class Principal{

    public static void main(String[] args) {


        Perros perro_1 = new Perros("Paco", "Jose", 9, "Boxer", 29.5, 40);
        Perros perro_2 = new Perros("Roqui", "Alejo", 7, "Lobo Siberiano", 30.5, 50);
        
        perro_1.setNombre("Chocolate");
        perro_1.setPropietario("Nicolas");

        perro_1.comer(800);

        perro_2.setPropietario("Nicolas");

        perro_1.imprimirDetalle();
        // perro_2.imprimirDetalle();
        /* 
            Clases: Son archivos que definen nuevos tipos de datos.
                    Una clase es una plantilla que se usara para crear objetos/variables
        */
        
        /* 
            Atributos: Datos propios de la clase definida.
                       Caracteristicas de la clase
                       Los atributos son variables globales
        */
        
        /* 
            Metodos: Acciones que puede realizar
            un objeto perteneciente a esa clase

            Se representan como funciones
         */
    }

}
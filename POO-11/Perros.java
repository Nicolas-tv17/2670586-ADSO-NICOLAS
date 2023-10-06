public class Perros {
    
    //  Atributos.
    private String nombre;
    private String propietario;
    private int edad;
    private String raza;
    private double peso;
    private int energia;

    //  Metodos:
    //      Constructor: es usado para crear objetos de esa clase (instanciacion).
    //      La funcion constructor es dar valor inicial a los atributos
    public Perros(String dato1, String dato2, int dato3, String dato4, double dato5, int dato6){
        
        nombre = dato1;
        propietario = dato2 ;
        edad = dato3;
        raza = dato4;
        peso = dato5;
        energia = dato6;

    }

    public void imprimirDetalle(){

        System.out.println("+--------------------------------------+");
        System.out.println("|  Nombre del perro : " +nombre);
        System.out.println("|  Propietario del perro : " +propietario );
        System.out.println("|  Edad del perro : "+edad+" años");
        System.out.println("|  Raza del perro : "+raza);
        System.out.println("|  Peso del perro : " +peso +" Kg.");
        System.out.println("|  Energía del perro : " +energia+ "%" );
        System.out.println("+--------------------------------------+");

    }
       
    // Getter: extraer el valor del atributo

    public String getNombre(){
        return nombre;
    }
    public String getPropietario(){
        return propietario;
    }
    public int getEdad(){
        return edad;
    }
    public String getRaza(){
        return raza;
    }
    public double getPeso(){
        return peso;
    }
    public int getEnergia(){
        return energia;
    }

    // Setter: asignar un nuevo valor al atributo
    public void setNombre(String newName){
        nombre = newName;
    }
    public void setPropietario(String newPropietario){
        propietario = newPropietario;
    }
    public void setEdad(int newEdad){
        edad = newEdad;
    }
    public void setRaza(String newRaza){
        raza = newRaza;
    }
    public void setPeso(double newPeso){
        peso = newPeso;
    }
    public void setEnergia(int newEnergia){
        energia = newEnergia;
    }

    public void comer(int gramos){

        // Peso
        peso = peso + ((double) gramos/1000);

        //Energia
        energia = energia + (gramos/100);

    }

}

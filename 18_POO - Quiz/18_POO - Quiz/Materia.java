public class Materia {

    String nombre;
    double creditos;
    double nota;

    public Materia(String nombre,double creditos, double nota){
        this.nombre=nombre;
        this.creditos=creditos;
        this.nota=nota;
    }
    //Metodos Getters y Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCreditos(double creditos) {
        this.creditos = creditos;
    }

    public double getCreditos() {
        return creditos;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public double getNota(){
        return nota;
    }

    public String imprimir() {
        return nombre + " -> Créditos: " + creditos + " -> Notas: " + nota;
    }

    //Promedio Ponderado = n1*c1+ n2*c2 + n3*c3 / c1+c2+c3;

    
}

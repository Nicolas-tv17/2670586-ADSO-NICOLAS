public class Curso {

    public int codigo;
    public String nombre;
    public String areaDeConocimiento;
    public int duracionEnHoras;
    public String[] temas = new String[15];
    public int numeroTemas;

    //Constructor
    public Curso(int codigo, String nombre, String areaDeConocimiento, int duracionEnHoras) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.areaDeConocimiento = areaDeConocimiento;
        this.duracionEnHoras = duracionEnHoras;
    }

    //Getters
    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAreaDeConocimiento() {
        return areaDeConocimiento;
    }

    public int getDuracionEnHoras() {
        return duracionEnHoras;
    }

    public String[] getTemas() {
        return temas;
    }

    public int getNumeroTemas(){
        return numeroTemas;
    }

    //Setters
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void setAreaDeConocimiento(String areaDeConocimiento) {
        this.areaDeConocimiento = areaDeConocimiento;
    }


    public void setDuracionEnHoras(int duracionEnHoras) {
        this.duracionEnHoras = duracionEnHoras;
    }


    public void setTemas(String[] temas) {
        this.temas = temas;
    }

    public void setNumeroTemas(int numeroTemas){
        this.numeroTemas = numeroTemas;
    }

    //agregar tema
    public void agregarTema(String tema) {
        
        if (numeroTemas < temas.length) {
            temas[numeroTemas] = tema;
            numeroTemas++;
        }else {
            System.out.println("No se pueden agregar mas temas");
        }
    }

    //Inprimir detaller curso
    public void imprimirDetalleCurso() {
        System.out.println("<--------------------------->");
        System.out.println("| Código: " + codigo);
        System.out.println("| Nombre: " + nombre);
        System.out.println("| Área de conocimiento: " + areaDeConocimiento);
        System.out.println("| Duración: " + duracionEnHoras+" horas");
        System.out.println("| Temas:");
        for (int i = 0; i < numeroTemas; i++) {
            System.out.println("|       " + temas[i]);
        }
        System.out.println("<--------------------------->");
    }

    //editar informacion
    public void editarInformacionCurso(String nombre, String area, int duracion) {

        if (!nombre.equalsIgnoreCase("")) {
            this.setNombre(nombre);
        } else {
            System.out.println("No se ha editado el nombre del curso.");
        }
        
        if (!area.equalsIgnoreCase("")) {
            this.setAreaDeConocimiento(area);
        } else {
            System.out.println("No se ha editado el area del curso.");
        }

        if (duracion != 0) {
            this.setDuracionEnHoras(duracion);
        } else {
            System.out.println("La duración no puede ser cero o negativa.");
        }

    }

}    
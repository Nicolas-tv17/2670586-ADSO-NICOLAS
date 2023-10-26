import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int tamaño = 100;
        Curso arregloCurso [] = new Curso[tamaño];
        int cursosCreados = 0;
        
        
        while (true) {
            
            System.out.println(" +------------------------------------------------------+");
            System.out.println(" |                      MENU DE CURSOS                  |");
            System.out.println(" +------------------------------------------------------+");
            System.out.println(" |                                       Memoria: "+(tamaño-cursosCreados));
            System.out.println(" | 1. Crear curso.                                      |");
            System.out.println(" | 2. Listar todos los cursos.                          |");
            System.out.println(" | 3. Ver detalle de curso.                             |");
            System.out.println(" | 4. Editar informacion de un curso.                   |");
            System.out.println(" | 5. Agregar tema a curso.                             |");
            System.out.println(" | 6. Eliminar curso.                                   |");
            System.out.println(" | 7. Salir.                                            |");
            System.out.println(" |                                                      |");
            System.out.println(" +------------------------------------------------------+");

            System.out.print("Ingrese una opcion del menu: ");
            int opcion = entrada.nextInt();

            switch(opcion) {
                case 1: //Crear Curso

                    if(cursosCreados >= tamaño){
                        System.out.println("No hay mas memoria para crear mas cursos.");
                        break;
                    }

                    System.out.print("Ingresa el codigo del grupo: ");
                    int codigoCurso = entrada.nextInt();
                    entrada.nextLine();

                    boolean codigoExistente = false;
                    for(int i = 0; i < cursosCreados; i++) {
                        if (arregloCurso[i] != null && arregloCurso[i].getCodigo() == codigoCurso) {
                            codigoExistente = true;
                            break;
                        }
                    }

                    if(codigoExistente == true) {
                        System.out.println("ERROR. El codigo ya exixte.");
                    } else {
                        
                        System.out.print("Ingresa el Nombre del grupo: ");
                        String nombreCurso = entrada.nextLine();

                        System.out.print("Ingresa el area de conocimiento del grupo: ");
                        String areaCurso = entrada.nextLine();

                        System.out.print("Ingresa la duracion en horas del grupo: ");
                        int duracionCurso = entrada.nextInt();
                        entrada.nextLine();

                        Curso nuevocurso = new Curso(codigoCurso, nombreCurso, areaCurso, duracionCurso);
                        arregloCurso[cursosCreados] = nuevocurso;
                        cursosCreados++;

                    }
                    break;

                case 2: //Listar Todos Los Cursos

                    if(cursosCreados == 0) {
                        System.out.println("No hay cursos registrados.");
                    } else {
                        System.out.println("CODIGO - NOMBRE - DURACION   ");
                        for(int i = 0; i < cursosCreados; i++) {
                            Curso curso = arregloCurso[i];
                            System.out.println(curso.getCodigo() + " - " + curso.getNombre() + " - " + curso.getDuracionEnHoras() + " hrs");
                        }
                    }
                    break;

                case 3: //Ver Detalle De Un Curso

                    System.out.print("Ingresa el codigo del grupo a ver detalles: ");
                    int codigoDetalle = entrada.nextInt();

                    boolean detalleCurso = false;
                    for(int i = 0; i < arregloCurso.length; i++) {
                        if(arregloCurso[i]!=null && arregloCurso[i].getCodigo() == codigoDetalle) {
                            arregloCurso[i].imprimirDetalleCurso();
                            detalleCurso = true;
                            break;
                        }
                    }

                    if(detalleCurso != true) {
                        System.out.println("El codigo no existe.");
                    }
                    break;

                case 4: //Editar Informacion Del Curso
                    
                    System.out.print("Ingresa el codigo del grupo que desea cambiar informacion: ");
                    int codigo_deta = entrada.nextInt();
                    entrada.nextLine();
                    

                    boolean cursobuscar = false;
                    for(int i = 0; i < arregloCurso.length; i++) {
                        if (arregloCurso[i]!= null && arregloCurso[i].getCodigo() == codigo_deta) {

                            System.out.print("Ingrese el nuevo nombre: ");
                            String nombreActualizado = entrada.nextLine();

                            System.out.print("Ingrese la nueva area de conocimiento: ");
                            String areaActualizada = entrada.nextLine();

                            System.out.print("Ingrese la nueva duracion: ");
                            int duracionActualizada = entrada.nextInt();

                            arregloCurso[i].editarInformacionCurso(nombreActualizado,areaActualizada , duracionActualizada);
                            cursobuscar = true;
                            break;
                        }
                    }

                    if(cursobuscar != true) {
                        System.out.println("El codigo no existe.");
                    }
                    break;

                case 5: //Agregar Tema A Curso
                    
                    System.out.print("Ingresa el codigo del curso al que deseas agregar un tema: ");
                    int codigo_agregar = entrada.nextInt();
                    entrada.nextLine();

                    boolean temaAgregado = false;
                    for (int i = 0; i < cursosCreados; i++) {
                        if (arregloCurso[i] != null && arregloCurso[i].getCodigo() == codigo_agregar) {
                            System.out.print("Ingrese el nombre del tema a agregar: ");
                            String nombreNuevoTema = entrada.nextLine();
                            arregloCurso[i].agregarTema(nombreNuevoTema);
                            temaAgregado = true;
                            break;
                        }
                    }

                    if (temaAgregado != true) {
                        System.out.println("No se encontro un curso con el codigo");
                    }
                    break;
                    
                case 6: //Eliminar Curso

                    System.out.print("Ingresa el codigo del curso que deseas eliminar: ");
                    int eliminar_curso = entrada.nextInt();
                    entrada.nextLine();

                    boolean cursoEliminado = false;
                    for (int i = 0; i < cursosCreados; i++) {
                        if (arregloCurso[i] != null && arregloCurso[i].getCodigo() == eliminar_curso) {
                            arregloCurso[i] = null; 
                            cursoEliminado = true;
                            break;
                        }
                    }

                    if (cursoEliminado == true) {
                        cursosCreados--;
                    } else {
                        System.out.println("No se encontro un curso con el codigo.");
                    }
                    break;

                case 7: //Salir

                    System.out.println("Saliendo...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }
        }
    } 
}
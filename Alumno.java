public class Alumno {
    
    // el nombre completo del alumno
    private String nombre;
    // el numero de matricula
    private String numeroMatricula;
    // la edad del alumno
    private int edad;

    /**
     * Crea un alumno nuevo
     */
    public Alumno(String nombreCompleto, String numeroMatriculaAlumno, int edadAlumno) {
        nombre = nombreCompleto;
        numeroMatricula = numeroMatriculaAlumno;
        edad = edadAlumno;
        if (nombre.length() < 3){
            System.out.println("La longitud del nombre no es correcta");
        }
        if (numeroMatricula.length() < 4){
            System.out.println("La longitud del numero de matricula no es correcta");
        }
    }

    /**
     * Devuelve el nombre completo del alumno
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Devuelve el numero de la matricula
     */
    public String getNumeroMatricula() {
        return numeroMatricula;
    }
    
    /**
     * Devuelve la edad
     */
    public int getEdadAlumno() {
        return edad;
    }
    
    /**
     * Cambia el nombre del alumno
     */
    public void cambiarnombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }
    
    /**
     * Imprime por pantalla los detalles del alumno
     */
    public void imprimeDetalles() {
        System.out.println(nombre + " (" + numeroMatricula + ") - " + edad + " años");
    }
    
    /**
     * Devuelve el nombre de usuario que el alumno debe configurar
     * en su cuenta de Github en formato de 7 caracateres
     */
    public String getNombreUsuarioGithub() {
        String nombreUsuario;
        String numeroMatriculaUsuario;
        if (nombre.length() < 3 && numeroMatricula.length() < 4) {
            nombreUsuario = nombre;
            numeroMatriculaUsuario = numeroMatricula;
        }
        else {
            if (nombre.length() > 3 && numeroMatricula.length() < 4) {
                nombreUsuario = nombre.substring(0, 3);
                numeroMatriculaUsuario = numeroMatricula;
            } 
            else {
                if (nombre.length() < 3 && numeroMatricula.length() > 4) {
                    nombreUsuario = nombre;
                    numeroMatriculaUsuario = numeroMatricula.substring(0, 4);
                }
                else{
                    nombreUsuario = nombre.substring(0, 3);
                    numeroMatriculaUsuario = numeroMatricula.substring(0, 4); 
                }
            }
        }  
        return nombreUsuario + numeroMatriculaUsuario;
    }
}

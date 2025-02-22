public class Profesor {
    String profesion;
    String nacionalidad;
    private double sueldo;
    Facultad facultad;
    private List<Curso> cursos;

    public Profesor(String cedula, String nombre, Date fechaNacimiento, String ciudadNacimiento, String departamentoNacimiento, String paisNacimiento, String profesion, String nacionalidad, double sueldo, Facultad facultad) {
        super(cedula, nombre, fechaNacimiento, ciudadNacimiento, departamentoNacimiento, paisNacimiento);
        this.profesion = profesion;
        this.nacionalidad = nacionalidad;
        this.sueldo = sueldo;
        this.facultad = facultad;
        this.cursos = new ArrayList<>();
    }
    
    public void asignarCurso(Curso curso) {
        cursos.add(curso);
    }
}

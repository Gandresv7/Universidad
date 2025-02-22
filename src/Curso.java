public class Curso {
    private int codigo;
    private String nombre;
    private int creditos;
    private String salon;
    private String edificio;
    private Carrera carrera;
    private List<Profesor> profesores;
    private List<Estudiante> estudiantes;

    public Curso(int codigo, String nombre, int creditos, String salon, String edificio, Carrera carrera) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
        this.salon = salon;
        this.edificio = edificio;
        this.carrera = carrera;
        this.profesores = new ArrayList<>();
        this.estudiantes = new ArrayList<>();
    }
    
    public void asignarProfesor(Profesor profesor) {
        profesores.add(profesor);
    }
    
    public void inscribirEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }
}

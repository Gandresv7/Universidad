public class Facultad {
    private String nombre;
    private int codigo;
    private List<Profesor> profesores;
    private List<Carrera> carreras;

    public Facultad(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.profesores = new ArrayList<>();
        this.carreras = new ArrayList<>();
    }
    
    public void agregarProfesor(Profesor profesor) {
        profesores.add(profesor);
    }
    
    public void agregarCarrera(Carrera carrera) {
        carreras.add(carrera);
    }
}

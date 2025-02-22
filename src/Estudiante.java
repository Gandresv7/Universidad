class Estudiante extends Persona {
    private String colegioGraduacion;
    private Date fechaIngreso;
    private List<Carrera> carreras;
    private List<Curso> cursosInscritos;

    public Estudiante(String cedula, String nombre, Date fechaNacimiento, String ciudadNacimiento, String departamentoNacimiento, String paisNacimiento, String colegioGraduacion, Date fechaIngreso) {
        super(cedula, nombre, fechaNacimiento, ciudadNacimiento, departamentoNacimiento, paisNacimiento);
        this.colegioGraduacion = colegioGraduacion;
        this.fechaIngreso = fechaIngreso;
        this.carreras = new ArrayList<>();
        this.cursosInscritos = new ArrayList<>();
    }
    
    public void inscribirCarrera(Carrera carrera) {
        carreras.add(carrera);
    }
    
    public void inscribirCurso(Curso curso) {
        cursosInscritos.add(curso);
    }
}


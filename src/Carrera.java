public class Carrera {
     String nombre;
     int creditosTotales;
     int semestres;
     NivelCarrera nivel;
     Facultad facultad;
     List<Curso> cursos;
     List<Estudiante> estudiantes;

    public Carrera(String nombre, int creditosTotales, int semestres, NivelCarrera nivel, Facultad facultad) {
        this.nombre = nombre;
        this.creditosTotales = creditosTotales;
        this.semestres = semestres;
        this.nivel = nivel;
        this.facultad = facultad;
        this.cursos = new ArrayList<>();
        this.estudiantes = new ArrayList<>();
    }
    
    public void agregarCurso(Curso curso) {
        cursos.add(curso);
    }
    
    public void inscribirEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }
}

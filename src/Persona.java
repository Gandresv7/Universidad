public class Persona {
    
    String cedula;
    String nombre;
    Date fechaNacimiento;
    String ciudadNacimiento;
    String departamentoNacimiento;
    String paisNacimiento;

    public Persona(String cedula, String nombre, Date fechaNacimiento, String ciudadNacimiento, String departamentoNacimiento, String paisNacimiento) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.ciudadNacimiento = ciudadNacimiento;
        this.departamentoNacimiento = departamentoNacimiento;
        this.paisNacimiento = paisNacimiento;
}

public class Universidad {
    private String nombre;
    private String rector;
    private String ciudad;
    private List<Facultad> facultades;

    public Universidad(String nombre, String rector, String ciudad) {
        this.nombre = nombre;
        this.rector = rector;
        this.ciudad = ciudad;
        this.facultades = new ArrayList<>();
    }
    
    public void agregarFacultad(Facultad facultad) {
        facultades.add(facultad);
    }
}

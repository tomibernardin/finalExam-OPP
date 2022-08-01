public abstract class Servicio {

    private String nombre;
    private String descripcion;

    public Servicio(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    public abstract Double calcularPrecio();

    public String getNombre() {
        return nombre;
    }
    @Override
    public String toString() {
        return "Detalle: " + descripcion + " precio: " + calcularPrecio();
    }
}

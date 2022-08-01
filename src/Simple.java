public class Simple extends Servicio{
    private Double precio;

    public Simple(String nombre, String descripcion, Double precio) {
        super(nombre, descripcion);
        this.precio = precio;
    }

    @Override
    public Double calcularPrecio() {
        if (this.getNombre().toUpperCase().equals("COLOCACION")){
            return precio * 1.1;
        }
        return precio;
    }
}

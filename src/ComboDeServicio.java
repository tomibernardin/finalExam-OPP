import java.util.ArrayList;
import java.util.List;

public class ComboDeServicio extends Servicio{
    private Double descuento;
    private List<Servicio> servicioList;

    public ComboDeServicio(String nombre, String descripcion, Double descuento) {
        super(nombre, descripcion);
        this.descuento = descuento;
        servicioList = new ArrayList<>();
    }
    public void agregarOfertaServicio(Servicio ofertaServicio){servicioList.add(ofertaServicio);}

    @Override
    public Double calcularPrecio() {
        Double precioTotal = 0.0;
        for (Servicio ofertaServicio: servicioList) {
            precioTotal += ofertaServicio.calcularPrecio();
        }
        return precioTotal - (precioTotal * descuento);
    }
}

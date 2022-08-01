public class ServicioFactory {
    public static final String CODIGO_VENTA = "VENTA";
    public static final String CODIGO_COLOCACION = "COLOCACION";
    public static final String CODIGO_COMBO = "COMBO";

    public static ServicioFactory instance;
    private ServicioFactory() {

    }
    public static ServicioFactory getInstance(){
        if(instance == null){
            instance = new ServicioFactory();
        }
        return instance;
    }
    public Servicio crearServicio(String codigo){
        switch (codigo){
            case CODIGO_VENTA:
                return new Simple("Venta", "Venta de aire acondicionado", 65000.0);
            case CODIGO_COLOCACION:
                return new Simple("Colocacion", "Servicio de colocacion", 10000.0);
            case CODIGO_COMBO:
                ComboDeServicio comboDeServicio = new ComboDeServicio("Venta y Colocacion", "Servicio integral", 0.1);
                comboDeServicio.agregarOfertaServicio(crearServicio(CODIGO_VENTA));
                comboDeServicio.agregarOfertaServicio(crearServicio(CODIGO_COLOCACION));
                return comboDeServicio;
        }
        return null;
    }
}

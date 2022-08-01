public class Main {
    public static void main(String[] args) {
        ServicioFactory factory = ServicioFactory.getInstance();
        Empresa empresa = new Empresa();

        empresa.agregarServicio(factory.crearServicio(ServicioFactory.CODIGO_VENTA));
        empresa.agregarServicio(factory.crearServicio(ServicioFactory.CODIGO_COLOCACION));
        empresa.agregarServicio(factory.crearServicio(ServicioFactory.CODIGO_COMBO));

        empresa.cotizar();
    }
}

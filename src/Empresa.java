import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Servicio> servicioList;
    public Empresa(){servicioList = new ArrayList<>();}
    public void agregarServicio(Servicio servicio){servicioList.add(servicio);}
    public void cotizar(){
        for (Servicio servicio : servicioList) {
            System.out.println(servicio);
        }
    }
}

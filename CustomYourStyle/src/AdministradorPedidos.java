import java.util.ArrayList;
import java.util.List;

public class AdministradorPedidos {
    private static AdministradorPedidos instancia;
    private List<Pedido> pedidos;

    private AdministradorPedidos() {
        pedidos = new ArrayList<>();
    }

    public static AdministradorPedidos getInstance() {
        if (instancia == null) {
            instancia = new AdministradorPedidos();
        }
        return instancia;
    }

    public void agregarPedido(Pedido pedido) {
        pedidos.add(pedido);
        System.out.println("Pedido agregado: " + pedido.getId());
    }
}

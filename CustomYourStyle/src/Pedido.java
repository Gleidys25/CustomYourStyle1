import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int id;
    private List<Producto> productos;
    private String estado;

    public Pedido(int id) {
        this.id = id;
        this.productos = new ArrayList<>();
        this.estado = "En proceso"; // Estado inicial por defecto
    }

    public int getId() {
        return id;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public String getEstado() {
        return estado;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
        System.out.println("Producto agregado al pedido: " + producto.getNombre());
    }

    public void actualizarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        System.out.println("Estado del pedido actualizado a: " + nuevoEstado);
    }

    public void mostrarDetalles() {
        System.out.println("Pedido ID: " + id);
        System.out.println("Estado: " + estado);
        System.out.println("Productos en el pedido:");
        for (Producto producto : productos) {
            producto.mostrarDetalles();
        }
    }
}

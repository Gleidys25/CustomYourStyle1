public class ProductoBuilder {
    private Producto producto;

    public ProductoBuilder(Producto producto) {
        this.producto = producto;
    }

    public ProductoBuilder personalizarColor(String color) {
        if (producto instanceof Ropa) ((Ropa) producto).setColor(color);
        return this;
    }

    public Producto obtenerResultado() {
        return producto;
    }
}

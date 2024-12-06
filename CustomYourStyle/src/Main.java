public class Main {
    public static void main(String[] args) {
        ProductoFactory factory = new ProductoFactory();
        Producto camiseta = factory.crearProducto("Ropa", 1, "Camiseta Deportiva", "Rojo", "Algodón", "M", "Nike");
        ProductoBuilder builder = new ProductoBuilder(camiseta);
        builder.personalizarColor("Azul");
        Producto personalizada = builder.obtenerResultado();

        AdministradorPedidos admin = AdministradorPedidos.getInstance();
        Pedido pedido = new Pedido(101);
        pedido.agregarProducto(personalizada);
        admin.agregarPedido(pedido);

        personalizada.mostrarDetalles();
    }
}

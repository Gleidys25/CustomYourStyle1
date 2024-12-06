import java.time.LocalDate;

public class ProductoFactory {
    public Producto crearProducto(String tipo, int id, String nombre, String... detalles) {
        return switch (tipo) {
            case "Ropa" -> new Ropa(id, nombre, detalles[0], detalles[1], detalles[2], detalles[3]);
            case "Accesorio" -> new Accesorio(
    id, 
    nombre, 
    detalles[0],  // Diseñador
    detalles[1],  // Material
    LocalDate.parse(detalles[2]) // Fecha de elaboración como LocalDate
);

            case "Calzado" -> new Calzado(id, nombre, detalles[0], detalles[1], detalles[2]);
            default -> throw new IllegalArgumentException("Tipo no válido");
        };
    }
}

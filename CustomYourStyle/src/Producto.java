public abstract class Producto implements Cloneable {
    private int id;
    private String nombre;
    private String categoria;

    public Producto(int id, String nombre, String categoria) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getCategoria() { return categoria; }

    @Override
    public Producto clone() {
        try {
            return (Producto) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public abstract void mostrarDetalles();
}

import java.time.LocalDate;

public class Accesorio extends Producto {
    private String diseñador;
    private LocalDate fechaElaboracion;
    private String material;

    public Accesorio(int id, String nombre, String diseñador, String material, LocalDate fechaElaboracion) {
        super(id, nombre, "Accesorio");
        this.diseñador = diseñador;
        this.fechaElaboracion = fechaElaboracion;
        this.material = material;
    }

    public String getDiseñador() {
        return diseñador;
    }

    public LocalDate getFechaElaboracion() {
        return fechaElaboracion;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Accesorio: " + getNombre() +
                ", Diseñador: " + diseñador +
                ", Material: " + material +
                ", Fecha de elaboración: " + fechaElaboracion);
    }
}

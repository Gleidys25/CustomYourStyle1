public class Calzado extends Producto {
    private String capellada; // Material del cuerpo superior del calzado
    private String suela;     // Tipo de suela
    private String cierre;    // Tipo de cierre

    public Calzado(int id, String nombre, String capellada, String suela, String cierre) {
        super(id, nombre, "Calzado");
        this.capellada = capellada;
        this.suela = suela;
        this.cierre = cierre;
    }

    public String getCapellada() {
        return capellada;
    }

    public String getSuela() {
        return suela;
    }

    public String getCierre() {
        return cierre;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Calzado: " + getNombre() +
                ", Capellada: " + capellada +
                ", Suela: " + suela +
                ", Cierre: " + cierre);
    }
}

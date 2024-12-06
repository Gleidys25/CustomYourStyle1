// Ropa.java
public class Ropa extends Producto {
    private String color, tela, talla, marca;

    public Ropa(int id, String nombre, String color, String tela, String talla, String marca) {
        super(id, nombre, "Ropa");
        this.color = color;
        this.tela = tela;
        this.talla = talla;
        this.marca = marca;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Ropa: " + getNombre() + ", Color: " + color + ", Tela: " + tela + ", Talla: " + talla + ", Marca: " + marca);
    }

    public void setColor(String color2) {
        // TODO Auto-generated method stub
        this.color = color2;
    }
}

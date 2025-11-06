package Ejercicio1;


public class Producto {

    private String nombre;
    private double precio;
    private Descuento descuento; // Puede ser descuento fijo o porcentaje

    public Producto(String nombre, double precio, Descuento descuento) {
        this.nombre = nombre;
        this.precio = precio;
        this.descuento = descuento;
    }

    public double calcularPrecioFinal() {
        return descuento.aplicarDescuento(precio);
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}

package Ejercicio1;

public class Main {
    public static void main(String[] args) {

        Descuento descuentoFijo = new DescuentoFijo(5000);
        Descuento descuentoPorcentaje = new DescuentoPorcentaje(20);

        // Crear productos aplicando distintos descuentos
        Producto producto1 = new Producto("Camiseta", 30000, descuentoFijo);
        Producto producto2 = new Producto("Zapatos", 120000, descuentoPorcentaje);

        // Mostrar resultados
        System.out.println("Producto: " + producto1.getNombre());
        System.out.println("Precio original: " + producto1.getPrecio());
        System.out.println("Precio FINAL (con descuento fijo): " + producto1.calcularPrecioFinal());

        System.out.println("\nProducto: " + producto2.getNombre());
        System.out.println("Precio original: " + producto2.getPrecio());
        System.out.println("Precio FINAL (con descuento porcentaje): " + producto2.calcularPrecioFinal());
    }
}

package Ejercicio2;

public class DocumentoExcel extends Documento {

    @Override
    public void exportar(String contenido) {
        System.out.println("Exportando Excel: " + contenido);
    }
}

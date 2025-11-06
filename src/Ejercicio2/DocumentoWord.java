package Ejercicio2;

public class DocumentoWord extends Documento {

    @Override
    public void exportar(String contenido) {
        System.out.println("Exportando Word: " + contenido);
    }
}

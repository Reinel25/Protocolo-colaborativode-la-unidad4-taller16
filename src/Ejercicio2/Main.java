package Ejercicio2;

public class Main {
    public static void main(String[] args) {

        Documento pdf = new DocumentoPDF();
        Documento word = new DocumentoWord();
        Documento excel = new DocumentoExcel();

        pdf.exportar("Contenido del reporte PDF");
        word.exportar("Contenido del reporte Word");
        excel.exportar("Contenido del reporte Excel");
    }
}
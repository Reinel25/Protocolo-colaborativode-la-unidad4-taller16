package Ejercicio3;


public class Correo extends Mensajero {

    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando correo: " + mensaje);
    }
}

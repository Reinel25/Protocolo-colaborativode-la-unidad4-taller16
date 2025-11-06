package Ejercicio3;

public class Push extends Mensajero {

    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando notificación push: " + mensaje);
    }
}

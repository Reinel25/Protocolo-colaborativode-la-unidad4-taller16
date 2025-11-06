package Ejercicio3;

public class SMS extends Mensajero {

    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando SMS: " + mensaje);
    }
}

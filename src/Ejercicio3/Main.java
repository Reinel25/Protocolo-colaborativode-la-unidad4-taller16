package Ejercicio3;

public class Main {
    public static void main(String[] args) {

        Mensajero correo = new Correo();
        Mensajero sms = new SMS();
        Mensajero push = new Push();

        correo.enviar("Mensaje de prueba por correo");
        sms.enviar("Mensaje de prueba por SMS");
        push.enviar("Mensaje de prueba por push");
    }
}

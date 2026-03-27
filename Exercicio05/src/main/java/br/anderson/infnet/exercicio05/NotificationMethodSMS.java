package br.anderson.infnet.exercicio05;

public class NotificationMethodSMS implements NotificationMethod{

    @Override
    public void notifyUser(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

package br.anderson.infnet.exercicio05;

public class NotificationMethodEmail implements NotificationMethod {

    @Override
    public void notifyUser(String message) {
        System.out.println("Sending EMAIL: " + message);
    }
}

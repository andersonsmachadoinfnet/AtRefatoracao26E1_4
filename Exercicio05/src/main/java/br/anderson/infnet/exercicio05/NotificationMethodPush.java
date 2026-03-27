package br.anderson.infnet.exercicio05;

public class NotificationMethodPush implements NotificationMethod {
    @Override
    public void notifyUser(String message) {
        System.out.println("Sending PUSH: " + message);
    }
}

package br.anderson.infnet.exercicio05;

public class NotificationService {
    private NotificationMethod method;

    public NotificationService(NotificationMethod method) {
        this.method = method;
    }

    public void notifyUser(String message) {
        method.notifyUser(message);
    }
}

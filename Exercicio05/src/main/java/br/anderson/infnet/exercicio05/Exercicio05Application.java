package br.anderson.infnet.exercicio05;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Exercicio05Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Exercicio05Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        NotificationService notificationService = new NotificationService(new NotificationMethodEmail());
        notificationService.notifyUser("Teste de envio");
    }
}

package br.anderson.infnet.exercicio04;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Exercicio04Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Exercicio04Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        User user = new User("Fulano", "fulano@gmail.com");
        user.addAddress(new Address("Rua das Palmeiras","456", "Niterói","RJ","24220-123","Brasil"));

        System.out.println(user);
    }
}

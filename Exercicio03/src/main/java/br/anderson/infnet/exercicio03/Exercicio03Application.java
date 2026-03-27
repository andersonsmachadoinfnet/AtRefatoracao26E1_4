package br.anderson.infnet.exercicio03;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Exercicio03Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Exercicio03Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(calculatePrice(10.00, 1, true));
    }

    // Função original a ser refatorada:
    public double calculatePrice(double basePrice, int customerType, boolean holiday) {
        double discount = 0;
        if (customerType == 1) discount = 0.1;
        else if (customerType == 2) discount = 0.15;
        if (holiday) discount += 0.05;
        return basePrice * (1 - discount);
    }
}

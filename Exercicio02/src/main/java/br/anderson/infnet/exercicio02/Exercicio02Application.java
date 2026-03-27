package br.anderson.infnet.exercicio02;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Exercicio02Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Exercicio02Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Client client = new Client("Fulano", "fulano@gmail.com");
		Order order = new Order(client, 100.00, OrderType.COMIMPOSTO);
		Invoice invoice = new Invoice(order);

		invoice.process();
	}
}

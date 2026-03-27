package br.anderson.infnet.exercicio01;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Exercicio01Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Exercicio01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Avaliador avaliador = new Avaliador();
		System.out.println(avaliador.avaliar(10));
	}
}

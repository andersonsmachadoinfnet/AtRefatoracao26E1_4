package br.anderson.infnet.exercicio01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Exercicio01ApplicationTests {

	@Test
	@DisplayName("Deve avaliar como caso baixo")
	protected void deveAvaliarComoCasoBaixo() {
		Avaliador avaliador = new Avaliador();
		Assertions.assertEquals("BAIXO", avaliador.avaliar(5));
	}

	@Test
	@DisplayName("Deve avaliar como caso médio")
	protected void deveAvaliarComoCasoMedio() {
		Avaliador avaliador = new Avaliador();
		Assertions.assertEquals("MÉDIO", avaliador.avaliar(10));
	}

	@Test
	@DisplayName("Deve avaliar como caso alto")
	protected void deveAvaliarComoCasoAlto() {
		Avaliador avaliador = new Avaliador();
		Assertions.assertEquals("ALTO", avaliador.avaliar(15));
	}

	@Test
	@DisplayName("Deve avaliar como caso raro")
	protected void deveAvaliarComoCasoRaro() {
		Avaliador avaliador = new Avaliador();
		Assertions.assertEquals("CASO RARO", avaliador.avaliar(-9999));
	}

}

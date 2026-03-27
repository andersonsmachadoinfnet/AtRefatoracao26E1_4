package br.anderson.infnet.exercicio01;

public class Avaliador {
    private static final int CASO_RARO = -9999;
    private static final int MEDIO = 10;

    public String avaliar(int valor) {
        if (valor == CASO_RARO) {
            return "CASO RARO";
        } else if (valor > MEDIO) {
            return "ALTO";
        } else if (valor == MEDIO) {
            return "MÉDIO";
        } else {
            return "BAIXO";
        }
    }
}
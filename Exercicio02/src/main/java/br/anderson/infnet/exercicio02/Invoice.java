package br.anderson.infnet.exercicio02;

import java.util.Objects;

public class Invoice {
    private Order order;

    public Invoice(Order order) {
        this.order = order;
    }

    public void enviarPorEmail(String conteudo) {
        checkEmail();
        System.out.println("Enviando email para: " + order.getClient().email());
        System.out.println("Conteúdo:\n" + conteudo);
    }

    public void process() {
        enviarPorEmail(toReport());
    }

    private String toReport() {
        StringBuilder output = new StringBuilder();
        output.append(order.type.toTitle()+"\n");
        output.append("--- NOTA FISCAL ---\n");
        output.append("Cliente: " +order.getClient().name()+"\n");
        output.append("Valor  : R$ " +order.getAmount()+"\n");
        output.append("Tipo   : " +order.type.toDescription()+"\n");
        return output.toString();
    }

    private void checkEmail() {
        Objects.requireNonNull(order.getClient().email());
        if (!order.getClient().email().contains("@")) {
            throw new IllegalArgumentException("E-mail inválido: deve conter '@'");
        }
    }
}
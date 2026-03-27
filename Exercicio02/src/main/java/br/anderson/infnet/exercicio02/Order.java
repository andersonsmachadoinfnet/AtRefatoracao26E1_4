package br.anderson.infnet.exercicio02;

public class Order {
    private Client client;
    public double amount;
    public OrderType type;

    public Order(Client client, double amount, OrderType type) {
        this.client = client;
        this.amount = amount;
        this.type = type;
    }

    public Client getClient() {
        return client;
    }

    public double getAmount() {
        return amount;
    }

    public OrderType getType() {
        return type;
    }
}

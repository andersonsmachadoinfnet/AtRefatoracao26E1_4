package br.anderson.infnet.exercicio03;

public class CalculateAlgoritmForCustomerType implements CalculateAlgoritm {
    private Order order;

    public CalculateAlgoritmForCustomerType(Order order) {
        this.order = order;
    }

    @Override
    public double getDiscount() {
        return order.customerType().getDiscount();
    }
}

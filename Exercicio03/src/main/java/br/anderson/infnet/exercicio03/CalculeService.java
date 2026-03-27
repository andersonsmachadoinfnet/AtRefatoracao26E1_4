package br.anderson.infnet.exercicio03;

import java.util.ArrayList;

public class CalculeService {
    private Order order;
    private ArrayList<CalculateAlgoritm> algoritms;

    public CalculeService(Order order) {
        this.order = order;
        this.algoritms = new ArrayList<>();
        this.algoritms.add(new CalculateAlgoritmForCustomerType(this.order));
        this.algoritms.add(new CalculateAlgoritmForHoliday(this.order.holiday()));
    }

    public double calculatePrice() {
        double discount = algoritms.stream().mapToDouble(CalculateAlgoritm::getDiscount).sum();
        return order.basePrice() * (1-discount);
    }
}

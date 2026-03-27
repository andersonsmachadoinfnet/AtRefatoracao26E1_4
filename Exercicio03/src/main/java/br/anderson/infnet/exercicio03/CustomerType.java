package br.anderson.infnet.exercicio03;

public enum CustomerType {
    REGULAR,
    SPECIAL,
    VIP;

    public double getDiscount() {
        return switch (this) {
            case SPECIAL -> 0.1;
            case VIP -> 0.15;
            default -> 0;
        };
    }
}

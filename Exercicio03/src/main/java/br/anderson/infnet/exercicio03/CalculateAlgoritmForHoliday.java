package br.anderson.infnet.exercicio03;

public class CalculateAlgoritmForHoliday implements CalculateAlgoritm {
    private boolean isHoliday;

    public CalculateAlgoritmForHoliday(boolean isHoliday) {
        this.isHoliday = isHoliday;
    }

    @Override
    public double getDiscount() {
        return (this.isHoliday) ? 0.05 : 0.0;
    }
}

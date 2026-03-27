package br.anderson.infnet.exercicio02;

public enum OrderType {
    SIMPLES(1),
    COMIMPOSTO(2),
    FANTASMA(-1),
    DESCONHECIDO(-2);

    private final int code;

    private OrderType(int code) {
        this.code = code;
    }

    public int getCode() {
        return this.code;
    }

    public String toTitle() {
        switch (this) {
            case SIMPLES: return "Nota fiscal simples";
            case COMIMPOSTO: return "Nota fiscal com imposto";
            case FANTASMA: return "Nota fiscal fantasma";
            default: return "Tipo desconhecido";
        }
    }

    public String toDescription() {
        switch (this) {
            case SIMPLES: return "Simples";
            case COMIMPOSTO: return "Com imposto";
            default: return "Tipo desconhecido";
        }
    }
}

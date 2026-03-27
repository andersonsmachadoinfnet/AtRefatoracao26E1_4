package br.anderson.infnet.exercicio06;

abstract class DocumentBase {
    protected DocumentType type;

    public DocumentBase(DocumentType type) {
        this.type = type;
    }

    abstract void print();
}

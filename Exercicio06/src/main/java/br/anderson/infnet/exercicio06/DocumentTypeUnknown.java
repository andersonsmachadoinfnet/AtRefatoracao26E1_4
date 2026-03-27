package br.anderson.infnet.exercicio06;

public class DocumentTypeUnknown  extends DocumentBase {

    public DocumentTypeUnknown() {
        super(DocumentType.UNKNOWN);
    }

    @Override
    void print() {
        System.out.println("Unknown format");
    }
}

package br.anderson.infnet.exercicio06;

public class DocumentTypeHtml  extends DocumentBase {

    public DocumentTypeHtml() {
        super(DocumentType.HTML);
    }

    @Override
    void print() {
        System.out.println("Printing HTML");
    }
}

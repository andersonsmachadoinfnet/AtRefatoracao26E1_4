package br.anderson.infnet.exercicio06;

public class DocumentTypePdf extends DocumentBase {

    public DocumentTypePdf() {
        super(DocumentType.PDF);
    }

    @Override
    void print() {
        System.out.println("Printing PDF");
    }
}

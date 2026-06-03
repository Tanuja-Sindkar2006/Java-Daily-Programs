package interfaces;

interface Printable {
    void print();
}

class Document implements Printable {
    public void print() {
        System.out.println("Printing the document...");
    }
}

public class PrintableDemo {
    public static void main(String[] args) {
        Document d = new Document();
        d.print();
    }
}

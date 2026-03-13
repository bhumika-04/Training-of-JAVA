// Interface — fully abstract, a class can implement multiple interfaces

interface Printable {
    void print();
}

interface Showable {
    void show();
}

// Document implements both interfaces
class Document implements Printable, Showable {

    String content;

    Document(String content) {
        this.content = content;
    }

    public void print() {
        System.out.println("Printing: " + content);
    }

    public void show() {
        System.out.println("Showing: " + content);
    }
}

class Interface {

    public static void main(String[] args) {

        Document doc = new Document("Java Notes");
        doc.print();
        doc.show();
    }
}

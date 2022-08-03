public class Book extends Product {
    private String author;

    public Book(String title, String author, int prise) {
        super(title, prise);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}

public abstract class Book {
    private String title;
    private int numberOfPages;
    private String author;
    private boolean isHardcover;

    public Book(String title, int numberOfPages, String author, boolean isHardcover) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.author = author;
        this.isHardcover = isHardcover;
    }

    public abstract void read();

    @Override
    public String toString() {
        return "Book Title: " + title + " | Author: " + author + " | Pages: " + numberOfPages + " | Hardcover: " + isHardcover;
    }
}

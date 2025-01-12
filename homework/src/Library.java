public class Library {
    private int id;
    private String name;

    public Library(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void printInfo() {
        System.out.println("Library ID: " + id);
        System.out.println("Library Name: " + name);

        Book book = new Book(101, "Java Programming");
        book.printBookInfo();
    }

    public class Book {
        private int bookId;
        private String bookName;

        public Book(int bookId, String bookName) {
            this.bookId = bookId;
            this.bookName = bookName;
        }

        public void printBookInfo() {
            System.out.println("Book ID: " + bookId);
            System.out.println("Book Name: " + bookName);
        }
    }

    public static void main(String[] args) {
        Library library = new Library(1, "City Library");
        library.printInfo();
    }
}

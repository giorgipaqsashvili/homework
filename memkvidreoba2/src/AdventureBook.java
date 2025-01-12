public class AdventureBook extends Book {
    public AdventureBook(String title, int numberOfPages, String author, boolean isHardcover) {
        super(title, numberOfPages, author, isHardcover);
    }

    @Override
    public void read() {
        System.out.println("I am reading the adventure book: " + super.toString());
    }

    @Override
    public String toString() {
        return super.toString() + " [Adventure Book]";
    }
}

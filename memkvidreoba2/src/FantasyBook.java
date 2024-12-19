public class FantasyBook extends Book {
    private String countryOfMythology;

    public FantasyBook(String title, int numberOfPages, String author, boolean isHardcover, String countryOfMythology) {
        super(title, numberOfPages, author, isHardcover);
        this.countryOfMythology = countryOfMythology;
    }

    @Override
    public void read() {
        System.out.println("I am reading the fantasy book: " + super.toString());
    }

    @Override
    public String toString() {
        return super.toString() + " [Fantasy Book] | Mythology Country: " + countryOfMythology;
    }
}

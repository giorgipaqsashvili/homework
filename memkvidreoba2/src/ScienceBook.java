public class ScienceBook extends Book {
    private String fieldOfScience;

    public ScienceBook(String title, int numberOfPages, String author, boolean isHardcover, String fieldOfScience) {
        super(title, numberOfPages, author, isHardcover);
        this.fieldOfScience = fieldOfScience;
    }

    @Override
    public void read() {
        System.out.println("I am reading the science book: " + super.toString());
    }

    @Override
    public String toString() {
        return super.toString() + " [Science Book] | Field: " + fieldOfScience;
    }
}

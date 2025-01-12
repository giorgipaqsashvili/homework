public class BookAdvisor extends LibraryEmployee {
    private double recommendationRating;
    private String libraryType;

    public BookAdvisor(String firstName, String lastName, String employeeId, double recommendationRating, String libraryType) {
        super(firstName, lastName, employeeId);
        this.recommendationRating = recommendationRating;
        this.libraryType = libraryType;
    }

    public double getRecommendationRating() {
        return recommendationRating;
    }

    public String getLibraryType() {
        return libraryType;
    }

    public String recommendBook() {
        return "Recommended Book: The Great Adventure";
    }

    @Override
    public String toString() {
        return super.toString() + " [Book Advisor] | Rating: " + recommendationRating + " | Library: " + libraryType;
    }
}

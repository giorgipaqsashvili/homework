public class BookIssuer extends LibraryEmployee {
    private String issueStartTime;
    private String issueEndTime;

    public BookIssuer(String firstName, String lastName, String employeeId, String issueStartTime, String issueEndTime) {
        super(firstName, lastName, employeeId);
        this.issueStartTime = issueStartTime;
        this.issueEndTime = issueEndTime;
    }

    public String getIssueStartTime() {
        return issueStartTime;
    }

    public String getIssueEndTime() {
        return issueEndTime;
    }

    @Override
    public String toString() {
        return super.toString() + " [Book Issuer] | Issues books from " + issueStartTime + " to " + issueEndTime;
    }
}

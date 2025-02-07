public class Bookkeeper extends LibraryEmployee {
    public Bookkeeper(String firstName, String lastName, String employeeId) {
        super(firstName, lastName, employeeId);
    }

    @Override
    public String toString() {
        return super.toString() + " [Bookkeeper]";
    }
}

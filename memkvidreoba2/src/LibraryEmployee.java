public abstract class LibraryEmployee {
    private String firstName;
    private String lastName;
    private String id;

    public LibraryEmployee(String firstName, String lastName, String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee: " + firstName + " " + lastName + " | ID: " + id;
    }
}


public class Library {
    private String name; // The name of the library
    private LibraryEmployee[] employees; // Array to hold library employees
    private Book[] books; // Array to hold books in the library

    // Constructor to initialize the library name, employees array, and books array
    public Library(String name, int numEmployees, int numBooks) {
        this.name = name;
        this.employees = new LibraryEmployee[numEmployees];
        this.books = new Book[numBooks];
    }

    // Getter and Setter for library name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for employees array
    public LibraryEmployee[] getEmployees() {
        return employees;
    }

    public void setEmployees(LibraryEmployee[] employees) {
        this.employees = employees;
    }

    // Getter and Setter for books array
    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    // Method to add an employee at a specific index
    public void addEmployee(int index, LibraryEmployee employee) {
        if (index >= 0 && index < employees.length) {
            employees[index] = employee;
        }
    }

    // Method to add a book at a specific index
    public void addBook(int index, Book book) {
        if (index >= 0 && index < books.length) {
            books[index] = book;
        }
    }

    // Method to display library details (employees and books)
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Library: ").append(name).append("\n");
        sb.append("Employees:\n");
        for (LibraryEmployee employee : employees) {
            if (employee != null) {
                sb.append(employee).append("\n");
            }
        }
        sb.append("Books:\n");
        for (Book book : books) {
            if (book != null) {
                sb.append(book).append("\n");
            }
        }
        return sb.toString();
    }
}

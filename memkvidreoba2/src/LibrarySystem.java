public class LibrarySystem {
    public static void main(String[] args) {
        LibraryEmployee bookkeeper = new Bookkeeper("Alice", "Smith", "E001");
        LibraryEmployee bookIssuer = new BookIssuer("Bob", "Johnson", "E002", "9:00 AM", "5:00 PM");
        LibraryEmployee silenceController = new SilenceController("Charlie", "Williams", "E003", 8.5);
        LibraryEmployee bookAdvisor = new BookAdvisor("Diana", "Brown", "E004", 9.2, "Public Library");

        Book adventureBook = new AdventureBook("The Lost Island", 350, "James Walker", true);
        Book scienceBook = new ScienceBook("Quantum Physics Explained", 400, "Marie Curie", false, "Physics");
        Book fantasyBook = new FantasyBook("Legends of Avalon", 450, "John Doe", true, "Avalon");

        System.out.println(bookkeeper);
        System.out.println(bookIssuer);
        System.out.println(silenceController);
        System.out.println(bookAdvisor);

        System.out.println(adventureBook);
        adventureBook.read();

        System.out.println(scienceBook);
        scienceBook.read();

        System.out.println(fantasyBook);
        fantasyBook.read();

        System.out.println("Book Advisor recommends: " + ((BookAdvisor)bookAdvisor).recommendBook());
    }
}

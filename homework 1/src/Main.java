public class Main {
    public static void main(String[] args) {
        Writer writer1 = new Writer("ქეთევან", "ბეჟაშვილი");
        Writer writer2 = new Writer("გიო", "ჭანტურია");

        Book book1 = new Book("მზის სხივი", 200, "დრამა", writer1);
        Book book2 = new Book("მზის სხივი", 200, "დრამა", writer1); // ეს წიგნი მსგავსი იქნება book1-ს
        Book book3 = new Book("თავისუფლება", 300, "თეორია", writer2);

        Book[] books = {book1, book2, book3};

        for (Book book : books) {
            System.out.println(book.toString());
        }

        System.out.println("\nBook1 and Book2 are equal: " + book1.equals(book2));
        System.out.println("Book1 and Book3 are equal: " + book1.equals(book3));

        Fraction[] fractions = {
                new Fraction(1, 2),
                new Fraction(2, 4),
                new Fraction(3, 4),
                new Fraction(1, 2),
                new Fraction(5, 6)
        };

        for (Fraction fraction : fractions) {
            System.out.println(fraction.toString());
        }

        int countEqualFractions = 0;
        for (int i = 0; i < fractions.length; i++) {
            for (int j = i + 1; j < fractions.length; j++) {
                if (fractions[i].equals(fractions[j])) {
                    countEqualFractions++;
                }
            }
        }

        System.out.println("\nNumber of equal fractions: " + countEqualFractions);
        QuadraticEquation[] equations = {
                new QuadraticEquation(1, -3, 2),  
                new QuadraticEquation(1, -3, 2),
                new QuadraticEquation(1, 2, 1),
                new QuadraticEquation(1, 0, -1),
                new QuadraticEquation(1, 0, 1)
        };

        for (QuadraticEquation equation : equations) {
            System.out.println(equation.toString());
        }

        int equalEquationsCount = 0;
        for (int i = 0; i < equations.length; i++) {
            for (int j = i + 1; j < equations.length; j++) {
                if (equations[i].equals(equations[j])) {
                    equalEquationsCount++;
                }
            }
        }

        System.out.println("\nNumber of equal quadratic equations: " + equalEquationsCount);
    }
}
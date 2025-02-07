class Writer {
    private String name;
    private String surname;

    public Writer(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Writer writer = (Writer) obj;
        return name.equals(writer.name) && surname.equals(writer.surname);
    }

    @Override
    public int hashCode() {
        return 31 * name.hashCode() + surname.hashCode();
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }
}

class Book {
    private String title;
    private int pages;
    private String genre;
    private Writer author;

    public Book(String title, int pages, String genre, Writer author) {
        this.title = title;
        this.pages = pages;
        this.genre = genre;
        this.author = author;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return pages == book.pages && title.equals(book.title) && genre.equals(book.genre) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return 31 * title.hashCode() + genre.hashCode() + pages + author.hashCode();
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Pages: " + pages + ", Genre: " + genre + ", Author: " + author.toString();
    }
}



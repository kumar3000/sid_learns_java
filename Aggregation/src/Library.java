public class Library {

    String name;
    int year;
    private final Book[] books;

    Library(String name, int year, Book[] books) {
        this.name = name;
        this.year = year;
        this.books = books;
    }

    @Override
    public String toString() {
        return "The " + this.year + " " + this.name + " has " + books.length + " books!";
    }

    void listBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}

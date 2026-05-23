public class Main {
    public static void main(String[] args) {

        // Aggregation = Represents a "has-a" relationship between objects
        //               One object contains another object as part of its structure,
        //               but the contained object/s can exist independently.

        Book book1 = new Book("The Fellowship of the Ring", 423);
        Book book2 = new Book("The Two Towers", 352);
        Book book3 = new Book("The Return of the King", 416);
        Book[] books = {book1, book2, book3};

        // the library has aggregated a few Book objects!
        Library library = new Library("Sid's Library", 2026, books);
        System.out.println(library);
        library.listBooks();
    }
}

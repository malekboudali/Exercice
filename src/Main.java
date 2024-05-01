public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "978-0743273565");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "978-0061120084");
        Book book3 = new Book("To Kill", "Malek", "978-0061120088668");

        Library library = new Library(5);


        library.addBook(book1);
        library.addBook(book3);



        System.out.println("Books in the library:");
        library.showLibraryBooks();


        boolean sameIsbn = Book.compareBooks(book1, book3);
        System.out.println("Are the ISBNs the same? " + sameIsbn);
    }
}

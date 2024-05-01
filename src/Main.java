public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "978-0743273565");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "978-0061120084");

        Library library = new Library(5);


        library.addBook(book1);
        library.addBook(book2);



        System.out.println("Books in the library:");
        library.showLibraryBooks();


        boolean sameIsbn = Book.compareBooks(book1, book2);
        System.out.println("Are the ISBNs the same? " + sameIsbn);
    }
}

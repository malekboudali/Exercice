public class Library {

    private Book[] books;


    public Library(int size) {
        books = new Book[size];
    }


    public void addBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                break;
            }
        }
    }


    public void showLibraryBooks() {
        for (Book book : books) {
            if (book != null) {
                book.displayDetails();
                System.out.println("--------------------");
            }
        }
    }
}

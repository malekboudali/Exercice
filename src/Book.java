public class Book {

        private String title;
        private String author;
        private String isbn;


        public Book(String title, String author, String isbn) {
            this.title = title;
            this.author = author;
            this.isbn = isbn;
        }


        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public String getIsbn() {
            return isbn;
        }


        public static boolean compareBooks(Book a, Book b) {
            return a.getIsbn().equals(b.getIsbn());
        }


        public void displayDetails() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        }
    }


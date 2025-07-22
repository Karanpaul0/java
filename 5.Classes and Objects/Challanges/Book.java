
public class Book {

    static int totalNoOfbooks;

    String title;
    String author;
    String isbn;
    boolean isBorrowed;

    static {
        totalNoOfbooks = 0;
    }

    {
        totalNoOfbooks++;
    }

    Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    Book(String isbn) {
        this(isbn, "unknown", "unknwon");

    }

    static int getTotalNoOfBooks() {
        return totalNoOfbooks;
    }

    void borrowBook() {
        if (isBorrowed) {
            System.out.println(this.title+" is already borrowed");
        } else {
            this.isBorrowed = true;
            System.out.println("Enjoy "+this.title);
        }
    }

    void returnBook() {
        if (isBorrowed) {
            this.isBorrowed = false;
            System.out.println("I hope you enjoyed the book, please give a review");
        } else {
            System.out.println(this.title + " book is already in the library");
        }
    }

    public static void main(String[] args) {
        Book designOfThings = new Book("1", "Architectrure's things", "tabitabtab");
        Book myBook=new Book("2");
        System.out.println(Book.getTotalNoOfBooks());
        designOfThings.borrowBook();
        designOfThings.returnBook();
        myBook.borrowBook();
        myBook.borrowBook();
        myBook.returnBook();
        myBook.returnBook();

    }
}

package Model;

public class Book {
    private int bookId;
    private String bookName;
    private String bookAuthor;
    private String bookDescription;

    public Book(String bookAuthor, int bookId, String bookDescription, String bookName) {
        this.bookAuthor = bookAuthor;
        this.bookId=bookId;
        this.bookDescription=bookDescription;
        this.bookName=bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }
    public String getBookName(){
        return bookName;
    }
    public String getBookDescription(){
        return bookDescription;
    }
    public int getBookId(){
        return bookId;
    }
}

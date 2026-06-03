public class Book extends LibraryItem {
    private String author;
    private boolean isBorrowed;

    public Book(String id, String title, String author) {
        super(id, title);
        this.author = author;
        this.isBorrowed = false;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void borrowBook() {
        isBorrowed = true;
    }

    public void returnBook() {
        isBorrowed = false;
    }

    @Override
    public void displayDetails() {
        System.out.println("Book ID: " + getId());
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + author);
        System.out.println("Status: " + (isBorrowed ? "Borrowed" : "Available"));
        System.out.println("-------------------");
    }
}
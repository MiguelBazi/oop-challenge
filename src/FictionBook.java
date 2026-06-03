public class FictionBook extends Book {
    private String genre;

    public FictionBook(String id, String title, String author, String genre) {
        super(id, title, author);
        this.genre = genre;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Type: Fiction");
        System.out.println("Genre: " + genre);
        System.out.println("-------------------");
    }
}
public class ReferenceBook extends Book {
    private String subject;

    public ReferenceBook(String id, String title, String author, String subject) {
        super(id, title, author);
        this.subject = subject;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Type: Reference Book");
        System.out.println("Subject: " + subject);
        System.out.println("-------------------");
    }
}
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Member> members = new ArrayList<>();

    // Method Overloading 1
    public void addBook(Book book) {
        books.add(book);
    }

    // Method Overloading 2
    public void addBook(String id, String title, String author) {
        books.add(new Book(id, title, author));
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public Book findBookById(String id) {
        for (Book b : books) {
            if (b.getId().equals(id)) {
                return b;
            }
        }
        return null;
    }

    public Member findMemberById(String id) {
        for (Member m : members) {
            if (m.getMemberId().equals(id)) {
                return m;
            }
        }
        return null;
    }

    public void borrowBook(String memberId, String bookId) {
        Member m = findMemberById(memberId);
        Book b = findBookById(bookId);

        if (m != null && b != null && !b.isBorrowed()) {
            b.borrowBook();
            m.borrowBook(b);
            System.out.println(m.getName() + " borrowed " + b.getTitle());
        } else {
            System.out.println("Cannot borrow book.");
        }
    }

    public void returnBook(String memberId, String bookId) {
        Member m = findMemberById(memberId);
        Book b = findBookById(bookId);

        if (m != null && b != null) {
            b.returnBook();
            m.returnBook(b);
            System.out.println(m.getName() + " returned " + b.getTitle());
        }
    }

    public void displayBooks() {
        System.out.println("===== Library Books =====");
        for (Book b : books) {
            b.displayDetails();
        }
    }
}
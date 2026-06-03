public class Main {
  public static void main(String[] args) {

    Library library = new Library();

    Book b1 = new FictionBook("F1", "Harry Potter", "J.K. Rowling", "Fantasy");
    Book b2 = new ReferenceBook("R1", "Java Handbook", "James Gosling", "Programming");

    // (overloading demo)
    library.addBook(b1);
    library.addBook("B3", "Clean Code", "Robert Martin");

    library.addBook(b2);

    Member m1 = new Member("M1", "Miguel");
    library.addMember(m1);

    library.displayBooks();

    library.borrowBook("M1", "F1");

    System.out.println();
    library.displayBooks();

    library.returnBook("M1", "F1");

    System.out.println();
    library.displayBooks();
  }
}
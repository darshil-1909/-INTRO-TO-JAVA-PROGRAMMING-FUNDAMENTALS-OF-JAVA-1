public class darshil1 {

    public static void main(String[] args) {

        Book b = new Book();
        Book b1 = new Book(67, "Java", "Dharm");
        b1.print();

    }
}

class Book {

    int book_id;
    String title, author;

    Book() {

        System.out.println("Default");
    }

    Book(int b, String t, String a) {

        book_id = b;
        title = t;
        author = a;

    }

    void print() {

        System.out.println("Book Id = " + book_id);
        System.out.println("Title = " + title);
        System.out.println("Author = " + author);

    }

}

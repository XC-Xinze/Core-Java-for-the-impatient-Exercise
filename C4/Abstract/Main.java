package C4.Abstract;

public class Main {
    public static void main(String[] args) {
        AbstractBook book1 = new Book("1984", "George Orwell");
        System.out.println(book1.getAuthor());
        System.out.println(book1.getTitle());
        //System.out.println(book1.getPublisher());
        //THIS can't work because
        //book1 is of type AbstractBook
        //try new way to define a book2
        if(book1 instanceof Book) {
            Book book2 = (Book) book1; // downcasting: book2 from AbstractBook to Book
            System.out.println(book2.getPublisher()); // now we can access the publisher
        } else {
            System.out.println("book1 is not an instance of Book");
        }
    }
}

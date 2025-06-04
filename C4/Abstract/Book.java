package C4.Abstract;

public class Book extends AbstractBook {
    public Book(   String title, String author) {
        super(title, author); // call the constructor of the abstract class
    }
    /* 
    public String getTitle() {
        return this.title; // implement the abstract method
    }
        can't access private variables of the abstract class
        unless we use protected or public or use pre-defined methods in superclass
        because I don't defined the method in the abstract class
        so I can't use it
    */
    public String getTitle() {
        return "test";
    }
    public String getPublisher() {
        return publisher; // can access protected variable
    }

    
   
}

package C4.Abstract;

public abstract class AbstractBook {
    //FORCE!!! subclasses to implement these methods
    //can have instance variables and methods
    private String title;
    private String author;//different from interface
    protected String publisher = "I AM PUBLISHER";//can have protected variables
    public AbstractBook(String title, String author) {
        //can have constructor
        this.title = title;
        this.author = author;
    }
    public abstract String getTitle();//use abstract keyword to declare an abstract method
    public String getAuthor() {
        return author;
    }
    

}

package C2.t4;

public class RecordTest {
    // hide data into the class(object) ---> record
        //cant change the variables of it but can access them
        //record has many pre-defined method--> can modify but not recommend
    
    public static void main(String[] args) {
        Point p1pPoint =new Point(1.1,2.2);
        System.out.println(p1pPoint.x() + " " +  p1pPoint.y());
        Point p2Point = new Point(1.3, 5.5);
    }
}

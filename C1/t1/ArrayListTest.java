package C1.t1;
import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args){
        String[] namesList = new String[5];
        //access namesList[5]--> ArrayIndexOutOfBoundsException
        //array length is initail can't change--> in C,  can use malloc to dynamic apply for the ram space
        //ArrayList can dynamic adjust space of ram for array---> transparent for programmer
            //has different writing style!
        ArrayList<String> style1 = new ArrayList<String>();
        var style2 = new ArrayList<String>();
        ArrayList<String> style3 = new ArrayList<>();//diamond syntax <>looks like a diamand/ recommend this syntax
        style1.add("style1");
        style2.add("style2");
        style3.add("style3");
        //tips: no initializer syntax for ArrayList-->can only build empty arraylist
        //this way can do is that:
        var styleWithListof = new ArrayList<String>(List.of("list","of"));
        System.out.println(styleWithListof);
        styleWithListof.add(0,"first");//add content before index 0
        System.out.println(styleWithListof);
        //access variable in ArrayList needs using method call instead of using []
        System.out.println(styleWithListof.get(2));
        styleWithListof.set(0, "set value");
        System.out.println(styleWithListof.get(0));
    }
}

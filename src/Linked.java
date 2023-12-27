//mostly use for manipulating data
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ArrayList;
public class Linked {
    public static void main(String[]args){
        ArrayList<String> a1 =new ArrayList<>();
        a1.add("nayak"); //a1=object reference of ArrayList
        a1.add("naresh");
        a1.add("raju");
        a1.add("mahesh");
        LinkedList<String> name=new LinkedList<>();
        name.addAll(a1);
        name.add("rakesh");
        name.add("keshav");
        name.add("munna");
        name.add("nanda");
        System.out.println(name);
       System.out.println(name.pollFirst());
        System.out.println(name);
       // System.out.println(name.getLast());
       // name.add(1,"raj");
        //System.out.println(name);
        //System.out.println(a1);



    }

}

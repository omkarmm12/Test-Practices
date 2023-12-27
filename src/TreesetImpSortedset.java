import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreesetImpSortedset {
    public static void main(String[]args){
        SortedSet<Integer> ts=new TreeSet<>();
        ts.add(77);
        ts.add(77);
       //ts.add(null);
        ts.add(90);
        ts.add(49);
        ts.add(34);
        ts.add(23);
        ts.add(44);
        ts.add(98);
        ts.add(17);
        ts.add(91);
        System.out.println(ts);
        //ts.add(null);
        //ts.pollLast();
       // System.out.println(ts.ceiling(89));
        System.out.println(ts);

    }
}

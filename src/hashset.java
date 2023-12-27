import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class hashset {
    public static void main(String[]args){
        Set<Integer> hs=new HashSet<>();
        hs.add(88);
        hs.add(99);
        hs.add(78);
        hs.add(null);
        hs.add(77);
        hs.add(77);
        hs.add(null);
        System.out.println(hs);

        hs.remove(88);
        System.out.println(hs);
        System.out.println(hs.size());
        for (Integer nu:hs){
            System.out.println(nu);
        }
    }
}

import java.net.CookieHandler;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class linkedhashset {
    public static void main(String[]args) {
        Set<Integer> lhs=new LinkedHashSet<>();
        lhs.add(66);
        lhs.add(null);
        lhs.add(99);
        lhs.add(68);
        lhs.add(90);
        lhs.add(46);
        lhs.add(34);
        lhs.add(22);
        lhs.add(77);
        lhs.add(77);


        System.out.println(lhs);
        System.out.println(lhs.size());

    }
}

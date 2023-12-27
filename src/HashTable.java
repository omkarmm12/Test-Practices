import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashTable {
    public static void main(String[]args){
        Hashtable<String,Integer>ht=new Hashtable<>();
        ht.put("nayak",8888);
        ht.put("rayudu",9999);
        ht.put("kumar",6666);
        ht.put("roy",7777);
        ht.put("reddy",4444);
       // ht.put(null,1111); not allow
        System.out.println(ht);
        System.out.println(ht.size());
        ht.remove("reddy");

        ht.putIfAbsent("naik",5555);
        System.out.println(ht);
        ht.put("naik",3333);
        System.out.println(ht);
        for (Map.Entry<String,Integer> en:ht.entrySet())
        {
            System.out.println(en);

        }
    }
}

import java.util.Comparator;
import java.util.TreeMap;

public class Treemap {
    public static void main(String[]args){
        TreeMap<String,Integer> tm=new TreeMap<>();
        tm.put("nayak",8888);
        //tm.put(null,6000);
        tm.put("raje",80000);
        tm.put("rajuku",55000);
        tm.put("rayudugaru",45000);
        tm.put("reddygaru",44000);
        tm.put("nayak",8888);
        tm.put("babu",8888);
        tm.put("u",1);
        System.out.println(tm);
        tm.remove("null");
        System.out.println(tm);
        System.out.println(tm.lastEntry());
        System.out.println(tm.lastKey());
        System.out.println(tm.firstEntry());
        System.out.println(tm.firstKey());
        System.out.println(tm.headMap("rajuku"));
        System.out.println(tm.tailMap("rajuku"));
        System.out.println(tm.subMap("nayak","rajuku"));
        System.out.println(tm.lowerEntry("rajuku"));
        System.out.println(tm.higherEntry("rajuku"));
        System.out.println(tm.ceilingKey("rajuku"));
        System.out.println(tm.floorKey("rajuku"));
        System.out.println(tm.descendingKeySet());
        System.out.println(tm.descendingMap());
        System.out.println(tm.getClass());


    }
}

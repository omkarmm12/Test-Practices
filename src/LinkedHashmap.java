import java.util.*;

public class LinkedHashmap {
    public static void main(String[]args){
        Map<Integer,String> m=new LinkedHashMap<>();
        m.put(6,"nayak");
        m.put(8,"rayudu");
        m.put(7,"kumar");
        m.put(10,"roy");
        m.put(9,"reddy");
       // m.put(null,"m");

        System.out.println(m);
        System.out.println();
        //retrieving keys from map
        System.out.println(m.keySet());
        System.out.println();
        Set<Integer> ks=m.keySet();
        System.out.println(ks);
        for(Integer k:ks) {
            System.out.println(k);
        }
        System.out.println();
         //retrieving values from map
        System.out.println(m.values());
        System.out.println();
         Collection<String> v=m.values();
         for ( String v1:v){
             System.out.println(v1);
         }
         System.out.println();
         //retrieving values based on keys from map
        System.out.println(m.get(9));
        System.out.println();
        System.out.println("by get(k) method ");
        for(Integer k:ks) {
            System.out.println(m.get(k));
        }
        System.out.println();
        //verification of keys in map
       System.out.println(m.containsKey(8));
        System.out.println(m.containsValue("kumar"));
        //Update or replace value in map
        m.put(8,"Naik");//we can use replace method instead of put in map
        System.out.println();
        System.out.println(m);
        System.out.println();
        m.putIfAbsent(8,"rayudu");
        System.out.println(m);
        System.out.println();
        System.out.println("entry set starting ");
        System.out.println();
        //we can get keys and values in map with entryset() method
        Set<Map.Entry<Integer,String>>Entries=m.entrySet();
        for (Map.Entry<Integer,String> entry:Entries){
            int key=entry.getKey();
            String value=entry.getValue();
            System.out.println(key +" >>> "+value);
        }

    }
}

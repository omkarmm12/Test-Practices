import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Hashmap {
    public static void main(String[]args){
        Map<String,Integer>hm=new HashMap<>();

        hm.put("kumar",80000);
        hm.put("raj",55000);
        hm.put("rayudu",45000);
        hm.put("reddy",44000);
        System.out.println(hm);
        System.out.println();
        System.out.println(hm.get("rayudu"));
        System.out.println();
        for (Map.Entry hme:hm.entrySet()) {
            System.out.println(hme.getValue());
        }
        hm.compute("kumar",(key,value)->(value-1000));
//        for (Map.Entry<String,Integer>hme:hm.entrySet()) {
//            System.out.println(hme.getKey()+" "+hme.getKey());
//        }
        System.out.println(hm);
       int n= hm.getOrDefault("raju",0);
        System.out.println(n);
        hm.putIfAbsent("nayak",9999);
        System.out.println(hm);
        Map<String,Integer>hm1=new HashMap<>(hm);
        System.out.println(hm1.equals(hm1));
        hm1.replaceAll((key,value)->key.equals("kumar")?value-1:value);
        System.out.println("this is replaceall method" +hm1);
        hm.put("kumar",90000);
       try {
           hm.put(null,6000);
           hm.put(null,null);}
       catch (Exception e){
           System.out.println("null not allowed");
       }
        hm.put("raje",80000);
        hm.put("rajuku",null);
        hm.put("rayudugaru",44000);
        hm.put("reddygaru",44000);
        hm.put(null,5);
        System.out.println(hm);
        System.out.println("by iterator");
        Iterator<Map.Entry<String,Integer>> it=hm.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<String,Integer>entry=it.next();
            String name=entry.getKey();
            Integer sal=entry.getValue();
            System.out.println(name +" :" + sal);
        }
        System.out.println("by for loop");
        for (Map.Entry<String,Integer> entry:hm.entrySet()){
            System.out.println(entry.getKey() +" :" + entry.getValue());
        }



    }
}

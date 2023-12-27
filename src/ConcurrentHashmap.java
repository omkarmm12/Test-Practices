//null will not accept.thread safe.impt Map,concurrentMap
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentHashmap {
    public static void main(String[]args){
        ConcurrentMap<String,Integer> hm=new ConcurrentHashMap<>();
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
        Map<String,Integer>hm1=new ConcurrentHashMap<>(hm);
        System.out.println(hm1.equals(hm1));
        hm1.replaceAll((key,value)->key.equals("kumar")?value-1:value);
        System.out.println("this is replaceall method" +hm1);
        hm.put("kumar",90000);
        try{ hm.put("raji",null);
             hm.put(null,null);}
        catch (Exception e){
            System.out.println(e);
        }
        hm.put("raje",80000);
        hm.put("rayudugaru",45000);
        hm.put("reddygaru",44000);
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

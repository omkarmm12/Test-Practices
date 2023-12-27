
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[]args){
        Queue<String>pq=new PriorityQueue<>();// pq=object reference of PriorityQueue class
        System.out.println("is empty: " +pq.isEmpty());
        pq.add("Mango");
        pq.add("Apple");
        pq.add("Pomegranate");
        pq.add("Custard Apple");
        pq.add("Banana");
       // pq.add(null);
        System.out.println(pq);
        pq.forEach(n->{System.out.println(n);});

        Iterator<String>it=pq.iterator();
        System.out.println("now while loop with iterator :");
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("now while loop will run :");
        while (!pq.isEmpty()){
            System.out.println(pq.poll());
        }

//        System.out.println(pq);
//        System.out.println(pq.remove());
//        pq.poll();
//        System.out.println(pq);


    }
}

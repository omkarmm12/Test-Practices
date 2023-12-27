import java.util.*;

public class QueueImplementation {
    public static void main(String[] args){
        Queue<Integer>q=new PriorityQueue<>();
        q.add(9);
        q.offer(3);
        q.add(8);
        q.offer(34);
        q.add(31);
        q.add(99);
       try {
           q.add(null);
       }
       catch (Exception e){
           System.out.println("exception "+e.getMessage());

       }
        System.out.println(q.isEmpty());
        System.out.println("Queue size is :" +q.size());
        System.out.println(q.peek());
        q.poll();
       System.out.println("Queue size is :" +q.size());
        System.out.println(q.peek());
        System.out.println(q.contains(4));
       // while (!q.isEmpty()){
       //     System.out.println(q.poll());
       // }
        Queue<Integer>qc=new PriorityQueue<>(q);
        qc.add(55);
        System.out.println("it is from qc :" +qc.peek());
        while(!qc.isEmpty()){
            System.out.println(qc.poll());
        }
        System.out.println("it is from qc :" +qc.peek());

    }
}

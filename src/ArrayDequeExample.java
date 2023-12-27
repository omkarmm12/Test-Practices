import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class ArrayDequeExample{
    public static void main(String[]args){
        Deque<String> ad=new ArrayDeque<>();
        ad.offerFirst("nayak");
        ad.offer("kumar");
        ad.addFirst("omakr");
        ad.add("naik");
        ad.add("naik");
        System.out.println(ad);
        System.out.println(ad.pop());
        System.out.println(ad.peek());
       System.out.println(ad.pollFirst());
        System.out.println(ad);
        System.out.println("now linked list ");
        Deque<String> ad1=new LinkedList<>(ad);
        ad1.addFirst("munna");
        ad1.addFirst("anil");
        ad1.addLast("tharun");
        System.out.println(ad1);
        for (String i:ad1){
            System.out.println(i);
        }

    }
    }





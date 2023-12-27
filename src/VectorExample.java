//mostly use in multithreading environment
import java.util.List;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(21);
        v.addElement(33);
        v.add(12);
        v.addElement(54);
        v.add(89);
        v.add(77);
        v.add(22);
        v.add(99);
        v.add(77);
        v.add(22);
        v.add(22);
        v.insertElementAt(55, 2);

        System.out.println(v.get(4));

        System.out.println(v.size());
        System.out.println(v.capacity());
        System.out.println(v);
        System.out.println("last element is : " + v.lastElement());
        v.removeIf(n -> n % 2 != 0);
        System.out.println(v);
        v.add(55);

        System.out.println(v);
        v.removeIf(n->n==55);
        System.out.println("after remove elem 55 " + v);
        int x=v.indexOf(22);
        System.out.println("index of 22 is : " +x);
        int y=v.lastIndexOf(22);
        System.out.println("last index of 22 is : " +y);
        Vector<Integer> v1 = new Vector<>();
        v1.add(22);
        v.removeAll(v1);
        System.out.println(v);
        v.addAll(v1);
        System.out.println(v);


    }
}

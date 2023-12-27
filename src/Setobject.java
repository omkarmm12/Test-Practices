import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

    class SetDemo {
        public static void main(String args[]) {
            Set<String> set=new HashSet();
            set.add("nayak");
            set.add("nayak");
            set.forEach(obj -> System.out.println(obj+" "+obj.hashCode()));

            Integer[] A = {22, 45, 33, 66, 55, 34};
            Integer[] B = {33, 83, 45, 3, 12, 55};
            Set<Integer> set1 = new HashSet<Integer>();
            set1.addAll(Arrays.asList(A));
            Set<Integer> set2 = new HashSet<Integer>();
            set2.addAll(Arrays.asList(B));

            // Finding Union of set1 and set2
            Set<Integer> union_data = new HashSet<Integer>(set1);
            union_data.addAll(set2);
            System.out.print("Union of set1 and set2 is:");
            System.out.println(union_data);

            // Finding Intersection of set1 and set2
            Set<Integer> intersection_data = new HashSet<Integer>(set1);
            intersection_data.retainAll(set2);
            System.out.print("Intersection of set1 and set2 is:");
            System.out.println(intersection_data);

            // Finding Difference of set1 and set2
            Set<Integer> difference_data = new HashSet<Integer>(set2);
            difference_data.removeAll(set1);
            System.out.print("Difference of set2 and set1 is:");
            System.out.println(difference_data);
        }
    }




import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortArraylist {
    public static void main(String[]args){
        List<Integer>numbers=new ArrayList<>(Arrays.asList(3,5,3,4,33,2,4,5,5,6,6,44));
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);
        List<String> names=new ArrayList<>(Arrays.asList("nayak","kumar","bar","amar","Raj","yadavs"));
        System.out.println(names);
        Collections.sort(names);
        System.out.println(names);


    }
}

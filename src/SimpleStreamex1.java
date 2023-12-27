
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class SimpleStreamex1 {
    public static void main(String []args){

        String[] ar = new String[] { "a1", "b1", "c1", "d1" };
        Stream<String>stream= Arrays.stream(ar);//convert arrays to stream
        stream.forEach(System.out::println);
        List<String> strings= Arrays.asList("java","python","ruby","c++");
        Optional<String> optional=Optional.ofNullable(strings.get(2));
       if (optional.isPresent()){
           System.out.println(optional.get());
       }else {
        System.out.println("null");
        }
       System.out.println("for");

        for (String s:strings)
        {System.out.println(s);}

       System.out.println("forEach");

       strings.forEach(System.out::println);

        System.out.println("lambda Expression");
        strings.forEach(s -> System.out.println(s));
        System.out.println("Empty Stream");

       }




    }


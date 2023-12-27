import java.util.*;
import java.util.stream.Collectors;

public class StreamClassEx1 {
    int a=3;
    String name="name";
    public static void  main(String[]args){
        List<Integer>numbers= Arrays.asList(5,7,9,2,4,6,8,10,4,8,2);

        //filter,sorting,forEach=applies given action to each elm in stream
       List evennum=  numbers.stream()
                .filter(n->n%2==0)
                 .sorted()
                 .toList();
        System.out.println(evennum);

         //sort,collect,map=transform each elm to stream using function,forEach
         System.out.println("from map");
       List map=  numbers.stream()
                 .sorted()
                 .map(n -> n + n)
                 .toList();
        System.out.println(map);

        System.out.println("from collect");
        Set<Integer>collect= numbers.stream().collect(Collectors.toSet());
        System.out.println(collect);

        //distinct=remove duplicates
        System.out.println("from distinct");
        List unique= numbers.stream()
                 .distinct()
                 .toList();
         System.out.println(unique);

         numbers.stream().forEach(System.out::println); //it's method reference.println refers method of class PrintStream it's instance System.out

        //reduce=,combine elm into single result
        //use for sum,max,min,concat of elm in stream
        System.out.println("from reduce1 find max");
       Optional<Integer>max= Optional.ofNullable(numbers.stream().reduce(Integer::max).orElse(null));
       System.out.println("max num in list : "+max); //Integer::max= method reference,refer max method of Integer class

        System.out.println("from max find max");
        Optional<Integer>maxnum= Optional.ofNullable(numbers.stream().max((a,b)->a.compareTo(b)).orElse(0));
        System.out.println("max num in list : "+maxnum);


        System.out.println("from reduce2");
       int sum= numbers.stream()
                       .reduce(0,(a,b)->(a+b)); // identity handle empty stream
       System.out.println("sum of numbers of list : "+sum);

        System.out.println("from flatmap");
        List<List<Integer>>nestedlist=Arrays.asList(Arrays.asList(1,2,3,4),Arrays.asList(5,6,7,8),Arrays.asList(9,0));
      List<Integer> nestedstream= nestedlist.stream().flatMap(list->list.stream()).toList();
      System.out.println(nestedstream);

       System.out.println("from reduce3");
       List<String> words=Arrays.asList("HELLO","HI","WORLD","STREAM");
      String concat= words.stream()
                          .reduce("->",(a,b)->a +" "+b);//fist argument " " for initial value if stream empty
      System.out.println("concatenated string :"+concat);


      //find-first,find-last
      System.out.println("from findFirst");
     Optional<String>fist= Optional.ofNullable(words.stream().findFirst().orElse(null));
     System.out.println(fist);//Optional.ofNullable is method for avoid null pointer exception


        // skip=skip given initial num limit=set max size of stream
        System.out.println("from skip and limit");
     List<Integer> skiplimit= numbers.stream()
                                     .skip(2)
                                     .limit(8).toList();
     System.out.println(skiplimit);

     System.out.println("form int to double");
    List inttodouble= numbers.stream()
             .map(integer->Double.valueOf(integer)).toList();
     System.out.println(inttodouble);

    System.out.println("sum of even");
    int sumofeven= numbers.stream()
             .filter(n->n%2==0).mapToInt(n->n.intValue()).sum();//intValue() change Integer object to int value
    System.out.println(sumofeven);

        System.out.println("sum of even by reduce");
        int sumofevenreduce= numbers.stream()
                .filter(n->n%2==0).reduce(0,(a,b)->(a+b));//intValue() change Integer object to int value
        System.out.println(sumofevenreduce);

     words.stream()
             .map(n->n.toLowerCase()).forEach(System.out::println);

     System.out.println("count no.of strings start with letter");
     String letter="H";
    long count= words.stream().filter(w->w.startsWith(letter)).count();
    System.out.println(count);


    System.out.println("find 2nd largestnumber");//we may use custom sorted((a,b)->Integer.compare(b,a))
   Optional<Integer> secondlargestnum= Optional.ofNullable(numbers.stream()
                                               .sorted(Comparator.reverseOrder())
                                               .skip(1)
                                               .findFirst()
                                               .orElse(null));
          System.out.println(secondlargestnum);

    }

}

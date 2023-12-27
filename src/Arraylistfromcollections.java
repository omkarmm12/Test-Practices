//mostly use for storing and accessing data
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.ListIterator;

public class Arraylistfromcollections {
    public static void main(String []args){
        List<String> companieslist1=new ArrayList<>();
        System.out.println(companieslist1.isEmpty());
        companieslist1.add("Google");
        companieslist1.add("Apple");
        companieslist1.add("MassMutual");
        companieslist1.add("Microsoft");
        System.out.println(companieslist1);

        Collections.sort(companieslist1);
        System.out.println(companieslist1);

        System.out.println(companieslist1.size());

        List<String> companieslist2=new ArrayList<>();
        companieslist2.addAll(companieslist1);
        companieslist2.add("Android");
        companieslist2.add("Tesla");
        System.out.println(companieslist2);

        List<String> companieslist3=new ArrayList<>(companieslist2);
        companieslist3.add("Samsung");
        System.out.println(companieslist3.get(3));
        System.out.println(companieslist3);
        companieslist3.set(2,"Facebook");
        companieslist3.add(2,"Microsoft");
        System.out.println("Here the top " +companieslist3.size() + " companies");
        System.out.println(companieslist3);
        // get method usage
        String Top1=companieslist3.get(0);
        String Top2=companieslist3.get(1);
        String Last=companieslist3.get(companieslist3.size()-1);
        System.out.println(Top1 +" is top1 company");
        System.out.println(Top2 +" is top2 company");
       System.out.println(Last +" is Last company in the list");
       System.out.println(companieslist3);
        companieslist3.removeAll(companieslist1);
        System.out.println("after removed list1 "  +companieslist3);
        List<String> list1=new ArrayList<>(Arrays.asList("Tata","Hp","Lava","Tata","Lava"));
        System.out.println(list1);
       int i=list1.lastIndexOf("Lava");
       System.out.println("The last index of Lava is " +i);
        List<Integer> number=new ArrayList<>(Arrays.asList(1,2,3,55,34,33,12,32,4,5,6,66));
        System.out.println(number);
        number.removeIf(n-> n%2!=0);//
        System.out.println(number);


        List<String> favoritecompanies=new ArrayList<>(Arrays.asList("Apple","Google","Microsoft"));
        companieslist3.addAll(favoritecompanies);
        System.out.println(companieslist3);

        System.out.println(companieslist3);
        List<Integer> sublistinnumbers=new ArrayList<>(number.subList(3,7));
        System.out.println(sublistinnumbers);
        System.out.println(companieslist3);

        companieslist3.removeIf(name->name.startsWith("A"));
        System.out.println(companieslist3);
        companieslist3.retainAll(Collections.singleton("Apple"));
        System.out.println(companieslist3);
        List<Integer> numbers=new ArrayList<>(Arrays.asList(1,2,3,55,34,33,12,32,4,5,6,66));
        System.out.println("for loop printing elm by position" );
        for(int j=0;j<numbers.size();j++){
            System.out.println(numbers.get(j));
        }
        System.out.println("iteration is completed");
        ListIterator<Integer> numb = numbers.listIterator();
        while (numb.hasPrevious()) {
            Integer n1 = numb.previous();
            System.out.println(n1);
        }
        System.out.println("backward iteration is completed");
        while(numb.hasNext()){
            int n2=numb.next();
            System.out.println(n2);
        }
        List<String>companiesC=new ArrayList<>();
        companiesC.add("Google");
        companiesC.add("Apple mobile");
        companiesC.add("MassMutual");
        companiesC.add("Microsoft");
        // compare comp1 and comC
        List<String>comparing=new ArrayList<>();
        for (String s:companieslist1)
        comparing.add(companiesC.contains(s) ? "Yes":"No");
        System.out.println(comparing);

        }

    }


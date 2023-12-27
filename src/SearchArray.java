import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchArray {
    public static void main(String[]args){
        ArrayList<Integer>num=new ArrayList<>(Arrays.asList(3,6,7,8,6,7,66,5,1,2,345,6,798,765,4,3));
        System.out.println(num);
        boolean bs=num.contains(2);
        System.out.println(bs);
        int place=num.indexOf(2);
        if(place==-1) {
            System.out.println("2 is not available");
        }
        else{
            System.out.println("2 is found on index of :" +place);
        } //sub list creation
        List sub=num.subList(0,3);
        for(int i=0;i<sub.size();i++) {
            System.out.println(sub.get(i));
        }
    }
}

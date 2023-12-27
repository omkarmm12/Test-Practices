

public class Arraysexample {
    public static void main(String[]args){

        String[] st=new String[2];
        st[1]=new String("nayak");
        for(String i:st) {
            System.out.println(i);
        }

        int[] num=new int[9];
        num[0]=20;
        num[3]=10;
        num[5]=22;

        for(int i:num) {
          System.out.println(i);
        }
        System.out.println("fist loop completed");
        for(int i=0;i<num.length;i++){
          System.out.println(num[i]);
        }

    }
}

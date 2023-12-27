import java.util.Stack;

public class StackExample {
    public static void main(String[]args){
        Stack st=new Stack();
        System.out.println(st.capacity());
        System.out.println("stack is empty now.." +st.isEmpty());
        st.add(66);
        st.push(44);
        st.push("nayak");
        st.push("nay");
        st.add(66);
        st.push(44);
        st.add("nayak");
        st.push("nay");
        st.add("kumar");
        st.add("kumar");
        st.push("nay");
        st.add("kumar");
        System.out.println("afer push some elm " +st);
        System.out.println(st.pop());
        boolean x=st.contains("nayak");
        System.out.println("is stack contains name as nayak  " +x);
        st.pop();
        System.out.println("after pop one time " +st);
        System.out.println(st.peek());
        System.out.println(st.size());
        System.out.println(st.capacity());
    }
}

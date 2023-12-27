import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingDeque;

class Book {
    int id;
    String name,author;
    public Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }
}

class ArrayDequebook{
    public static void main(String [] args){
        //Deque<String>dq=new ArrayDeque<>();
        Deque<Book>dq=new LinkedBlockingDeque<>();
        Book b1=new Book(22,"Book1","Author1");
        Book b3=new Book(44,"Book3","Author3");
        Book b2=new Book(33,"Book2","Author2");
        Book b0=new Book(0,"Book0","Author0");
        dq.add(b1);
        dq.add(b2);
        dq.add(b3);
        dq.add(b0);
        for (Book b:dq) {
            System.out.println(b.id+" "+b.name+" "+b.author);

        }

    }

}



import java.util.Objects;
import java.util.Scanner;
//public interface Greetingservice {
//    public void greet(String name);

class InglishGreetingservice{
    public void greet(String name){
        if(Objects.equals(name, "nayak")){
            System.out.println("it is nayak");
        }
        System.out.println("hello"+" "+name);
        System.out.println("you are 20 years old");
    }
}
class Main1 {
    public static void main(String[] args) {
        InglishGreetingservice inglishGreetingservice=new InglishGreetingservice();
       Scanner s=new Scanner(System.in);
        System.out.println("Enter name");
       String name=s.nextLine();
        inglishGreetingservice.greet(name);


    }
}

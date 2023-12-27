abstract class Bike {
  abstract void run();
    void starting(){
       System.out.println("Bike is starting");
    }
}
class Honda extends Bike{
    void run(){
        System.out.println("this is Honda Bike");
    }
}
class TestAbstraction{
    public static void main(String[]args){
        Honda h=new Honda();
        h.run();
        h.starting();
        }
    }


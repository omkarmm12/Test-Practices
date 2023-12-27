
class Addition{

    public int add(int a,int b)         {return a+b;}

    public int add(int a,int b,int c)   {return a+b+c;}

    public double add(double a,double b) {return a+b;}
        }

public class Compiletimepolymorphism {
    public static void main(String[]args){
        Addition a=new Addition();
       System.out.println(a.add(7,7));
        System.out.println(a.add(7,7,7));
        System.out.println(a.add(7.5,6.5));
    }
}

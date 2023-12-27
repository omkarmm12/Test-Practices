class Grandfather{
    public void Grandfatherinfo(){
        System.out.println("i am Grandfather");
    }
}
class Father extends Grandfather{
    public void fatherinfo(){
       System.out.println("i am Father");
    }
        }
        class Son extends Father{
    void soninfo(){
        System.out.println("i am Son");
    }
        }
        class Doughter extends Father{
         public void Doughterinfo(){
        System.out.println("i am Doughter ");

         }
        }

public class Inheritance {
    public static void main(String[] arsgs){
        Doughter d=new Doughter();
        Son s=new Son();
        s.soninfo();
        s.fatherinfo();
        s.Grandfatherinfo();
        d.Doughterinfo();
        d.fatherinfo();
        d.Grandfatherinfo();


    }
}

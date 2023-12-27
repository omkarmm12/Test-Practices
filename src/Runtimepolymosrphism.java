

class Bike1 {
    void maileage(){
        System.out.println("Bike will give maileage");
    }
}
class HFDelux extends Bike1{
    void maileage(){
        System.out.println("HFDelux Bike will give 60km to 70km maileage");
    }
}
class Bullet extends Bike1{
    void maileage(){
        System.out.println("Bullet Bike will give 30km to 35km maileage");

    }
}

public class Runtimepolymosrphism {
    public static void main(String[] args){
        Bike1 B=new Bike1();
        HFDelux h=new HFDelux();
        Bullet b=new Bullet();
        B.maileage();
        h.maileage();
        b.maileage();
    }

}

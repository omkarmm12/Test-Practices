import java.util.ArrayList;
class User1{
     String name;
     int id;
    public User1(String newname,int newid){
        this.name=newname;
        this.id=newid;
    }
    public String getName(){
        return name;

    }
    public int getId(){
        return id;
    }
}

public class ExampleforConstructor {
    public static void main(String [] args) {
        ArrayList<User1> u = new ArrayList<>();
      u.add(new User1("nayak",01));
      u.add(new User1("kumar",02));
      u.forEach(ur->{System.out.println("Name : "+ur.getName() +"ID :" +ur.getId());});

    }
}

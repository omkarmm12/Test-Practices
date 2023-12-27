class User{
    private String name;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}
public class Exampleget {
    public static void main(String[] args){

        User s=new User();
        s.setName("omkar");
        System.out.println(s.getName());
    }
}

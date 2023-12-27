class Account {
    private long acc_no;
    private String name, email;
    private float amount;

    public void setAcc_no(long acc_no){
        this.acc_no=acc_no;
    }
    public long getAcc_no(){
        return acc_no;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getEmail(){
        return email;
    }
    public void setAmount(long amount){
        this.amount=amount;
    }
    public float getAmount(){
        return amount;
    }
}

    public class TestEncapsulation {
        public static void main(String[] args) {

            Account ac = new Account();
            ac.setAcc_no(999888777);
            ac.setName("Nayak");
            ac.setEmail("degavath@gamil.com");
            ac.setAmount(60000);
            System.out.println("Account NO:" +ac.getAcc_no());
            System.out.println(" Name: " +ac.getName());
            System.out.println(" Email: " +ac.getEmail() );
            System.out.println( " Amount: "+ ac.getAmount());

        }
    }

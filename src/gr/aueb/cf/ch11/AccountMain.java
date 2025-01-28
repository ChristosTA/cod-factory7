package gr.aueb.cf.ch11;

public class AccountMain {

    public static void main(String[] args) {
        Account christos = new Account(1,"GR31414","Christos","Tartari","T.",200);

        try {
            christos.deposit(500);
            System.out.println("Successfully deposit");
            System.out.println(christos.getBalance());

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

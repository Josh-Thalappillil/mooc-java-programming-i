
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        Account account = new Account("Josh's account", 100.00);
        
        account.deposit(20.0);
        
        System.out.println(account);
    }
}

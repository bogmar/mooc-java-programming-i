
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account accountOfMatt = new Account("Matthews account", 1000);
        Account accountOfBogdan = new Account("My account", 0);
        
        accountOfMatt.withdrawal(100.0);
        accountOfBogdan.deposit(100.0);
        
        System.out.println(accountOfMatt);
        System.out.println(accountOfBogdan);
    }
}

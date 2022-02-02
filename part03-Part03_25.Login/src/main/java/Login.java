
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean success = false;
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        
        if (username.equals("alex")) {
            if (password.equals("sunshine")) {
                success = true;
            }
        }
        if (username.equals("emma")) {
            if (password.equals("haskell")) {
                success = true;
            }
        }
        
        if (success == true) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}

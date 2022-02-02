
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ageOfTheOldest = -1;
        String nameOfTheOldest = "";
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");
            if (ageOfTheOldest < Integer.valueOf(parts[1])) {
                ageOfTheOldest = Integer.valueOf(parts[1]);
                nameOfTheOldest = parts[0];
            }
        }
        
        System.out.println("Name of the oldest: " + nameOfTheOldest);
    }
}

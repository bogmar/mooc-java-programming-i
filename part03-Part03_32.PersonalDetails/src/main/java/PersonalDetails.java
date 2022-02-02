
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfYears = 0;
        int sumOfYears = 0;
        String longestName = "";
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            
            String[] parts = input.split(",");
            if (longestName.length() < parts[0].length()) {
                longestName = parts[0];
            }
            countOfYears++;
            sumOfYears += Integer.valueOf(parts[1]);
        }
        
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (double)sumOfYears / countOfYears);
    }
}

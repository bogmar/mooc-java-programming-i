
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
                
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int numbersCount = 0;
        int evenNumbersCount = 0;
        int oddNumbersCount = 0;
        
        System.out.println("Give numbers:");
        
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == -1) {
                System.out.println("Thx! Bye!");
                break;
            }
            
            if (number % 2 == 0) {
                evenNumbersCount++;
            } else {
                oddNumbersCount++;
            }
            
            sum += number;
            numbersCount++;
        }
        
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numbersCount);
        System.out.println("Average: " + 1.0 * sum / numbersCount);
        System.out.println("Even: " + evenNumbersCount);
        System.out.println("Odd: " + oddNumbersCount);
    }
}

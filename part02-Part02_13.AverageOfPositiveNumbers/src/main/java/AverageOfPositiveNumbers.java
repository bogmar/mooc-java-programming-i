
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positiveNumbersCount = 0;
        int sumOfPositiveNumbers = 0;
        
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == 0) {
                break;
            }
            
            if (number > 0) {
                positiveNumbersCount = positiveNumbersCount + 1;
                sumOfPositiveNumbers = sumOfPositiveNumbers + number;
            }
        }
        
        if (positiveNumbersCount > 0) {
            System.out.println(1.0 * sumOfPositiveNumbers / positiveNumbersCount);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}

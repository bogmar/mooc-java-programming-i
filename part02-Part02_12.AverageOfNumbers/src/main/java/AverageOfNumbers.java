
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbersCount = 0;
        int sum = 0;
        
        while (true) {
            System.out.println("Give a number: ");
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == 0) {
                break;
            }
            
            numbersCount = numbersCount + 1;
            sum = sum + number;
        }
        
        System.out.println("Average of the numbers: " + (float)sum / numbersCount);
    }
}

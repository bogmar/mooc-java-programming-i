
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Which file should have it's contents printed?");
        String choice = scanner.nextLine();
        
        try (Scanner reader = new Scanner(Paths.get(choice))) {
            
            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error reading from the specified file!");
        }
    }
}

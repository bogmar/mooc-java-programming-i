
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> archives = new ArrayList<>();
        
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.isEmpty()) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            
            Item archive = new Item(identifier, name);
            if (!(archives.contains(archive))) {
                archives.add(new Item(identifier, name));
            }
        }
        
        System.out.println("==Items==");
        for (Item element : archives) {
            System.out.println(element.getIdentifier() + ": " 
                    + element.getName());
        }
    }
}

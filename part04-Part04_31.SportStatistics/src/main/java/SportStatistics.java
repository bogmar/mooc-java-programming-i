
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Teams> teams = new ArrayList<>();

        System.out.println("File:");
        String file = scan.nextLine();
        
        try (Scanner fileRead = new Scanner(Paths.get(file))) {
            
            while (fileRead.hasNextLine()) {
                String row = fileRead.nextLine();
                
                String[] parts = row.split(",");
                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                int homeTeamPoints = Integer.valueOf(parts[2]);
                int visitingTeamPoints = Integer.valueOf(parts[3]);
                
                
            }
        } catch (Exception ex) {
            System.out.println("Error reading file.");
        }
    }

}

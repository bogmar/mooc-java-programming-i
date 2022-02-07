/**
 *
 * @author bogdan
 */
public class Teams {
    
    private String name;
    private int playedGames;
    private int wins;
    
    public Teams(String name) {
        this.name = name;
        this.playedGames = 0;
        this.wins = 0;
    }
    
    public void addWin() {
        this.playedGames++;
        this.wins++;
    }
    
    public void addLose() {
        this.playedGames++;
    }
    
    
}

/**
 *
 * @author bogdan
 */
public class Item {
    private String identifier;
    private String name;
    
    public Item(String ID, String name) {
        this.identifier = ID;
        this.name = name;
    }
    
    public String getIdentifier() {
        return this.identifier;
    }
    
    public String getName() {
        return this.name;
    }
    
    @Override
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        
        if (this.getClass() != compared.getClass()) {
            return false;
        }
        
        Item comparedArchive = (Item) compared;
        
        return this.identifier.equals(comparedArchive.identifier);
    }
}

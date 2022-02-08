/**
 *
 * @author bogdan
 */
public class Book {
    
    private String author;
    private String title;
    private int pages;
    
    public Book(String author, String name, int pages) {
        this.author = author;
        this.title = name;
        this.pages = pages;
    }
    
    public String getAuthor() {
        return this.author;
    }
    
    public String getName() {
        return this.title;
    }
    
    public int getPages() {
        return this.pages;
    }
    
    @Override
    public String toString() {
        return this.getAuthor() + ", " + this.getName() + ", " + this.getPages() + " pages";
    }
}

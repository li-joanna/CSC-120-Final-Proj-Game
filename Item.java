/**
 * Represents items which a player can interact with and use 
 */
public class Item {
    private String name;
    private String description;
    //boolean consumable;
    private boolean consumed;

    /** 
     * Constructs an Item
     */
    public Item(String name, String description, boolean consumable, boolean consumed) { 
        this.name = name; 
        this.description = description; 
        //this.consumable = consumable; 
    }

    /**
     * Returns the description of an Item
     * @return String description of an Item
     */
    public String getDescription() {
        return description; 
    }

    /**
     * Returns boolean showing if an item has been consumed or not
     * @return boolean showing if an item has been consumed or not
     */
    public boolean getConsumed() { 
        return consumed; 
    }

    /** 
     * Overrides toString method for Items so that it returns the description of an Item 
     */
    public String toString() {
        return description; 
    }

    /**
     * Main method for testing 
     * @param args Array for command line arguments which is not currently being used  
     */
    public static void main(String[] args) {
        
    }
}

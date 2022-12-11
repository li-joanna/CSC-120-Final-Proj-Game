import java.util.*;
/**
 * Represent rooms for the Player to explore
 */
public class Room {
    private String name; 
    private String descrip; 
    private ArrayList<Item> roomInventory = new ArrayList<Item>();
    
    public static enum Direction { //Source [4]
        NORTH, SOUTH, EAST, WEST;
     }
    private Map<Direction, Room> exits; 

    /*Constructor for Rooms */
    public Room(String name, String descrip) {
        this.name = name; 
        this.descrip = descrip; 
    }

    /**
     * Returns the name of a Room
     * @return String name of a Room
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the description of a Room
     * @return String description of a Room
     */
    public String getDescrip() {
        return descrip; 
    }

    /**
     * Returns the exits map of a Room
     * @return Map of exits for  a Room
     */
    public Map<Direction, Room> getExits() {
        return exits; 
    }

    
    /* Adds exits NEEDS REWRITE*/
    public void addRoomExit (Direction d, Room connectedRoom) {
        this.exits.put(d, connectedRoom); 
    }
    
    /**
     * Sets the name of a Room
     * @param new String name of a Room
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the description of a Room
     * @param new String description of a Room
     */
    public void setDescrip(String descrip) {
        this.descrip = descrip; 
    }

    /**
     * Prints the location of the player and a description of the room 
     */
    public void introduceRoom() { 
        System.out.println("Current Location:" + "\n" + this.getDescrip());
    }

    /**
     * Main method for testing 
     * @param args Array for command line arguments which is not currently being used  
     */
    public static void main(String[] args) {

    }
}


import java.util.Hashtable;

/**
 * This is the library clas
 * 
 * @author Ada Li
 * @since October 24, 2024
 */
public class Library extends Building {
  // Attributes
  private Hashtable<String, Boolean> collection;

  /**
   * Library constructor
   * 
   * @param name
   * @param address
   * @param nFloors
   */
  public Library(String name, String address, int nFloors) {
    super(name, address, nFloors);
    this.collection = new Hashtable<String, Boolean>();
    System.out.println("You have built a library: 📖");
  }

  /**
   * Function to add title
   * 
   * @param title
   */
  public void addTitle(String title) {
    if (collection.contains(title)) {
      System.out.println(collection);
      System.out.println(title);
      throw new RuntimeException("Can't add that title");
    } else {
      collection.put(title, true);
    }
  }

  /**
   * Function to remove title from library
   * 
   * @param title
   * @return title name
   */
  public String removeTitle(String title) {
    if (collection.contains(title)) {
      collection.remove(title, true);
      return title;
    } else {
      collection.remove(title, true);
      throw new RuntimeException("Can't remove that title");
    }
  } // return the title that we removed

  /**
   * Function to checkOut title
   * 
   * @param title
   */
  public void checkOut(String title) {
    if (isAvailable(title)) {
      System.out.println(title + " is available.");
      collection.replace(title, true, false);
      System.out.println(title + " is checked out.");
    } else {
      throw new RuntimeException("Can't check out " + title);
    }
  }

  /**
   * Function to return title
   * 
   * @param title
   */
  public void returnBook(String title) {
    try {
      addTitle(title);
      collection.replace(title, false, true);
      System.out.println(title + " is returned.");
    } catch (Exception e) {
      throw new RuntimeException("Can't return " + title);
    }

  }

  /**
   * Function to check if the title is in the library
   * 
   * @param title
   * @return boolean for containing the title in the library
   */
  public boolean containsTitle(String title) {
    boolean containsTitle = false;
    if (collection.containsKey(title)) {
      containsTitle = true;
    }
    return containsTitle;
  }

  /**
   * Function checks if the title is available
   * 
   * @param title
   * @return boolean variable availalbe
   */
  public boolean isAvailable(String title) {
    boolean available = false;
    if (collection.containsKey(title) && collection.get(title).equals(true)) {
      available = true;
    } else {
      System.out.println("Not available.");
    }

    return available;
  }

  // returns true if the title is currently available, false otherwise
  /**
   * Function prints out collection
   */
  public void printCollection() {
    System.out.println(collection.toString());
  } // prints out the entire collection in an easy-to-read way (including checkout
    // status)
  /* Main function for testing */

  public static void main(String[] args) {
    Library neilsonLibrary = new Library("Neilson Library", "7 Neilson Drive, Northampton, MA 01063", 4);
    System.out.println(neilsonLibrary.toString());
    neilsonLibrary.addTitle("The Art of War");
    neilsonLibrary.addTitle("Astronomy");
    System.out.println(neilsonLibrary.isAvailable("Astronomy"));
    System.out.println(neilsonLibrary.containsTitle("Astronomy"));
    neilsonLibrary.checkOut("Astronomy");
    neilsonLibrary.printCollection();
  }

}
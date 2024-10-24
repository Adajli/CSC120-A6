/* This is a stub for the Library class */

import java.util.ArrayList;
import java.util.Hashtable;
/** 
 * This is the library clas
 * @author Ada Li
 * @since October 24, 2024
*/
public class Library extends Building{
    //Attributes
    private Hashtable<String, Boolean> collection;
    /**
     * Library constructor
     * @param name
     * @param address
     * @param nFloors
     */
    public Library(String name, String address, int nFloors) {
      super(name, address, nFloors);
      this.collection = new Hashtable<String,Boolean>();
      System.out.println("You have built a library: 📖");
    }
    /**
     * Function to add title
     * @param title
     */
    public void addTitle(String title){
      if(collection.contains(title)){
        throw new RuntimeException("Can't add that title");
      }else{
        collection.put(title,true);
      }
    }
    /**
     * Function to remove title from library
     * @param title
     * @return title name
     */
    public String removeTitle(String title){
      if(collection.contains(title)){
        collection.remove(title,true);
        return title;
      }else{
        collection.remove(title,false);
        throw new RuntimeException("Can't remove that title");
      }
    } // return the title that we removed
    /**
     * Function to checkOut title
     * @param title
     */
    public void checkOut(String title){
      removeTitle(title);
    }
    /**
     * Function to return title
     * @param title
     */
    public void returnBook(String title){
      addTitle(title);
    }
    /*Main function for testing */
    public static void main(String[] args) {
      Library neilsonLibrary =new Library("Neilson Library" ,"7 Neilson Drive, Northampton, MA 01063",4);
      neilsonLibrary.addTitle("The Art of War");
    }
  
  }
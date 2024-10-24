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
        throw new RuntimeException("Can't add that person");
      }else{
        collection.put(title,true);
      }
    }
    public String removeTitle(String title){
      if(collection.contains(title)){
        collection.remove(name);
        return title;
      }else{
        throw new RuntimeException("Can't remove that person");
      }
    } // return the title that we removed
    public static void main(String[] args) {
      Library neilsonLibrary =new Library("Neilson Library" ,"7 Neilson Drive, Northampton, MA 01063","4");
    }
  
  }
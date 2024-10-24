/* This is the full House class */

import java.util.ArrayList;
/** 
 * This is the house clas
 * @author Ada Li
 * @since October 24, 2024
*/
public class House extends Building{
  //House attributes
  private ArrayList<String> residents; // The <String> tells Java what kind of data we plan to store IN the ArrayList
  private boolean hasDiningRoom;

  /**
   * House constructor
   * @param name
   * @param address
   * @param nFloors
   * @param hasDiningRoom
   */
  public House(String name, String address, int nFloors,boolean hasDiningRoom) {
    this.residents = new ArrayList<String>();
    super(name, address,nFloors);
    this.hasDiningRoom = hasDiningRoom;
    System.out.println("You have built a house: 🏠");
  }
  /**
   * Accessor to check if the house has dining room
   * @return hasDiningRoom
   */
  public boolean hasDiningRoom(){
    return hasDiningRoom;
  }
  /**
   * Accessor for number of residents of house
   * @return number of residents
   */
  public int nResidents(){
    return residents.size();
  }
  /**
   * Move in function
   * @param name
   */
  public void moveIn(String name){
    if(residents.contains(name)){
      throw new RuntimeException("Can't add that person");
    }else{
      residents.add(name);
    }
  }
  /**
   * Move out function
   * @param name
   */
  public void moveOut(String name){
    if(residents.contains(name)){
      residents.remove(name);
    }else{
      throw new RuntimeException("Can't remove that person");
    }
  }
  /**
   * Function to check if the person is the resident of house
   * @param person
   * @return isResident
   */
  public boolean isResident(String person){
    boolean isResident = false;
    if(residents.contains(person)){
      isResident = true;
    }
    return isResident;
  }  
  public static void main(String[] args) {
    House myHome = new House("My Home", "10 Meadowview Road Basking Ridge, NJ", 2,true);
    myHome.moveIn("Ada Li");
    myHome.moveIn("Hong Li");
    myHome.moveIn("Jin Chen");
    System.out.println(myHome.isResident("Ada Li"));
    System.out.println(myHome.nResidents()); 
  }

}
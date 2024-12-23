/* This is the full House class */

import java.util.ArrayList;

/**
 * This is the house clas
 * 
 * @author Ada Li
 * @since October 24, 2024
 */
public class House extends Building {
  // House attributes
  private ArrayList<String> residents; // The <String> tells Java what kind of data we plan to store IN the ArrayList
  private boolean hasDiningRoom;

  /**
   * House constructor
   * 
   * @param name
   * @param address
   * @param nFloors
   * @param hasDiningRoom
   */
  public House(String name, String address, int nFloors, boolean hasDiningRoom) {
    super(name, address, nFloors);
    this.residents = new ArrayList<String>();
    this.hasDiningRoom = hasDiningRoom;
    System.out.println("You have built a house: 🏠");
  }

  /**
   * Accessor to check if the house has dining room
   * 
   * @return hasDiningRoom
   */
  public boolean hasDiningRoom() {
    return hasDiningRoom;
  }

  /**
   * Accessor for number of residents of house
   * 
   * @return number of residents
   */
  public int nResidents() {
    return residents.size();
  }

  /**
   * Move in function
   * 
   * @param name
   */
  public void moveIn(String name) {
    if (residents.contains(name)) {
      throw new RuntimeException("Can't add that person");
    } else {
      residents.add(name);
    }
  }

  /**
   * Move out function
   * 
   * @param name
   * @return person moved out
   */
  public String moveOut(String name) {
    if (isResident(name)) {
      residents.remove(name);
      return name + "moved out.";
    } else {
      throw new RuntimeException("Can't remove that person");
    }
  }

  /**
   * Function to check if the person is the resident of house
   * 
   * @param person
   * @return true or false based on the person's residency
   */
  public boolean isResident(String person) {
    return this.residents.contains(person);
  }

  public static void main(String[] args) {
    House myHome = new House("My Home", "10 Meadowview Road Basking Ridge, NJ", 2, true);
    myHome.moveIn("Ada Li");
    myHome.moveIn("Hong Li");
    myHome.moveIn("Jin Chen");
    myHome.moveIn("Arthur Li");
    System.out.println(myHome.isResident("Ada Li"));
    myHome.moveOut("Ada Li");
    System.out.println(myHome.hasDiningRoom());
    System.out.println(myHome.nResidents());
  }

}
/* This is a stub for the House class */

import java.util.ArrayList;

public class House extends Building{
  private ArrayList<String> residents; // The <String> tells Java what kind of data we plan to store IN the ArrayList
  private boolean hasDiningRoom;

 
  public House(boolean hasDiningRoom) {
    this.residents = new ArrayList<String>();
    super("Home", "10 Meadowview Road",2);
    residents = new ArrayList<String>();
    hasDiningRoom = true;
    System.out.println("You have built a house: 🏠");
  }
  public boolean hasDiningRoom(){
    return hasDiningRoom;
  }
  public int nResidents(){
    return residents.size();
  }
  public void moveIn(String name){
     residents.add(name);
  }

  public void moveOut(String name){
    if(residents.contains(name)){
      residents.remove(name);
    }else{
      System.err.println("Can't remove that person");
    }
  }
  public static void main(String[] args) {
    new House(true);
  }

}
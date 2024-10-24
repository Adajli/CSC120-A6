/* This is a stub for the Library class */

import java.util.Hashtable;

public class Library {
    //Attributes
    private Hashtable<String, Boolean> collection;

    public Library() {
      super();
      System.out.println("You have built a library: 📖");
    }
  
    public static void main(String[] args) {
      new Library();
    }
  
  }
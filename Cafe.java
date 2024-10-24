/* This is a stub for the Cafe class */
public class Cafe extends Building{
    //Attributes
    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory

    public Cafe(String name, String address, int nFloors,int nCoffeeOunces, int nSugarPackets, int nCreams,int nCups) {
        super(name, address, nFloors);
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
        System.out.println("You have built a cafe: ☕");
    }
    
    public static void main(String[] args) {
       Cafe brewhaven = new Cafe("Brew Haven", "10 Meadwoview Road, Basking Ridge, New Jersey", 2,30,40,20,10);
    }
    
}

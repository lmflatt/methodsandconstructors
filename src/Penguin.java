/**
 * Created by lee on 8/29/16.
 */
public class Penguin {
    private String species;
    private String[] eats;
    private boolean canFly = false;
    private int numberOfWings;

    ///// Constructors

    public Penguin() {

    }

    public Penguin(String s, String[] e, int w) {
        species = s;
        eats = e;
        numberOfWings = w;
    }

    ///// Setters
    public void setSpecies(String s) {
        species = s;
    }

    public void setEats(String[] e) {
        eats = e;
    }

    public void setNumberOfWings(int w) {
        numberOfWings = w;
    }

    ////// Getters
    public String getSpecies() {
        return species;
    }

    public String[] getEats() {
        return eats;
    }

    public int getNumberOfWings() {
        return numberOfWings;
    }

    ////// other function

    public void quack() {
        System.out.println("Quack!");
    }
}

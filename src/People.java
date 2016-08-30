/**
 * Created by lee on 8/29/16.
 */
public class People {
    private String name;
    private int age;
    private String address;
    private boolean isVegetarian = false;
    private boolean hasPet = false;



    //// Constructors

    public People() {

    }

    public People(String n, int a) {
        name = n;
        age = a;
    }

    public People(String n, int a, String pn, int pa) {
        name = n;
        age = a;
        setDog(pn, pa);
    }


    //// Setters

    public void setName(String n) {
        name = n;
    }

    public void setAge(int a) {
        age = a;
    }

    public void setAddress(String ad) {
        address = ad;
    }


    //// Getters

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public boolean getIsVegetarian() {
        return isVegetarian;
    }

    public boolean getHasPet() {
        return hasPet;
    }


    //// Pet settings

    public class Pet{
        private String name;
        private int age;

        //// Pet Constructors

        public Pet() {

        }

        public Pet(String n, int a){
            name = n;
            age = a;
        }

        //////    Irish Setters?

        public void setName(String n) {
            name = n;
        }

        public void setAge(int a) {
            age = a;
        }

        /////   Pet Getters

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }


    ///// Set pet and activate vegetarianism

    public Pet dog;

    public void setDog(String pn, int pa) {
        dog = new Pet(pn, pa);
        hasPet = true;
    }

    public void eatsVeggies() {
        isVegetarian = true;
    }
}

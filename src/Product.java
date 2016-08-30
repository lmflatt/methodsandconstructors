/**
 * Created by lee on 8/30/16.
 */
public class Product {

    private String[] products = new String[] {"Golf Balls", "Paper Clips", "Earrings", "Goldfish", "Chandeliers"};

    private String name;
    private double price;
    private int amount;
    private double productTotal;

    /////  Basic Constructor and Constructors that validate and set 2-3 properties

    public Product() {

    }

    public Product(int n, double p){
        validateProduct(n);
        validatePrice(p);
    }

    public Product(int n, double p, int amt){
        validateProduct(n);
        validatePrice(p);
        setProductTotal(amt);
    }

    //// Setters

    public void setProduct(int n) {
        validateProduct(n);
    }

    public void setPrice(double p) {
        validatePrice(p);
    }

    public void setProductTotal (int a) {
        if (a > 0) {
            amount = a;
        }

        productTotal = amount * price;
    }

    ////  Validation

    private void validateProduct (int n) {
        if (n >= 0 && n < products.length) {
            name = products[n];
        } else {
            name = products[0];
        }
    }

    private void validatePrice (double p) {

        if (p > 0) {
            price = p;
        }else {
            price = 28.45;
        }
    }

    /////  Getters.

    public double getProductTotal() {
        return productTotal;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

}

/**
 * Created by lee on 8/29/16.
 *
 * Database of purchase orders for a company that makes multiple products
 */
public class PurchaseOrders {
    private String date;
    private double tax = 1.0925;  //because Tennessee...
    private double grandTotal = 0;

    //// Constructors

    public PurchaseOrders () {

    }

    public PurchaseOrders (String d, double[] gt) {
        date = d;
        grandTotal = generateGrandTotal(gt);
        //// Moved logic that generates the grand total to its own method
    }

    //// Setters

    public void setDate (String d) {
        date = d;
    }

    public void setGrandTotal (double[] gt) {
        grandTotal = generateGrandTotal(gt);
    }


    //// Getters

    public String getDate() {
            return date;
    }

    public double getGrandTotal() {
        return grandTotal;
    }


    //// Other logic

    private double generateGrandTotal (double[] gt) {
        for (double item : gt) {
            grandTotal += item;
        }

        grandTotal = grandTotal * tax;

        return grandTotal;
    }

}

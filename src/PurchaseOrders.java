/**
 * Created by lee on 8/29/16.
 *
 * Database of purchase orders for a company that makes multiple products
 */
public class PurchaseOrders {
    String date;
    String[] products = new String[] {"Golf Balls", "Paper Clips", "Earrings", "Goldfish", "Chandeliers"};

    // I wish I could make a 2d array that includes prices, but we haven't mixed strings with numbers yet :(

    String product1;
    double product1Price;
    int product1Amt;
    double product1Total;

    String product2;
    double product2Price;
    int product2Amt;
    double product2Total;

    String product3;
    double product3Price;
    int product3Amt;
    double product3Total;

    String product4;
    double product4Price;
    int product4Amt;
    double product4Total;

    String product5;
    double product5Price;
    int product5Amt;
    double product5Total;

    double tax = 1.0925;  //because Tennessee...

    double grandTotal;
}

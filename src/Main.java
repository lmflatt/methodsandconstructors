public class Main {

    public static void main(String[] args) {

        //Categorizes classical music into info, performance properties and good recording resources

        MusicPiece piece1 = new MusicPiece();

        piece1.title = "Symphony No. 3 in Eb, \"Eroica\"";
        piece1.composer = "Ludwig van Beethoven";
        piece1.year = 1803;
        piece1.genre = "Orchestral Symphony";
        piece1.hasText = false;
        piece1.needsConductor = true;
        piece1.bestRecordings = new String[3];
        piece1.bestRecordings[0] = "Berlin Philharmonic, 1992";
        piece1.bestRecordings[1] = "Wiener Philharmoniker, 1988";
        piece1.bestRecordings[2] = "Cleveland Symphony, 2008";

        System.out.println(piece1.title + " by " + piece1.composer + ", recorded by " + piece1.bestRecordings[0]);

        //Plays a very scripted game of battleship with the ship1 object as our first game piece being destroyed

        BattleshipPlacements ship1 = new BattleshipPlacements();

        ship1.type = "Destroyer";
        ship1.position = new String[3];
        ship1.position[0] = ship1.possiblePositions[2][2];
        ship1.position[1] = ship1.possiblePositions[3][2];
        ship1.position[2] = ship1.possiblePositions[4][2];
        ship1.hitCounter = 0;
        ship1.isSunk = false;

        ship1.hitCounter++;
        System.out.println("Hit at " + ship1.position[ship1.hitCounter - 1] + ". " + ship1.hitCounter + " hit(s). Has your "
        + ship1.type + " sunk? " + ship1.isSunk);

        ship1.hitCounter++;
        System.out.println("Hit at " + ship1.position[ship1.hitCounter - 1] + ". " + ship1.hitCounter + " hit(s). Has your "
                + ship1.type + " sunk? " + ship1.isSunk);

        ship1.hitCounter++;
        ship1.isSunk = true;
        System.out.println("Hit at " + ship1.position[ship1.hitCounter - 1] + ". " + ship1.hitCounter + " hit(s). Has your "
                + ship1.type + " sunk? " + ship1.isSunk);


        // Last idea definitely went overboard (pun intended). This object will describe a type of penguin.

        Penguin penguin1 = new Penguin();
        penguin1.species = "Emperor Penguin";
        penguin1.eats = new String[]{"Fish", "Larger Fish", "Smaller Fish", "Smaller Penguins?"};
        penguin1.numberOfWings = 1;

        System.out.println("Your penguin is a(n) " + penguin1.species + ", it eats " +
        penguin1.eats[0] + ", " + penguin1.eats[1] + ", " + penguin1.eats[2] + ", and possibly "
        + penguin1.eats[3] + " He has " + penguin1.numberOfWings + " wing, because this refers to a very specific penguin who's been in an accident.");



        // Purchase order app that takes orders of multiple products and totals the costs

        PurchaseOrders order1 = new PurchaseOrders();

        order1.date = "Oct. 1, 2016";
        order1.product1 = order1.products[3];
        order1.product1Price = 5.99;
        order1.product1Amt = 4;
        order1.product1Total = ( order1.product1Price * order1.product1Amt );

        order1.product2 = order1.products[0];
        order1.product2Price = 28.45;
        order1.product2Amt = 2;
        order1.product2Total = ( order1.product2Price * order1.product2Amt );


        order1.product3 = order1.products[4];
        order1.product3Price = 1.33;
        order1.product3Amt = 11;
        order1.product3Total = ( order1.product3Price * order1.product3Amt );

        order1.grandTotal = ( order1.product1Total + order1.product2Total + order1.product3Total ) * order1.tax;

        System.out.println("On " + order1.date + ",");
        System.out.println("You ordered " + order1.product1Amt + " " + order1.product1 + " at $" + order1.product1Price + " each.");
        System.out.println("They total up to $" + order1.product1Total + ".");

        System.out.println("You ordered " + order1.product2Amt + " " + order1.product2 + " at $" + order1.product2Price + " each.");
        System.out.println("They total up to $" + order1.product2Total + ".");

        System.out.println("You ordered " + order1.product3Amt + " " + order1.product3 + " at $" + order1.product3Price + " each.");
        System.out.println("They total up to $" + order1.product3Total + ".");

        System.out.println("");
        System.out.println("After tax, your grand total amounts to " + order1.grandTotal + ".");



        ///////  Final object is a contact list instance of the "People" class.

        People person1 = new People();

        person1.name = "Dave";
        person1.age = 20;
        person1.address = "123 Maple Ln";
        person1.isVegetarian = true;
        person1.hasPet = true;
        person1.dog.name = "Fido";
        person1.dog.age = 3;

        People person2 = new People();

        person2.name = "Ann";
        person2.age = 40;
        person2.address = "222 Google Ln";
        person2.isVegetarian = false;
        person2.hasPet = false;

        System.out.println(person1.name + " is " + person1.age + ", and lives at " +
        person1.address + ". It is " + person1.isVegetarian + " that (s)he doesn't eat meat.");
        System.out.println(person1.name + " has a Dog named " + person1.dog.name + ", and he is "
        + person1.dog.age + " years old.");

        System.out.println(person2.name + " is " + person2.age + ", and lives at " +
        person2.address + ". It is " + person2.isVegetarian + " that (s)he doesn't eat meat.");

    }
}

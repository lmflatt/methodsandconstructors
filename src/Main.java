public class Main {

    public static void main(String[] args) {

        //Categorizes classical music into info, performance properties and good recording resources

        MusicPiece piece1 = new MusicPiece();

        piece1.setTitle("Symphony No. 3 in Eb, \"Eroica\"");
        piece1.setComposer("Ludwig van Beethoven");
        piece1.setYear(1803);
        piece1.setGenre("Orchestral Symphony");
        piece1.activateNeedsConductor();
        String[] best = new String[] {"Berlin Philharmonic, 1992", "Wiener Philharmoniker, 1988", "Cleveland Symphony, 2008"};
        piece1.setBestRecordings(best);

        System.out.println(piece1.getTitle() + " composed by " + piece1.getComposer() + " in " + piece1.getYear() + ", recorded by " + piece1.getBestRecordings()[0]);
        if(piece1.isNeedsConductor()) {
            System.out.println("This " + piece1.getGenre() + " piece requires a conductor for performance");
        }

        //Plays a very scripted game of battleship with the ship1 object as our first game piece being destroyed

        BattleshipPlacements ship1 = new BattleshipPlacements(3);

        String[][] gameBoard = ship1.startGame();
        String[] myPosition = new String[] {gameBoard[2][2], gameBoard[3][2], gameBoard[4][2]};

        ship1.setPosition(myPosition);

        ship1.hit();
        System.out.println("Hit at " + ship1.getPosition()[ship1.getHitCounter() - 1] + ". " + ship1.getHitCounter() + " hit(s). Has your "
        + ship1.getType() + " sunk? " + ship1.getIsSunk());

        ship1.hit();
        System.out.println("Hit at " + ship1.getPosition()[ship1.getHitCounter() - 1] + ". " + ship1.getHitCounter() + " hit(s). Has your "
                + ship1.getType() + " sunk? " + ship1.getIsSunk());

        ship1.hit();
        System.out.println("Hit at " + ship1.getPosition()[ship1.getHitCounter() - 1] + ". " + ship1.getHitCounter() + " hit(s). Has your "
                + ship1.getType() + " sunk? " + ship1.getIsSunk());
        System.out.println();


        //// RESETS GAME SO I CAN PLAY AGAIN WITH SAME OBJECT BUT CHANGE SHIP TYPES AND POSITIONS

        ship1.resetGame();

        ship1.setType(4);
        String[] myNewPosition = new String[] {gameBoard[1][1], gameBoard[1][2], gameBoard[1][3], gameBoard[1][4]};

        ship1.setPosition(myNewPosition);

        ship1.hit();
        System.out.println("Hit at " + ship1.getPosition()[ship1.getHitCounter() - 1] + ". " + ship1.getHitCounter() + " hit(s). Has your "
                + ship1.getType() + " sunk? " + ship1.getIsSunk());

        ship1.hit();
        System.out.println("Hit at " + ship1.getPosition()[ship1.getHitCounter() - 1] + ". " + ship1.getHitCounter() + " hit(s). Has your "
                + ship1.getType() + " sunk? " + ship1.getIsSunk());

        ship1.hit();
        System.out.println("Hit at " + ship1.getPosition()[ship1.getHitCounter() - 1] + ". " + ship1.getHitCounter() + " hit(s). Has your "
                + ship1.getType() + " sunk? " + ship1.getIsSunk());

        ship1.hit();
        System.out.println("Hit at " + ship1.getPosition()[ship1.getHitCounter() - 1] + ". " + ship1.getHitCounter() + " hit(s). Has your "
                + ship1.getType() + " sunk? " + ship1.getIsSunk());


        // Last idea definitely went overboard (pun intended). This object will describe a type of penguin.


        String[] food = new String[]{"Fish", "Larger Fish", "Smaller Fish", "Smaller Penguins?"};

        Penguin penguin1 = new Penguin("Emperor Penguin", food, 1);

        System.out.println("Your penguin is a(n) " + penguin1.getSpecies() + ", it eats " +
        penguin1.getEats()[0] + ", " + penguin1.getEats()[1] + ", " + penguin1.getEats()[2] + ", and possibly "
        + penguin1.getEats()[3] + " He has " + penguin1.getNumberOfWings() + " wing, because this refers to a very specific penguin who's been in an accident.");
        penguin1.quack();



        // Purchase order app that takes orders of multiple products and totals the costs

        Product product1 = new Product();
        product1.setProduct(3);
        product1.setPrice(5.99);
        product1.setProductTotal(4);

        Product product2 = new Product(0, 28.45);
        product2.setProductTotal(2);

        Product product3 = new Product(4, 1.33, 11);

        double[] totals = new double[] {product1.getProductTotal(), product2.getProductTotal(), product3.getProductTotal()};



        PurchaseOrders order1 = new PurchaseOrders("Oct. 1, 2016", totals);


        System.out.println("On " + order1.getDate() + ",");
        System.out.println("You ordered " + product1.getAmount() + " " + product1.getName() + " at $" + product1.getPrice() + " each.");
        System.out.println("They total up to $" + product1.getProductTotal() + ".");

        System.out.println("You ordered " + product2.getAmount() + " " + product2.getName() + " at $" + product2.getPrice() + " each.");
        System.out.println("They total up to $" + product2.getProductTotal() + ".");

        System.out.println("You ordered " + product3.getAmount() + " " + product3.getName() + " at $" + product3.getPrice() + " each.");
        System.out.println("They total up to $" + product3.getProductTotal() + ".");

        System.out.println("");
        System.out.println("After tax, your grand total amounts to " + order1.getGrandTotal() + ".");



        ///////  Final object is a contact list instance of the "People" class.

        People person1 = new People();

        person1.setName("Dave");
        person1.setAge(20);
        person1.setAddress("123 Maple Ln");
        person1.setDog("Fido", 3);
        person1.dog.setAge(4);    //// Just making sure the setter in dog works to reassign a value I made with constructor

        People person2 = new People("Ann", 40);

        person2.setAddress("222 Google Ln");
        person2.eatsVeggies();

        System.out.println(person1.getName() + " is " + person1.getAge() + ", and lives at " +
        person1.getAddress() + ". It is " + person1.getIsVegetarian() + " that (s)he doesn't eat meat.");
        System.out.println(person1.getName() + " has a Dog named " + person1.dog.getName() + ", and he is "
        + person1.dog.getAge() + " years old.");

        System.out.println(person2.getName() + " is " + person2.getAge() + ", and lives at " +
        person2.getAddress() + ". It is " + person2.getIsVegetarian() + " that (s)he doesn't eat meat.");

    }
}

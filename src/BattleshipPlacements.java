/**
 * Created by lee on 8/29/16.
 *
 * Sets the stage fr an exciting game of Battleship!
 */
public class BattleshipPlacements {
    private String type;
    private String[][] possiblePositions = new String[][] {
        {"A1", "A2", "A3", "A4", "A5"},
        {"B1", "B2", "B3", "B4", "B5"},
        {"C1", "C2", "C3", "C4", "C5"},
        {"D1", "D2", "D3", "D4", "D5"},
        {"E1", "E2", "E3", "E4", "E5"}

    };

    // A ships position is an array of adjacent spots taken from the grid above.

    private String[] position;
    private boolean isSunk = false;
    private int hitCounter = 0;

    //// Constructors
    public BattleshipPlacements() {

    }

    public BattleshipPlacements(int t) {
        validateShip(t);
    }

    ////  Setters

    public void setType(int t) {
        validateShip(t);
    }

    public void setPosition(String[] p) {
        position = p;
    }

    ////  Getters

    public String getType() {
        return type;
    }

    public String[] getPosition() {
        return position;
    }

    public String[][] getPossiblePositions() {
        return possiblePositions;
    }

    public int getHitCounter() {
        return hitCounter;
    }

    public boolean getIsSunk() {
        isSunk = sink();
        return isSunk;
    }

    //// Game logic

    public String[][] startGame() {
        String[][] gameBoard = getPossiblePositions();
        return gameBoard;
    }

    private void validateShip(int t) {
        if(t >= 2 && t <= 4) {
            chooseShip(t);
        }
        else {
            System.out.println("Ship value must be from 2-4");
        }
    }

    private void chooseShip(int t) {
        if(t == 2){
            type = "Safety Boat";
        }
        else if(t == 3){
            type = "Destroyer";
        }
        else {
            type = "Carrier";
        }
    }

    public void hit() {
        hitCounter++;
    }

    private boolean sink() {
        if(hitCounter >= position.length) {
            isSunk = true;
            return isSunk;
        }
        else {
            return isSunk;
        }
    }

    public void resetGame() {
        String[] refresh = new String[]{};
        position = refresh;
        type = "";
        hitCounter = 0;
        isSunk = false;
    }

}

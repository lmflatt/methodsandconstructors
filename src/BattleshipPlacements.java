/**
 * Created by lee on 8/29/16.
 *
 * Sets the stage fr an exciting game of Battleship!
 */
public class BattleshipPlacements {
    String type;
    String[][] possiblePositions = new String[][] {
        {"A1", "A2", "A3", "A4", "A5"},
        {"B1", "B2", "B3", "B4", "B5"},
        {"C1", "C2", "C3", "C4", "C5"},
        {"D1", "D2", "D3", "D4", "D5"},
        {"E1", "E2", "E3", "E4", "E5"}

    };

    // A ships position is an array of adjacent spots taken from the grid above.

    String[] position;
    boolean isSunk;
    int hitCounter;
}

import java.util.ArrayList;

public class PointCard extends Card {
//Looks to genarate a value for the card, between 2 values.

    public PointCard() {
        // Point card settings
        int minPoints = 6;
        int maxPoints = 10;

        int pointValue = Rand.randomInt(minPoints, maxPoints + 1);

        super(pointValue);
    }


    //This is being overriding something.
    @Override
    public void play(Player currentPlayer, ArrayList<Player> allPlayers) {
        currentPlayer.addPoints(super.getPointValue());

        System.out.println(currentPlayer.getName() + " played " + this);
        System.out.println(currentPlayer.getName() + " now has " + currentPlayer.getNumPoints() + " points.");
    }

    @Override
    public String toString() {
        return "Point Card { point value: " + super.getPointValue() + "}";
    }
}

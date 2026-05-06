public class PointCard extends Card {
//Looks to genarate a value for the card, between 2 values.

    public PointCard() {

        // Attack card settings
        int minPoints = 4;
        int maxPoints = 7;

        int pointValue = Rand.randomInt(minPoints, maxPoints + 1);

        super(pointValue);
    }


    //This is being overriding something.
    @Override
    public void play(Player currentPlayer) {

    }
}

import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<Card> hand;
    private int numPoints;
    private boolean isFrozen;

    public Player(String name) {
        this.name = name;
        hand = new ArrayList<Card>();
        numPoints = 5;
        isFrozen = false;
    }

    //Why is this being used and not the take turn?
    //Go over this later.
    public void playRandomCardFromHand() {

    }

    public void addCardToHand(Card card) {
        hand.add(card);
    }

    public void takeTurn() {
        if (isFrozen) {
            System.out.println("Player '" + name + "' is frozen! Skipping turn.");
            return;
        }

        // gets a random card number in players hand
        int randomCardIndex = Rand.randomInt(0, hand.size());

        // Figure out what card to play.
        Card chosenCard = hand.get(randomCardIndex);

        // Play the card.
        chosenCard.play(this);

        // discard the card that was just played
        hand.remove(randomCardIndex);

        Input.waitForUserToPressEnter("Press Enter to continue...");
    }
}

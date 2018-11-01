package CardGame;

/**
 * Created by spencer.roth on 10/31/18.
 */
public class Hand {

    private Card[] Cards;

    // Calls 'DrawCard' from 'deck' five times to populate the array 'Cards'
    public Hand(Deck deck) {
        Card1 = new Card[5];

        for (int i = 0; i < 5; i++) {
            Cards[i] = deck.DrawCard();
        }
    }

    Card getCard(int index) {
        return Cards[index];
    }

}

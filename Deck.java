package CardGame;

/**
 * Created by spencer.roth on 10/31/18.
 */
public class Deck {

    private Card[] Cards;
    //builds the deck and sets all 52 cards in order
    public Deck(){

        Cards = new Card[52];
            String suite = "";
            String value = "";

        for (int suitecount = 0; suitecount < 4; suitecount++){

            switch(suitecount){
                case 0:
                    suite = "Diamonds";
                    break;
                case 1:
                    suite = "Hearts";
                    break;

                case 2:
                    suite = "Clubs";
                    break;

                case 3:
                    suite = "Spades";
                    break;
            }

            for (int valuecount = 0; valuecount < 13; valuecount++){

                switch(valuecount){
                    case 0:
                        value = "Ace";
                        break;
                    case 1:
                        value = "2";
                        break;
                    case 2:
                        value = "3";
                        break;
                    case 3:
                        value = "4";
                        break;
                    case 4:
                        value = "5";
                        break;
                    case 5:
                        value = "6";
                        break;
                    case 6:
                        value = "7";
                        break;
                    case 7:
                        value = "8";
                        break;
                    case 8:
                        value = "9";
                        break;
                    case 9:
                        value = "10";
                        break;
                    case 10:
                        value = "Jack";
                        break;
                    case 11:
                        value = "Queen";
                        break;
                    case 12:
                        value = "King";
                        break;
                }
            }
            int index = 0;
            Cards[index] = new Card(suite, value);
            index++;
        }
    }



    //Removes the top card in the array and returns it to the user
    public Card DrawCard(){
        Card lastcard = Cards[Cards.length - 1];
        Card backupArray[] = Cards;
        Cards = new Card[Cards.length - 1];
        for(int i = 0; i < Cards.length; i++){
            Cards [i] = backupArray[i];
        }
        return lastcard;
    }

    //Shuffles the deck into a random order
    public void Shuffle(){

    }
}

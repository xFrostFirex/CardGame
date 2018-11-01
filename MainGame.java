package CardGame;

import java.util.Scanner;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by spencer.roth on 10/31/18.
 */

public class MainGame {

    public static void main(String[] args) {
        System.out.println("Hello, please enter the number of iterations you wish to see.");
        Scanner scan = new Scanner(System.in);
        int iterations = scan.nextInt();

        int count = 1, counter = 0;
        while (count <= iterations) {

            Deck deck = new Deck();
            Hand[] hand = new Hand[5];
            for (int i = 0; i < 5; i++) {
                hand[i] = deck.DrawCard();
            }
            int RoyalFlush = 0, StraightFlush = 0, Fourofakind = 0, Fullhouse = 0, Threeofakind = 0, pair = 0,
                    twopair = 0;

            String RoyalFlushHearts = { "10 Hearts", "Joker Hearts", "Queen Hearts", "King Hearts", "Ace Hearts" };
            String RoyalFlushDiamonds = { "10 Diamonds", "Joker Diamonds", "Queen Diamonds", "King Diamonds",
                    "Ace Diamonds" };
            String RoyalFlushClubs = { "10 Clubs", "Joker Clubs", "Queen Clubs", "King Clubs", "Ace Clubs" };
            String RoyalFlushSpades = { "10 Spades", "Joker Spades", "Queen Spades", "King Spades", "Ace Spades" };

            String StraightFlushDiamonds = { "3 diamonds", "3 diamonds", "5 diamonds", "6 diamonds", "7 diamonds" };
            String StraightFlushClubs = { "3 Clubs", "3 Clubs", "5 Clubs", "7 Clubs" };
            ;
            String StraightFlushHearts = { "3 Hearts", "3 Hearts", "5 Hearts", "6 Hearts", "7 Hearts" };
            String StraightFlushSpades = { "3 Spades", "3 Spades", "5 Spades", "6 Spades", "7 Spades" };

            String fourofakindA = { "Ace Hearts", "Ace  Diamonds", "Ace  Clubs", "Ace Spades" };
            String fourofakind2 = { "2 Hearts", "2 Diamonds", "2 Clubs", "2 Spades" };
            String fourofakind3 = { "3 Hearts", "3 Diamonds", "3 Clubs", "3 Spades" };
            String fourofakind4 = { "4 Hearts", "4 Diamonds", "4 Clubs", "4 Spades" };
            String fourofakind5 = { "5 Hearts", "5 Diamonds", "5 Clubs", "5 Spades" };
            String fourofakind6 = { "6 Hearts", "6 Diamonds", "6 Clubs", "6 Spades" };
            String fourofakind7 = { "7 Hearts", "7 Diamonds", "7 Clubs", "7 Spades" };
            String fourofakind8 = { "8 Hearts", "8 Diamonds", "8 Clubs", "8 Spades" };
            String fourofakind9 = { "9 Hearts", "9 Diamonds", "9 Clubs", "9 Spades" };
            String fourofakind10 = { "10 Hearts", "10 Diamonds", "10 Clubs", "10 Spades" };
            String fourofakindj = { "Joker Hearts", "Joker Diamonds", "Joker Clubs", "Joker Spades" };
            String fourofakindq = { "Queen Hearts", "Queen Diamonds", "Queen Clubs", "Queen Spades" };
            String fourofakindk = { "King Hearts", "King Diamonds", "King Clubs", "King Spades" };

            String fullhouse = { "9 Hearts", "9 Clubs", "Queen Spades", "Queen Diamonds", "Queen Hearts" };

            String flushDiamonds = { "2 Diamonds", "5 Diamonds", "7 Diamonds", "Joker Diamonds", "Ace Diamonds" };
            String flushSpades = { "2 Spades", "5 Spades", "7 Spades", "Joker Spades", "Ace Spades" };
            String flushClubs = { "2 Clubs", "5 Clubs", "7 Clubs", "Joker Clubs", "Ace Clubs" };
            String flushHearts = { "2 Hearts", "5 Hearts", "7 Hearts", "Joker Hearts", "Ace Hearts" };

            String straight = { "8 Hearts", "9 Diamonds", "10 Spades", "Jack Clubs", "Queen Spades" };

            String threeofakindA = { "Ace Hearts", "Ace  Diamonds", "Ace  Clubs" };
            String threeofakind2 = { "2 Hearts", "2 Diamonds", "2 Clubs" };
            String threeofakind3 = { "3 Hearts", "3 Diamonds", "3 Clubs" };
            String threeofakind4 = { "4 Hearts", "4 Diamonds", "4 Clubs" };
            String threeofakind5 = { "5 Hearts", "5 Diamonds", "5 Clubs" };
            String threeofakind6 = { "6 Hearts", "6 Diamonds", "6 Clubs" };
            String threeofakind7 = { "7 Hearts", "7 Diamonds", "7 Clubs" };
            String threeofakind8 = { "8 Hearts", "8 Diamonds", "8 Clubs" };
            String threeofakind9 = { "9 Hearts", "9 Diamonds", "9 Clubs" };
            String threeofakind10 = { "10 Hearts", "10 Diamonds", "10 Clubs" };
            String threeofakindj = { "Joker Hearts", "Joker Diamonds", "Joker Clubs" };
            String threeofakindq = { "Queen Hearts", "Queen Diamonds", "Queen Clubs" };
            String threeofakindk = { "King Hearts", "King Diamonds", "King Clubs" };

            String twoofakindA = { "Ace Hearts", "Ace  Diamonds" };
            String twoofakind2 = { "2 Hearts", "2 Diamonds" };
            String twoofakind3 = { "3 Hearts", "3 Diamonds" };
            String twoofakind4 = { "4 Hearts", "4 Diamonds" };
            String twoofakind5 = { "5 Hearts", "5 Diamonds" };
            String twoofakind6 = { "6 Hearts", "6 Diamonds" };
            String twoofakind7 = { "7 Hearts", "7 Diamonds" };
            String twoofakind8 = { "8 Hearts", "8 Diamonds" };
            String twoofakind9 = { "9 Hearts", "9 Diamonds" };
            String twoofakind10 = { "10 Hearts", "10 Diamonds" };
            String twoofakindj = { "Joker Hearts", "Joker Diamonds" };
            String twoofakindq = { "Queen Hearts", "Queen Diamonds" };
            String twoofakindk = { "King Hearts", "King Diamonds" };

            if (hand == RoyalFlushHearts) {
                RoyalFlush++;
            } else if (hand == RoyalFlushDiamonds) {
                RoyalFlush++;
            } else if (hand == RoyalFlushSpades) {
                RoyalFlush++;
            } else if (hand == RoyalFlushClubs) {
                RoyalFlush++;
            }
            ////////////////
            else if (hand == StraightFlushDiamonds) {
                StraightFlush++;
            } else if (hand == StraightFlushClubs) {
                StraightFlush++;
            } else if (hand == StraightFlushHearts) {
                StraightFlush++;
            } else if (hand == StraightFlushSpades) {
                StraightFlush++;
            }
            ////////////////
            else if (hand == fourofakindA) {
                Fourofakind++;
            } else if (hand == fourofakind2) {
                Fourofakind++;
            } else if (hand == fourofakind3) {
                Fourofakind++;
            } else if (hand == fourofakind4) {
                Fourofakind++;
            } else if (hand == fourofakind5) {
                Fourofakind++;
            } else if (hand == fourofakind6) {
                Fourofakind++;
            } else if (hand == fourofakind7) {
                Fourofakind++;
            } else if (hand == fourofakind8) {
                Fourofakind++;
            } else if (hand == fourofakind9) {
                Fourofakind++;
            } else if (hand == fourofakind10) {
                Fourofakind++;
            } else if (hand == fourofakindj) {
                Fourofakind++;
            } else if (hand == fourofakindq) {
                Fourofakind++;
            } else if (hand == fourofakindk) {
                Fourofakind++;
            }
            ////////////////
            else if (hand == fullhouse) {
                Fullhouse++;
            }
            ////////////////
            else if (hand == flushDiamonds) {
                Flush++;
            } else if (hand == flushClubs) {
                Flush++;
            } else if (hand == flushHearts) {
                Flush++;
            } else if (hand == flushSpades) {
                Flush++;
            }
            ////////////////
            else if (hand == straight) {
                Straight++;
            }
            ////////////////
            else if (hand == threeofakindA) {
                Threeofakind++;
            } else if (hand == threeofakind2) {
                Threeofakind++;
            } else if (hand == threeofakind3) {
                Threeofakind++;
            } else if (hand == threeofakind4) {
                Threeofakind++;
            } else if (hand == threeofakind5) {
                Threeofakind++;
            } else if (hand == threeofakind6) {
                Threeofakind++;
            } else if (hand == threeofakind8) {
                Threeofakind++;
            } else if (hand == threeofakind9) {
                Threeofakind++;
            } else if (hand == threeofakind10) {
                Threeofakind++;
            } else if (hand == threeofakindj) {
                Threeofakind++;
            } else if (hand == threeofakindq) {
                Threeofakind++;
            } else if (hand == threeofakindk) {
                Threeofakind++;
            }
            ////////////////
            else if (hand == twoofakindA && twoofakind2) {
                twopair++;
            } else if (hand == twoofakindA && twoofakind3) {
                twopair++;
            } else if (hand == twoofakindA && twoofakind4) {
                twopair++;
            } else if (hand == twoofakindA && twoofakind5) {
                twopair++;
            } else if (hand == twoofakindA && twoofakind6) {
                twopair++;
            } else if (hand == twoofakindA && twoofakind7) {
                twopair++;
            } else if (hand == twoofakindA && twoofakind8) {
                twopair++;
            } else if (hand == twoofakindA && twoofakind9) {
                twopair++;
            } else if (hand == twoofakindA && twoofakind10) {
                twopair++;
            } else if (hand == twoofakindA && twoofakindj) {
                twopair++;
            } else if (hand == twoofakindA && twoofakindq) {
                twopair++;
            } else if (hand == twoofakindA && twoofakindk) {
                twopair++;
            }

            else if (hand == twoofakind2 && twoofakindA) {
                twopair++;
            } else if (hand == twoofakind2 && twoofakind3) {
                twopair++;
            } else if (hand == twoofakind2 && twoofakind4) {
                twopair++;
            } else if (hand == twoofakind2 && twoofakind5) {
                twopair++;
            } else if (hand == twoofakind2 && twoofakind6) {
                twopair++;
            } else if (hand == twoofakind2 && twoofakind7) {
                twopair++;
            } else if (hand == twoofakind2 && twoofakind8) {
                twopair++;
            } else if (hand == twoofakind2 && twoofakind9) {
                twopair++;
            } else if (hand == twoofakind2 && twoofakind10) {
                twopair++;
            } else if (hand == twoofakind2 && twoofakindj) {
                twopair++;
            } else if (hand == twoofakind2 && twoofakindq) {
                twopair++;
            } else if (hand == twoofakind2 && twoofakindk) {
                twopair++;
            }

            else if (hand == twoofakind3 && twoofakind2) {
                twopair++;
            } else if (hand == twoofakind3 && twoofakindA) {
                twopair++;
            } else if (hand == twoofakind3 && twoofakind4) {
                twopair++;
            } else if (hand == twoofakind3 && twoofakind5) {
                twopair++;
            } else if (hand == twoofakind3 && twoofakind6) {
                twopair++;
            } else if (hand == twoofakind3 && twoofakind7) {
                twopair++;
            } else if (hand == twoofakind3 && twoofakind8) {
                twopair++;
            } else if (hand == twoofakind3 && twoofakind9) {
                twopair++;
            } else if (hand == twoofakind3 && twoofakind10) {
                twopair++;
            } else if (hand == twoofakind3 && twoofakindj) {
                twopair++;
            } else if (hand == twoofakind3 && twoofakindq) {
                twopair++;
            } else if (hand == twoofakind3 && twoofakindk) {
                twopair++;
            }

            else if (hand == twoofakind4 && twoofakind2) {
                twopair++;
            } else if (hand == twoofakind4 && twoofakind3) {
                twopair++;
            } else if (hand == twoofakind4 && twoofakind3) {
                twopair++;
            } else if (hand == twoofakind4 && twoofakindA) {
                twopair++;
            } else if (hand == twoofakind4 && twoofakind5) {
                twopair++;
            } else if (hand == twoofakind4 && twoofakind6) {
                twopair++;
            } else if (hand == twoofakind4 && twoofakind7) {
                twopair++;
            } else if (hand == twoofakind4 && twoofakind8) {
                twopair++;
            } else if (hand == twoofakind4 && twoofakind9) {
                twopair++;
            } else if (hand == twoofakind4 && twoofakind10) {
                twopair++;
            } else if (hand == twoofakind4 && twoofakindj) {
                twopair++;
            } else if (hand == twoofakind4 && twoofakindq) {
                twopair++;
            } else if (hand == twoofakind4 && twoofakindk) {
                twopair++;
            }

            else if (hand == twoofakind5 && twoofakind2) {
                twopair++;
            } else if (hand == twoofakind5 && twoofakind3) {
                twopair++;
            } else if (hand == twoofakind5 && twoofakind3) {
                twopair++;
            } else if (hand == twoofakind5 && twoofakind4) {
                twopair++;
            } else if (hand == twoofakind5 && twoofakindA) {
                twopair++;
            } else if (hand == twoofakind5 && twoofakind6) {
                twopair++;
            } else if (hand == twoofakind5 && twoofakind7) {
                twopair++;
            } else if (hand == twoofakind5 && twoofakind8) {
                twopair++;
            } else if (hand == twoofakind5 && twoofakind9) {
                twopair++;
            } else if (hand == twoofakind5 && twoofakind10) {
                twopair++;
            } else if (hand == twoofakind5 && twoofakindj) {
                twopair++;
            } else if (hand == twoofakind5 && twoofakindq) {
                twopair++;
            } else if (hand == twoofakind5 && twoofakindk) {
                twopair++;
            }

            else if (hand == twoofakind6 && twoofakind2) {
                twopair++;
            } else if (hand == twoofakind6 && twoofakind3) {
                twopair++;
            } else if (hand == twoofakind6 && twoofakind3) {
                twopair++;
            } else if (hand == twoofakind6 && twoofakind4) {
                twopair++;
            } else if (hand == twoofakind6 && twoofakind5) {
                twopair++;
            } else if (hand == twoofakind6 && twoofakindA) {
                twopair++;
            } else if (hand == twoofakind6 && twoofakind7) {
                twopair++;
            } else if (hand == twoofakind6 && twoofakind8) {
                twopair++;
            } else if (hand == twoofakind6 && twoofakind9) {
                twopair++;
            } else if (hand == twoofakind6 && twoofakind10) {
                twopair++;
            } else if (hand == twoofakind6 && twoofakindj) {
                twopair++;
            } else if (hand == twoofakind6 && twoofakindq) {
                twopair++;
            } else if (hand == twoofakind6 && twoofakindk) {
                twopair++;
            }

            else if (hand == twoofakind7 && twoofakind2) {
                twopair++;
            } else if (hand == twoofakind7 && twoofakind3) {
                twopair++;
            } else if (hand == twoofakind7 && twoofakind3) {
                twopair++;
            } else if (hand == twoofakind7 && twoofakind4) {
                twopair++;
            } else if (hand == twoofakind7 && twoofakind5) {
                twopair++;
            } else if (hand == twoofakind7 && twoofakind6) {
                twopair++;
            } else if (hand == twoofakind7 && twoofakindA) {
                twopair++;
            } else if (hand == twoofakind7 && twoofakind8) {
                twopair++;
            } else if (hand == twoofakind7 && twoofakind9) {
                twopair++;
            } else if (hand == twoofakind7 && twoofakind10) {
                twopair++;
            } else if (hand == twoofakind7 && twoofakindj) {
                twopair++;
            } else if (hand == twoofakind7 && twoofakindq) {
                twopair++;
            } else if (hand == twoofakind7 && twoofakindk) {
                twopair++;
            }

            else if (hand == twoofakind8 && twoofakind2) {
                twopair++;
            } else if (hand == twoofakind8 && twoofakind3) {
                twopair++;
            } else if (hand == twoofakind8 && twoofakind3) {
                twopair++;
            } else if (hand == twoofakind8 && twoofakind4) {
                twopair++;
            } else if (hand == twoofakind8 && twoofakind5) {
                twopair++;
            } else if (hand == twoofakind8 && twoofakind6) {
                twopair++;
            } else if (hand == twoofakind8 && twoofakind7) {
                twopair++;
            } else if (hand == twoofakind8 && twoofakindA) {
                twopair++;
            } else if (hand == twoofakind8 && twoofakind9) {
                twopair++;
            } else if (hand == twoofakind8 && twoofakind10) {
                twopair++;
            } else if (hand == twoofakind8 && twoofakindj) {
                twopair++;
            } else if (hand == twoofakind8 && twoofakindq) {
                twopair++;
            } else if (hand == twoofakind8 && twoofakindk) {
                twopair++;
            }

            else if (hand == twoofakind9 && twoofakind2) {
                twopair++;
            } else if (hand == twoofakind9 && twoofakind3) {
                twopair++;
            } else if (hand == twoofakind9 && twoofakind3) {
                twopair++;
            } else if (hand == twoofakind9 && twoofakind4) {
                twopair++;
            } else if (hand == twoofakind9 && twoofakind5) {
                twopair++;
            } else if (hand == twoofakind9 && twoofakind6) {
                twopair++;
            } else if (hand == twoofakind9 && twoofakind7) {
                twopair++;
            } else if (hand == twoofakind9 && twoofakind8) {
                twopair++;
            } else if (hand == twoofakind9 && twoofakindA) {
                twopair++;
            } else if (hand == twoofakind9 && twoofakind10) {
                twopair++;
            } else if (hand == twoofakind9 && twoofakindj) {
                twopair++;
            } else if (hand == twoofakind9 && twoofakindq) {
                twopair++;
            } else if (hand == twoofakind9 && twoofakindk) {
                twopair++;
            }

            else if (hand == twoofakind10 && twoofakind2) {
                twopair++;
            } else if (hand == twoofakind10 && twoofakind3) {
                twopair++;
            } else if (hand == twoofakind10 && twoofakind3) {
                twopair++;
            } else if (hand == twoofakind10 && twoofakind4) {
                twopair++;
            } else if (hand == twoofakind10 && twoofakind5) {
                twopair++;
            } else if (hand == twoofakind10 && twoofakind6) {
                twopair++;
            } else if (hand == twoofakind10 && twoofakind7) {
                twopair++;
            } else if (hand == twoofakind10 && twoofakind8) {
                twopair++;
            } else if (hand == twoofakind10 && twoofakind9) {
                twopair++;
            } else if (hand == twoofakind10 && twoofakindA) {
                twopair++;
            } else if (hand == twoofakind10 && twoofakindj) {
                twopair++;
            } else if (hand == twoofakind10 && twoofakindq) {
                twopair++;
            } else if (hand == twoofakind10 && twoofakindk) {
                twopair++;
            }

            else if (hand == twoofakindj && twoofakind2) {
                twopair++;
            } else if (hand == twoofakindj && twoofakind3) {
                twopair++;
            } else if (hand == twoofakindj && twoofakind3) {
                twopair++;
            } else if (hand == twoofakindj && twoofakind4) {
                twopair++;
            } else if (hand == twoofakindj && twoofakind5) {
                twopair++;
            } else if (hand == twoofakindj && twoofakind6) {
                twopair++;
            } else if (hand == twoofakindj && twoofakind7) {
                twopair++;
            } else if (hand == twoofakindj && twoofakind8) {
                twopair++;
            } else if (hand == twoofakindj && twoofakind9) {
                twopair++;
            } else if (hand == twoofakindj && twoofakind10) {
                twopair++;
            } else if (hand == twoofakindj && twoofakindA) {
                twopair++;
            } else if (hand == twoofakindj && twoofakindq) {
                twopair++;
            } else if (hand == twoofakindj && twoofakindk) {
                twopair++;
            }

            else if (hand == twoofakindq && twoofakind2) {
                twopair++;
            } else if (hand == twoofakindq && twoofakind3) {
                twopair++;
            } else if (hand == twoofakindq && twoofakind3) {
                twopair++;
            } else if (hand == twoofakindq && twoofakind4) {
                twopair++;
            } else if (hand == twoofakindq && twoofakind5) {
                twopair++;
            } else if (hand == twoofakindq && twoofakind6) {
                twopair++;
            } else if (hand == twoofakindq && twoofakind7) {
                twopair++;
            } else if (hand == twoofakindq && twoofakind8) {
                twopair++;
            } else if (hand == twoofakindq && twoofakind9) {
                twopair++;
            } else if (hand == twoofakindq && twoofakind10) {
                twopair++;
            } else if (hand == twoofakindq && twoofakindj) {
                twopair++;
            } else if (hand == twoofakindq && twoofakindA) {
                twopair++;
            } else if (hand == twoofakindq && twoofakindk) {
                twopair++;
            }

            else if (hand == twoofakindk && twoofakind2) {
                twopair++;
            } else if (hand == twoofakindk && twoofakind3) {
                twopair++;
            } else if (hand == twoofakindk && twoofakind3) {
                twopair++;
            } else if (hand == twoofakindk && twoofakind4) {
                twopair++;
            } else if (hand == twoofakindk && twoofakind5) {
                twopair++;
            } else if (hand == twoofakindk && twoofakind6) {
                twopair++;
            } else if (hand == twoofakindk && twoofakind7) {
                twopair++;
            } else if (hand == twoofakindk && twoofakind8) {
                twopair++;
            } else if (hand == twoofakindk && twoofakind9) {
                twopair++;
            } else if (hand == twoofakindk && twoofakind10) {
                twopair++;
            } else if (hand == twoofakindk && twoofakindj) {
                twopair++;
            } else if (hand == twoofakindk && twoofakindq) {
                twopair++;
            } else if (hand == twoofakindk && twoofakindA) {
                twopair++;
            }
            ////////////////
            else if (hand == twoofakindA) {
                pair++;
            } else if (hand == twoofakind2) {
                pair++;
            } else if (hand == twoofakind3) {
                pair++;
            } else if (hand == twoofakind4) {
                pair++;
            } else if (hand == twoofakind5) {
                pair++;
            } else if (hand == twoofakind6) {
                pair++;
            } else if (hand == twoofakind8) {
                pair++;
            } else if (hand == twoofakind9) {
                pair++;
            } else if (hand == twoofakind10) {
                pair++;
            } else if (hand == twoofakindj) {
                pair++;
            } else if (hand == twoofakindq) {
                pair++;
            } else if (hand == twoofakindk) {
                pair++;
            }
            count++;
        }
        System.out.println("Royal Flush: " + RoyalFlush / iterations * 100 + "%");
        System.out.println("Straight Flush: " + StraightFlush / iterations * 100 + "%");
        System.out.println("Four of a Kind: " + Fourofakind / iterations * 100 + "%");
        System.out.println("Full House: " + FullHouse / iterations * 100 + "%");
        System.out.println("Three of a Kind: " + Threeofakind / iterations * 100 + "%");
        System.out.println("Two Pair: " + twopair / iterations * 100 + "%");
        System.out.println("Pair: " + pair / iterations * 100 + "%");

    }
}

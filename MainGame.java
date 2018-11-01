package CardGame;

import java.util.Scanner;

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

            count++;
        }

    }
}

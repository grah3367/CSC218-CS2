package project.game.rpg;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dan
 */
public class Deck {

 // java list
    private List<Card> cards = new ArrayList<Card>();

    public enum Suits {
        SPADES,
        HEARTS,
        DIAMONDS,
        CLUBS;
    }
    public enum Ranks {ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN;}

    public Deck(){

    }


    public class Card {
        private Suits suit;
        private Ranks rank;

        public Card(Suits suit, Ranks rank){
            this.suit = suit;
            this.rank = rank;
        }




    }

}

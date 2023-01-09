package main;
import java.util.*;


public class deck{
    public static Stack<card> cardDeck;

    /**
     * Constructor to create a new deck and populate it with cards
     */
    public deck(){
        cardDeck = new Stack<card>();
        populateDeck();
    }

    /**
     * Method to populate the deck and randomize the deck order
     */
    public void populateDeck(){
        Random rand = new Random();
        ArrayList<card> tempDeck = new ArrayList<card>(52);
        for(int i = 1; i < 14; i++){
            for(int j = 0; j < 4; j++){
                card input = new card(i,j);
                tempDeck.add(input);
            }
        }
        while(!tempDeck.isEmpty()){
            int randInt = rand.nextInt(tempDeck.size());
            card deckInput = tempDeck.get(randInt);
            cardDeck.push(deckInput);
            tempDeck.remove(randInt);
        }
    }

    /**
     * Returns a string value of all of the cards in the deck
     * Cards will be returned in the form "Ace of diamonds"
     * 
     * @return a string value representing the value of the deck
     */
    public String toString(){
        String output = "";
        for(int i = 0; i < cardDeck.size(); i++){
            output = output + cardDeck.get(i).toString() + "\n";
        }
        return output;
    }
}
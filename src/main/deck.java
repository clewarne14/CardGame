package main;
import java.util.*;


public class deck{
    public Stack<card> cardDeck;

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
     * A helper method to draw a card from this deck
     * 
     * @return the card drawn from the deck
     */
    public card draw(){
        if(cardDeck.capacity() > 0){
            return cardDeck.pop();
        }else{
            return null;
        }
    }

    /**
     * Helper method to determind if the deck is empty
     * 
     * @return boolean representing if the deck is empty.
     */
    public boolean isEmpty(){
        return cardDeck.empty();
    }

    /**
     * Helper method to check the size of the deck
     * 
     * @return an integer to represent the size of the deck
     */
    public int numCards(){
        return cardDeck.size();
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
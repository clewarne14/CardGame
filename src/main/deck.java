package main;
import java.util.*;


public class deck{
    public Stack<card> cardDeck;

    public deck(){
        cardDeck = new Stack<card>();
    }

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

    public String toString(){
        String output = "";
        for(int i = 0; i < cardDeck.size(); i++){
            output = output + cardDeck.get(i).toString() + "\n";
        }
        //System.out.println(output);
        return output;
    }
}
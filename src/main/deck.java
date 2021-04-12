package main;
import java.util.*;


public class deck{
    public ArrayList<card> cardDeck;

    public deck(){
        cardDeck = new ArrayList<card>(52);
    }

    public void populateDeck(){
       // Random rand = new Random();
        for(int i = 1; i < 14; i++){
            for(int j = 0; j < 4; j++){
                card input = new card(i,j);
                cardDeck.set(i*(j+1),input);
            }
        }
    }
}
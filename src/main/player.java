package main;

import java.util.*;

public class player{
    private ArrayList<card> hand;
    private ArrayList<card> faceDown;
    private ArrayList<card> faceUp;
    private int playerUID;

    /**
     * Constructor to create a player object in a game
     * 
     * @param playerUIDTemp The user ID of the player
     */
    public player(int playerUIDTemp){
        hand = new ArrayList<card>();
        faceDown = new ArrayList<card>();
        faceUp = new ArrayList<card>();
        playerUID = playerUIDTemp;
    }

    /**
     * A method to place chosen cards faceup on the table.
     * 
     * @param i The card position in the hand of the player
     * @return Boolean value indicating whether or not the play was successful
     */
    public boolean placeTop(int i){
        if(faceUp.size() == 3){
            return false;
        } else {
            card c = hand.remove(i);
            faceUp.add(c);
            return true;
        }
    }

    /**
     * Method that plays a card from the faceup cards of a given player.
     * @param i the index of the card being played from the faceup cards
     * @return
     */
    public card playTop(int i){
        if(i >= this.faceUp.size() || i < 0 || this.hand.size() != 0){
            return null;
        }
        return this.faceUp.get(i);
    }

    /**
     * Gives a player a card from the deck
     * 
     * @param play the player that is trying to draw a card
     * @return boolean indicating whether or not the card is drawn
     */
    public boolean draw(){
        if(deck.cardDeck.isEmpty()){
            return false;
        } else {
            hand.add(deck.cardDeck.pop());
            return true;
        }
    }
    


    /**
     * Getter method to return the hand of the player
     * 
     * @return the hand of the player
     */
    public ArrayList<card> getHand(){
        return hand;
    }


    /**
     * Getter method to return the facedown cards of the player
     * 
     * @return the facedown cards of the player
     */
    public ArrayList<card> getFaceDown(){
        return faceDown;
    }

    /*
     * Getter method to return the faceup cards of the player
     * 
     * @return the faceup cards of the player
     */
    public ArrayList<card> getFaceUp(){
        return faceUp;
    }

    /**
     * Getter method to return the UserID of a player
     * 
     * @return the UserID of the player
     */
    public int getPlayerUID(){
        return playerUID;
    }
}
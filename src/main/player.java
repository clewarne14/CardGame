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

    // /**
    //  * Unknown what this method is. Delete later
    //  * @param i
    //  * @return
    //  */
    // public card playTop(int i){
    //     if(i >= this.faceUp.size() || i < 0 || this.hand.size() != 0){
    //         return null;
    //     }
    //     return this.faceUp.get(i);
    // }


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
package main;

import java.util.*;

public class player {
    private ArrayList<card> hand;
    private ArrayList<card> faceDown;
    private ArrayList<card> faceUp;
    private int playerUID;

    /**
     * Constructor to create a player object in a game
     * 
     * @param playerUIDTemp The user ID of the player
     */
    public player(int playerUIDTemp) {
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
    public boolean placeTop(int i) {
        if (faceUp.size() == 3 || i >= hand.size()) {
            return false;
        } else {
            card c = hand.remove(i);
            System.out.println(c.toString());
            System.out.println(hand);
            faceUp.add(c);
            System.out.println(faceUp);
            return true;
        }
    }

    /**
     * Helper method to remove one of the faceup cards for a player
     * 
     * @param i the index of the card to be removed.
     */
    public void removeTop(int i) {
        this.faceUp.remove(i);
    }

    /**
     * Method that checks if the card chosen can be played
     * 
     * @param i the index of the card being played from the faceup cards
     * @return
     */
    public card checkTop(int i) {
        if (i >= this.faceUp.size() || i < 0 || this.hand.size() != 0) {
            return null;
        }
        return this.faceUp.get(i);
    }

    /**
     * Helper method to add a card to the players hand
     * 
     * @param c the card to be added to the players hand
     */
    public void addToHand(card c) {
        hand.add(c);
    }

    /**
     * Helper method to remove a card from the players hand
     * 
     * @param pos the position of the card to be removed
     */
    public void removeFromHand(int pos) {
        if (pos > hand.size()) {
            return;
        } else {
            hand.remove(pos);
        }
    }

    /**
     * Helper method to remove a card from the given facedown cards
     * 
     * @param i the index of the card wanting to be removed
     */
    public void removeBottom(int i) {
        this.faceDown.remove(i);
    }

    // /**
    // * Gives a player a card from the deck
    // *
    // * @param play the player that is trying to draw a card
    // * @return boolean indicating whether or not the card is drawn
    // */
    // public boolean draw(){
    // if(main.gameInstance.getDeck().cardDeck.isEmpty()){
    // return false;
    // } else {
    // hand.add(main.gameInstance.getDeck().cardDeck.pop());
    // return true;
    // }
    // }

    /**
     * Getter method to return the hand of the player
     * 
     * @return the hand of the player
     */
    public ArrayList<card> getHand() {
        return hand;
    }

    /**
     * Getter method to return the facedown cards of the player
     * 
     * @return the facedown cards of the player
     */
    public ArrayList<card> getFaceDown() {
        return faceDown;
    }

    /*
     * Getter method to return the faceup cards of the player
     * 
     * @return the faceup cards of the player
     */
    public ArrayList<card> getFaceUp() {
        return faceUp;
    }

    /**
     * Getter method to return the UserID of a player
     * 
     * @return the UserID of the player
     */
    public int getPlayerUID() {
        return playerUID;
    }

    /**
     * Debugging method to add a specific card to a players hand
     * 
     * @param num  the number of the card to be added
     * @param suit the suit of the card to be added
     * @param p    the player being given the card
     */
    public void drawSpecificCard(int num, int suit) {
        card c = new card(num, suit);
        addToHand(c);
    }

    /**
     * Debugging method to remove all cards from a players hand.
     */
    public void emptyHand() {
        while (!hand.isEmpty()) {
            hand.remove(0);
        }
    }
}
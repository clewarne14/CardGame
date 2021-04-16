package main;

import java.util.*;

public class player{
    private ArrayList<card> hand;
    private ArrayList<card> faceDown;
    private ArrayList<card> faceUp;
    private int playerUID;

    public player(int playerUIDTemp){
        hand = new ArrayList<card>();
        faceDown = new ArrayList<card>();
        faceUp = new ArrayList<card>();
        playerUID = playerUIDTemp;
    }

    public boolean placeTop(card c){
        if(faceUp.size() == 3){
            return false;
        } else {
            hand.remove(c);
            faceUp.add(c);
            return true;
        }
    }

    public ArrayList<card> getHand(){
        return hand;
    }
    public ArrayList<card> getFaceDown(){
        return faceDown;
    }
    public ArrayList<card> getFaceUp(){
        return faceUp;
    }
    public int getPlayerUID(){
        return playerUID;
    }
}
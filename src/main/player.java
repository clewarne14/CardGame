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
package tests;

import main.gameInstance;

public class GameTest{

    public static void main(String [] args){
        gameInstance g = new gameInstance(1,2);
        g.getDeck().populateDeck();
        System.out.println(g.getDeck().toString());
    }
}
package tests;

import main.gameInstance;
import main.player;

public class GameTest{

    public static void main(String [] args){
        gameInstance g = new gameInstance(1,2);
        g.getDeck().populateDeck();
        System.out.println(g.getDeck().toString());
        player p = new player(1);
        g.draw(p);
        g.placeBottom(p);
        g.draw(p);
        g.draw(p);
        System.out.println(p.getHand());
        p.placeTop(p.getHand().get(0));
        System.out.println(p.getFaceUp());
        System.out.println(p.getHand());
    }
}
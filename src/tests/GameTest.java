package tests;

import main.card;
import main.gameInstance;
import main.player;

public class GameTest{

    public static void main(String [] args){
        gameInstance g = new gameInstance(1,2);
        g.getDeck().populateDeck();
        System.out.println(g.getDeck().toString());
        player p = g.getPlayer1();
        g.draw(p);
        g.placeBottom(p);
        g.draw(p);
        g.draw(p);
        System.out.println(p.getHand());
        p.placeTop(0);
        System.out.println(p.getFaceUp());
        card c = p.playTop(0);
        System.out.println(p.getFaceUp());
        System.out.println(p.getFaceUp());
        System.out.println(p.getHand());
    }
}
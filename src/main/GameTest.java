package main;

public class GameTest{

    public static void main(String [] args){
        gameInstance g = new gameInstance(1,2);
        System.out.println(g.getDeck().toString());
        player p = g.getPlayer1();
        g.draw(p);
        g.placeBottom(p);
        g.draw(p);
        g.draw(p);
        System.out.println(p.getHand());
        p.placeTop(0);
        System.out.println(p.getFaceUp());
        p.placeTop(0);
        System.out.println(p.getFaceUp());
        System.out.println(p.getFaceUp());
        System.out.println(p.getHand());
    }
}
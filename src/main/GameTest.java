package main;

public class GameTest{

    public static void main(String [] args){
        gameInstance g = new gameInstance(1,2);
        player p = g.getPlayer1();
        System.out.println(p.getHand());
        System.out.println("\n");
        System.out.println(p.getFaceDown());
        System.out.println("\n");
        p.placeTop(0);
        p.placeTop(0);
        p.placeTop(0);
        System.out.println(p.getFaceUp());
        System.out.println("\n");
        System.out.println(p.getHand());
        System.out.println(g.getTopCard());
        g.playCard(0,p);
        System.out.println(g.getTopCard());
        System.out.println(p.getHand());


    }
}
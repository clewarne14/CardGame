package main;

public class controller {
    public static void main(String[] args){
        gameInstance g = new gameInstance(1, 2);
        player p = g.getPlayer1();
        p.placeTop(0);
        p.placeTop(0);
        p.placeTop(0);
        p.drawSpecificCard(9, 1);
        System.out.println(p.getHand());
        p.drawSpecificCard(2, 1);
        g.playCard(4, p);
        while(!g.getDeck().isEmpty()){
            g.drawCard(p);
        }
        p.emptyHand();
        System.out.println(p.getFaceUp());
        g.playTop(0, p);
        System.out.println(p.getFaceUp());
        System.out.println(g.getPlayed());
        p.drawSpecificCard(2, 1);
        g.playCard(0, p);
        g.playTop(0,p);
        p.drawSpecificCard(2, 1);
        g.playCard(0, p);
        g.playTop(0,p);
        System.out.println(p.getHand());
        System.out.println(p.getFaceUp());
        System.out.println(g.getPlayed());
        // System.out.println(p.getFaceUp());
        // g.playTop(0,p);
        // System.out.println(p.getFaceUp());
        // System.out.println(g.getTopCard());
    }
}

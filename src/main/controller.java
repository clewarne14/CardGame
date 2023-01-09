package main;

public class controller {
    public static void main(String[] args){
        gameInstance g = new gameInstance(1, 2);
        player p = g.getPlayer1();
        p.placeTop(0);
        p.placeTop(0);
        p.placeTop(0);
        while(!g.getDeck().isEmpty()){
            g.drawCard(p);
        }
        System.out.println(g.getDeck());
        System.out.println(p.getFaceUp());
        g.playTop(0,p);
        System.out.println(p.getFaceUp());
        System.out.println(g.getTopCard());
    }
}

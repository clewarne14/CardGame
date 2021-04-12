package main;



public class gameInstance{
    private final int player1uid;
    private final int player2uid;
    private final table table;
    private final deck deck;

    public gameInstance(int player1uidTemp, int player2uidTemp){
        player1uid = player1uidTemp;
        player2uid = player2uidTemp;
        table = new table();
        deck = new deck();
    }

    
}
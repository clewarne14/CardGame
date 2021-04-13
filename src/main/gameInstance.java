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

    public boolean playCard(card top, card played){
        if(played.getNumber() >= top.getNumber()){
            return true;
        } else if (played.getNumber() == 10 || played.getNumber() == 2 || played.getNumber() == 1){
            return true;
        } else {
            return false;
        }
    }
    public deck getDeck(){
        return deck;
    }

    
}
package main;



public class gameInstance{
    private final player player1;
    private final player player2;
    private final table table;
    private final deck deck;

    public gameInstance(int player1uidTemp, int player2uidTemp){
        player1 = new player(player1uidTemp);
        player2 = new player(player2uidTemp);
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
    public boolean draw(){
        return true;
    }
    public deck getDeck(){
        return deck;
    }
    public table getTable(){
        return table;
    }
    public player getPlayer1(){
        return  player1;
    }
    public player getPlayer2(){
        return player2;
    }

    
}
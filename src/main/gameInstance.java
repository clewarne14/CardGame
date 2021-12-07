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
        if(top.getNumber() == 1 && played.getNumber() != 1 && played.getNumber() != 2 && played.getNumber() != 10){
            return false;
        } else if(played.getNumber() >= top.getNumber()){
            this.deck.cardDeck.add(played);
            return true;
        } else if (played.getNumber() == 10 || played.getNumber() == 2 || played.getNumber() == 1){
            this.deck.cardDeck.add(played);
            return true;
        } else {
            return false;
        }
    }

    public void placeBottom(player play){
        play.getFaceDown().add(deck.cardDeck.pop());
    }

    public boolean draw(player play){
        if(deck.cardDeck.isEmpty()){
            return false;
        } else {
            play.getHand().add(deck.cardDeck.pop());
            return true;
        }
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
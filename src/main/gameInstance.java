package main;

import java.util.Stack;

public class gameInstance{
    private final player player1;
    private final player player2;
    private final table table;
    private deck deck;
    public Stack<card> playedCards;

    /*
     * Constructor to create a gameInstance using two user IDs.
     */
    public gameInstance(int player1uidTemp, int player2uidTemp){
        player1 = new player(player1uidTemp);
        player2 = new player(player2uidTemp);
        table = new table();
        deck = new deck();
        playedCards = new Stack<card>();
        for(int i = 0; i < 6; i++){
            drawCard(player1);
            drawCard(player2);
        }
        for(int i = 0; i < 3; i++){
            placeBottom(player1);
            placeBottom(player2);
        }
        playedCards.push(deck.draw());
    }

    /**
     * Plays a card by putting it on top of the stack of already played cards.
     * 
     * Checks if it is a valid play and, if it is, plays the card
     * 
     * @param top the top card on the pile
     * @param played the card that is trying to be played
     * @return whether the card is played
     */
    public boolean playCard(int pos, player p){
        boolean deckEmpty = deck.isEmpty();
        // card top = this.getTopCard();
        card played = p.getHand().get(pos);
        if(pos >= p.getHand().size() || !checkPlay(played)){
            return false;
        }
        else{
            p.removeFromHand(pos);
            playedCards.push(played);
            if(!deckEmpty){
                drawCard(p);
            }
            return true;
        }
        // if(pos >= p.getHand().size()){
        //     return false;
        // }
        // if(top == null){
        //     p.removeFromHand(pos);
        //     playedCards.push(played);
        //     if(!deckEmpty){
        //         drawCard(p);
        //     }
        //     return true;
        // }else if(top.getNumber() == 1 && played.getNumber() != 1 && played.getNumber() != 2 && played.getNumber() != 10){
        //     return false;
        // } else if(played.getNumber() >= top.getNumber()){
        //     p.removeFromHand(pos);
        //     playedCards.push(played);
        //     if(!deckEmpty){
        //         drawCard(p);
        //     }
        //     return true;
        // } else if (played.getNumber() == 10 || played.getNumber() == 2 || played.getNumber() == 1){
        //     p.removeFromHand(pos);
        //     playedCards.push(played);
        //     if(!deckEmpty){
        //         drawCard(p);
        //     }
        //     return true;
        // } else {
        //     return false;
        // }
    }


    /**
     * Plays a random card facedown 
     * 
     * @param play the player that the game is playing cards facedown for
     */
    public void placeBottom(player play){
        play.getFaceDown().add(deck.cardDeck.pop());
    }

    /**
     * Gives a player a card from the deck
     * 
     * @param play the player that is trying to draw a card
     * @return boolean indicating whether or not the card is drawn
     */
    public boolean drawCard(player play){
        card drawn = deck.draw();
        if(drawn == null){
            return false;
        } else {
            play.addToHand(drawn);
            return true;
        }
    }

    /**
     * A method to play a card from the faceup cards on the table
     * 
     * @param pos the position of the card being played
     * @param p the player attempting to play a card
     * @return a boolean representing whether or not the card was played.
     */
    public boolean playTop(int pos, player p){
        card played = p.getFaceUp().get(pos);
        if(pos >= p.getFaceUp().size() || p.getHand().size() != 0 || !checkPlay(played)){
            return false;
        }
        else{
            p.removeTop(pos);
            playedCards.push(played);
            return true;
        }
        // if(top == null){
        //     p.removeTop(pos);
        //     playedCards.push(played);
        //     return true;
        // }else if(top.getNumber() == 1 && played.getNumber() != 1 && played.getNumber() != 2 && played.getNumber() != 10){
        //     return false;
        // } else if(played.getNumber() >= top.getNumber()){
        //     p.removeTop(pos);
        //     playedCards.push(played);
        //     return true;
        // } else if (played.getNumber() == 10 || played.getNumber() == 2 || played.getNumber() == 1){
        //     p.removeTop(pos);
        //     playedCards.push(played);
        //     return true;
        // } else {
        //     return false;
        // }
    }

    /**
     * Helper method to determine if a card can be played
     * 
     * @param c the card being played
     * @return a boolean representing whether or not the card can be played
     */
    public boolean checkPlay(card c){
        card top = playedCards.peek();
        if(top == null){
            return true;
        }else if(top.getNumber() == 1 && c.getNumber() != 1 && c.getNumber() != 2 && c.getNumber() != 10){
            return false;
        } else if(c.getNumber() >= top.getNumber()){
            return true;
        } else if (c.getNumber() == 10 || c.getNumber() == 2 || c.getNumber() == 1){
            return true;
        } else {
            return false;
        }
    }

    /**
     * Getter method to get the deck in the current game
     * 
     * @return the deck in the current game
     */
    public deck getDeck(){
        return deck;
    }

    /**
     * Getter method to get the table in the current game
     * 
     * @return the table in the current game
     */
    public table getTable(){
        return table;
    }

    /**
     * Getter method to get the first player in the current game
     * 
     * @return the first player in the current game
     */
    public player getPlayer1(){
        return  player1;
    }

    /**
     * Getter method to get the second player in the current game
     * 
     * @return the second player in the current game
     */
    public player getPlayer2(){
        return player2;
    }

    /**
     * Getter method to get the stack of played cards
     * 
     * @return the stack of cards that have been played
     */
    public Stack<card> getPlayed(){
        return playedCards;
    }

    /**
     * Getter method to get the top card of the played cards
     * 
     * @return the top card of the played cards
     */
    public card getTopCard(){
        return playedCards.peek();
    }



    
}
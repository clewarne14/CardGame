package main;

public class card{
    private int suit; //Suit will be either clubs, diamonds, hearts or spades. Diamonds are 0, hearts are 1, clubs are 2 and spades are 3
    //private boolean color; //Suit will determine color, either red or black. Red is true and Black is false
    private int number; //number will be number on the card. 11 will be jack, 12 will be queen, 13 will be king

    public card(int numInput, int suitInput){
        this.suit = suitInput;
       // this.color = colorInput;
        this.number = numInput;
    }

    public int getSuit(){
        return this.suit;
    }
    //public boolean getColor(){
      //  return this.color;
    //}
    public int getNumber(){
        return this.number;
    }
    public boolean playCard(card top){
        if(number > top.getNumber()){
            return true;
        } else if (number == 10 || number == 2 || number == 1){
            return true;
        } else {
            return false;
        }
    }

}
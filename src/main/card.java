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
    public String toString(){
        String suitOutput = "";
        String numOutput = "";
        switch(suit){
            case 0: suitOutput = "diamonds";
                    break;
            case 1: suitOutput = "hearts";
                    break;
            case 2: suitOutput = "clubs";
                    break;
            case 3: suitOutput = "spades";
                    break;

        }
        switch(number){
            case 1: numOutput = "ace";
                    break;
            case 2: numOutput = "two";
                    break;
            case 3: numOutput = "three";
                    break;
            case 4: numOutput = "four";
                    break;
            case 5: numOutput = "five";
                    break;
            case 6: numOutput = "six";
                    break;
            case 7: numOutput = "seven";
                    break;
            case 8: numOutput = "eight";
                    break;
            case 9: numOutput = "nine";
                    break;
            case 10: numOutput = "ten";
                    break;
            case 11: numOutput = "jack";
                    break;      
            case 12: numOutput = "queen";
                    break;
            case 13: numOutput = "king";
                    break;
        }
        String output = numOutput + " of " + suitOutput;
        return output;
    }


}
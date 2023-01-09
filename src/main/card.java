package main;

public class card{
    private int suit; //Suit will be either clubs, diamonds, hearts or spades. Diamonds are 0, hearts are 1, clubs are 2 and spades are 3
    //private boolean color; //Suit will determine color, either red or black. Red is true and Black is false
    private int number; //number will be number on the card. 11 will be jack, 12 will be queen, 13 will be king

    /*
     * Constructor to declare the number and suit of the card.
     */
    public card(int numInput, int suitInput){
        this.suit = suitInput;
       // this.color = colorInput;
        this.number = numInput;
    }

    /*
     * Getter method to get the suit of the given card
     */
    public int getSuit(){
        return this.suit;
    }

    /*
     * Getter method to return the number of the given card
     */
    public int getNumber(){
        return this.number;
    }
    /*
     * Prints value of the given card in the form of a string
     * Card prints out in the form of "Ace of diamonds"
     */
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
            case 1: numOutput = "Ace";
                    break;
            case 2: numOutput = "Two";
                    break;
            case 3: numOutput = "Three";
                    break;
            case 4: numOutput = "Four";
                    break;
            case 5: numOutput = "Five";
                    break;
            case 6: numOutput = "Six";
                    break;
            case 7: numOutput = "Seven";
                    break;
            case 8: numOutput = "Eight";
                    break;
            case 9: numOutput = "Nine";
                    break;
            case 10: numOutput = "Ten";
                    break;
            case 11: numOutput = "Jack";
                    break;      
            case 12: numOutput = "Queen";
                    break;
            case 13: numOutput = "King";
                    break;
        }
        String output = numOutput + " of " + suitOutput;
        return output;
    }


}
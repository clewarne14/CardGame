package main;

import java.util.Scanner;

public class controller {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        gameInstance g = new gameInstance(1, 2);
        player p = g.getPlayer1();
        while (p.getFaceUp().size() < 3) {
            System.out.print("\nYour cards are: ");
            for (int i = 0; i < p.getHand().size(); i++) {
                System.out.print(p.getHand().get(i) + ", ");
            }
            System.out.print("\nYour top cards are: ");
            for (int i = 0; i < p.getFaceUp().size(); i++) {
                System.out.print(p.getFaceUp().get(i) + ", ");
            }
            System.out.print("\nChoose a card to place on top: ");
            int i = scan.nextInt();
            if (!p.placeTop(i - 1)) {
                System.out.println("You chose an invalid card. Please choose again.");
            }

        }
        while (p.getFaceDown().size() > 0) {
            System.out.print("\nYour cards are: ");
            for (int i = 0; i < p.getHand().size(); i++) {
                System.out.print(p.getHand().get(i) + ", ");
            }
            System.out.print("\nYour top cards are: ");
            for (int i = 0; i < p.getFaceUp().size(); i++) {
                System.out.print(p.getFaceUp().get(i) + ", ");
            }
            if (!g.getPlayed().isEmpty()) {
                System.out.print("\nThe faceup card is: " + g.getTopCard());
            } else {
                System.out.print("\nThere is no faceup card, play anything!");
            }
            if (!p.getHand().isEmpty()) {
                // System.out.println("Which face up card would you like to play?");
                System.out.print("\nChoose a card from your hand to play: ");
                String inp = scan.next();
                if (inp.equals("Pass")) {
                    g.pickUpAll(p);
                } else {
                    int i = Integer.parseInt(inp);
                    if (!g.playCard(i - 1, p)) {
                        System.out.println("This is not a valid choice. Please choose again");
                    }
                }
                System.out.println("/n/n/n/n/n/n/n");
            }
        }
    }
}

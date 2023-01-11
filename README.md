# CardGame

This is a card game that I learned how to play thanks to my friends in college. The overall purpose of the game is to get rid of all of your cards.

## Setup

Each player is given six cards from the deck and three cards are placed facedown and are not visible to the players.

Each player must then choose three cards to place faceup on top of the already facedown cards. Each player should now have three cards in their hand.

One card from the deck will be flipped over to begin play.

## First Stage

The player left of the dealer begins by placing a card faceup on top of the card flipped from the deck. The player only play a card with a number either equal to or higher than the faceup card. The player then picks up a card from the deck, if there are any cards still in the deck, and play moves to the next player.

If it is not possible for a player to play a card with a number equal to or higher than the faceup card, they must pick up all of the cards that are faceup on the pile. They also have the option to do this if they can play but decide not to.

A player can play any number of cards that have the same number as they have in their hand. For example, if a player has the eight of diamonds and the eight of spades, they can play them on at the same time, provided the number faceup is less than eight.

## Second Stage

Once a player has no cards in their hand while there are no cards in the deck, they must play from their faceup cards.

All players have knowledge of these three cards and can reference them anytime, meaning that they can play to keep each other from winning.

## Third Stage

Once a player has no faceup cards left on the table and no cards in their hand, they must play from their facedown cards without looking.

If the card flipped is not greater than or equal to the card last played, the player must pick up all of the played cards.

Once one player plays all of their facedown cards and have no cards left in their hand, they win the game!

# Special Rules

**There are multiple special rules that are in play for this game listed below:**

- Four of a kind: If, at any point, four of the same number are played faceup in a row, this constitutes a bomb, meaning that all of the played cards are discarded, and whoever played the final card of that number has a free play.
- Ten: A ten is a special number and can be played on any other number, regardless of whether it is greater than or less than ten. A ten also constitutes a bomb and, when it is played, all of the played cards are discarded.
- Two: A two is another special number and can be played on any other number. A two is considered a skip and skips the player who used it, along with giving the next player a free play to use whatever card they want, even if it is less than the previous number.

**There are two more optional rules that may be implemented later.**

- Three: A three is another special number and can be played on any other number. A three is considered a mirror and is equivalent to playing the exact same card that was played previously. For example, if an eight is played, and then a three, the three essentially turns into another eight, and the next player must then play greater than an eight as well. This also affects the four of a kind rule, if there are three eight cards and a player plays a three, this will constitute a bomb.
- Seven: A seven is another special number but can only be played in sequence, that is, only on a card less than or equal to a seven. A seven flips the next play so that only a card lower than a seven can be played. For example, after a seven is played, a five can be played, but not an eight. This also affects tens, and they cannot be played immediately after a seven. After the next card is played, as long as it is not another seven, play flips back and continues normally.

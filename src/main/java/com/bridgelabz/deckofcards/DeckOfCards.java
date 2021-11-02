package com.bridgelabz.deckofcards;

public class DeckOfCards {
    // Create the method for uniqueCards
    public void uniqueCards() {
        String[] cards = new String[52];
        String[] suit = {"Club", "Diamond", "Heart", "Spade"};
        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Ace", "King", "Queen", "Jack"};
        int position = 0;
        for (int i = 0; i < suit.length; i++) {
            for (int j = 0; j < rank.length; j++) {

                cards[position] = suit[i] + rank[j];
                System.out.println(cards[position] = suit[i] + " " + "->" + " " + rank[j]);
            }
        }
    }
}

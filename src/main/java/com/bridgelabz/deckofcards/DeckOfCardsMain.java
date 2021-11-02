package com.bridgelabz.deckofcards;

/**
 * Workshop on Deck Of Cards Game
 *
 * @author : Akshay
 * @version : 8.0
 * @since : 02/11/2021
 */
public class DeckOfCardsMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Deck Of Cards Game.!!!");
        // create the object for PlayCards
        DeckOfCards cardsPlay = new DeckOfCards();
        // call to main method
        cardsPlay.uniqueCards();
    }
}

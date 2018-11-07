package com.example.bruce.triples_1_5;

import org.junit.Test;

import static org.junit.Assert.*;

public class DeckTest {

    Deck deck1 = new Deck(54);

    @Test
    public void getNumCardsInDeck() {
        int expected = 55;
        int results = deck1.getNumCardsInDeck();
        assertEquals(expected, results);
    }

    @Test
    public void getTopCard() {
        for(int i = 0; i < 55; i ++) {
            Card expected = deck1.getCard(0);
            Card results = deck1.getTopCard();
            assertEquals(expected, results);
        }

        //tests when deck1 has no cards. getBlank returns the blank card mOrderedDeck[0]
        Card expected = deck1.getBlank();
        Card results = deck1.getTopCard();
        assertEquals(expected, results);
    }

    @Test
    public void createShuffledDeck() {
        Deck deck = new Deck(81);
        Card topCard;
        Card nextCard;
        for(int i = 0; i < 40; i++) {
            topCard = deck.getTopCard();
            nextCard = deck.getTopCard();
            assertTrue(!topCard.equals(nextCard));
        }
    }
}
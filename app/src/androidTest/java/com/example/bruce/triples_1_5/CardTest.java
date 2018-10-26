package com.example.bruce.triples_1_5;

import org.junit.Test;
import android.support.v7.app.AppCompatActivity;
import static org.junit.Assert.*;

public class CardTest {

    Card card1 = new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 0, 0, true);
    Card card2 = new Card(Card.Shape.SQUARE, Card.Color.BLUE, 1, 1, false);
    Card card3 = new Card(Card.Shape.TRIANGLE, Card.Color.RED, 2, 2, true);

    @Test
    public void getShape() {
    }

    @Test
    public void getColor() {
    }

    @Test
    public void getNumber() {
        int [] expected = {0, 1, 2};
        int [] results = {card1.getNumber(), card2.getNumber(), card3.getNumber()};
        assertTrue(expected == results);
    }

    @Test
    public void getAlpha() {
    }

    @Test
    public void getImageID() {
    }
}
package com.example.bruce.triples_1_5;

import org.junit.Test;
import static org.junit.Assert.*;

public class CardTest{

    Card card1 = new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 1, 0,R.drawable.circle_green_1_0, R.drawable.circle_green_1_0_selected);
    Card card2 = new Card(Card.Shape.SQUARE, Card.Color.BLUE, 2, 1, R.drawable.square_blue_2_1, R.drawable.square_blue_2_1_selected);
    Card card3 = new Card(Card.Shape.TRIANGLE, Card.Color.RED, 3, 2, R.drawable.triangle_red_3_2, R.drawable.triangle_red_3_2_selected);
    Card card4 = new Card(Card.Shape.NOSHAPE, Card.Color.NOCOLOR, 1,0, R.drawable.blank_0_0_0, R.drawable.blank_0_0_0);

    @Test
    public void getShape() {
        Card.Shape [] expected = {Card.Shape.CIRCLE, Card.Shape.SQUARE, Card.Shape.TRIANGLE, Card.Shape.NOSHAPE};
        Card.Shape [] results = {card1.getShape(), card2.getShape(), card3.getShape(), card4.getShape()};
        assertArrayEquals(expected,results);
    }

    @Test
    public void getColor() {
        Card.Color [] expected = {Card.Color.GREEN, Card.Color.BLUE, Card.Color.RED, Card.Color.NOCOLOR};
        Card.Color [] results = {card1.getColor(), card2.getColor(), card3.getColor(), card4.getColor()};
        assertArrayEquals(expected,results);
    }

    @Test
    public void getNumber() {
        int [] expected = {1, 2, 3};
        int [] results = {card1.getNumber(), card2.getNumber(), card3.getNumber()};
        assertArrayEquals(expected,results);
    }

    @Test
    public void getAlpha() {
        int [] expected = {0, 1, 2};
        int [] results = {card1.getAlpha(), card2.getAlpha(), card3.getAlpha()};
        assertArrayEquals(expected,results);
    }

    @Test
    public void getImageID() {
        int [] expected = {R.drawable.circle_green_1_0, R.drawable.square_blue_2_1, R.drawable.triangle_red_3_2};
        int [] results = {card1.getImageID(), card2.getImageID(), card3.getImageID()};
        assertArrayEquals(expected,results);
    }

    @Test
    public void getSelectedImageID() {
        int [] expected = {R.drawable.circle_green_1_0_selected, R.drawable.square_blue_2_1_selected, R.drawable.triangle_red_3_2_selected};
        int [] results = {card1.getSelectedImageID(), card2.getSelectedImageID(), card3.getSelectedImageID()};
        assertArrayEquals(expected,results);
    }

    //Tests both get and set is selected.
    @Test
    public void getAndSetIsSelected() {
        card1.setIsSelected();
        card2.setIsSelected();
        boolean [] expected = {true, true, false};
        boolean [] results = {card1.getIsSelected(), card2.getIsSelected(), card3.getIsSelected()};
        assertArrayEquals(expected, results);
    }

}

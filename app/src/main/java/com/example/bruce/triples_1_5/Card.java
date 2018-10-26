package com.example.bruce.triples_1_5;

public class Card {
    private Shape mShape;
    private Color mColor;
    private int mNumber;
    private int mAlpha;
    private boolean mIsSelected;


    public Card(Shape shape, Color color, int number, int alpha, boolean isSelected) {
        mShape = shape;
        mColor = color;
        mNumber = number;
        mIsSelected = isSelected;
    }

    /*********************
     * Enums
     *********************/
    public enum Shape {
        NOSHAPE, CIRCLE, SQUARE, TRIANGLE;
    }

    public enum Color {
        NOCOLOR, GREEN, BLUE, RED;
    }

    /*********************
     * Getters and Setters
     *********************/

    public Shape getShape() {
        return mShape;
    }

    public Color getColor() {
        return mColor;
    }

    public int getNumber() {
        return mNumber;
    }

    public int getAlpha() {
        return mAlpha;
    }

    public String getImageID() {
        String id = mShape + "_" + mColor + "_" + mNumber + "_" + mAlpha;
        return id.toLowerCase();
    }

    public String getSelectedImageID() {
        String id = mShape + "_" + mColor + "_" + mNumber + "_" + mAlpha + "_selected";
        return id.toLowerCase();
    }

    public void setIsSelected()
    {
        mIsSelected = true;
    }

    public boolean getIsSelected()
    {
        return mIsSelected;
    }

}





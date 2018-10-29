package com.example.bruce.triples_1_5;

import android.widget.TextView;

public class Card {
    private Shape mShape;
    private Color mColor;
    private int mNumber;
    private int mAlpha;
    private boolean mIsSelected;
    private int mImageID;
    private int mSelectedImageID;


    public Card(Shape shape, Color color, int number, int alpha, int imageID, int selectedImageID) {
        mShape = shape;
        mColor = color;
        mNumber = number;
        mAlpha = alpha;
        mImageID = imageID;
        mSelectedImageID = selectedImageID;
        mIsSelected = false;
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

    public int getImageID() {
        return mImageID;
    }

    public int getSelectedImageID() {
        return mSelectedImageID;
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





package com.example.bruce.triples_1_5;

import android.content.Context;

import java.util.ArrayList;
import android.content.Context;
import java.util.ArrayList;

    public class GameModel {
        private Deck deck;
        private ArrayList<Card> mCardOnBoard;
        private ArrayList<Integer> mSelectedCards;
        private long mStartTime;
        private int mScore, mTriplesRemaining, mLevel;

        GameModel(int numOfCardsInDeck, int level){
            deck = new Deck(numOfCardsInDeck);
            mCardOnBoard = new ArrayList<>();
            mSelectedCards = new ArrayList<>();
            mScore = 0;
            mTriplesRemaining = deck.getNumCardsInDeck() / 3;
            mLevel = level;
        }

        /*************************************************
        * Getters and Setters
        *************************************************/
        protected Card getCardOnBoard(int index) {
            return mCardOnBoard.get(index);
        }

        protected int getNumOfCardsSelected( ) {
            return mSelectedCards.size();
        }

        protected int getNumOfCardsInDeck( ) {
            return deck.getNumCardsInDeck();
        }

        protected int getSelectedCardIndex(int index) {
            return mSelectedCards.get(index);
        }

        protected void setStartTime() {
            mStartTime = System.currentTimeMillis();
        }

        protected void setTriplesRemaining() {
            mTriplesRemaining--;
        }

        /*************************************************
         * Methods that place cards to board
         *************************************************/
        protected void addCardToBoard(){
            mCardOnBoard.add(deck.getTopCard());
        }

        protected void replaceCardOnBoard(int index){
            mCardOnBoard.set(index, deck.getTopCard());
        }

        /*************************************************
         * Methods that keep track of selected cards
         *************************************************/

        protected void addSelectedCardIndex(int cardIndex){
            mSelectedCards.add(cardIndex);
        }

        protected void removeSelectedCardIndex(int cardIndex){
            mSelectedCards.remove(Integer.valueOf(cardIndex));
        }

        protected void resetSelectedCardIndices(){
            mSelectedCards.clear();
        }

        /*************************************************
         * Scoring
         *************************************************/
        protected int updateScore() {
            //the scores are numbers divisible by 5
            long endTime = System.currentTimeMillis();
            int time = (int) ((endTime - mStartTime) / 200) * mLevel;
            while (!(time % 5 == 0))
                time ++;
            mScore += time;
            return mScore;
        }

        /*************************************************
         * Methods that determine play
         *************************************************/

        protected boolean isTriple(int firstCard, int secondCard, int thirdCard) {
            Card card1 = getCardOnBoard(firstCard);
            Card card2 = getCardOnBoard(secondCard);
            Card card3 = getCardOnBoard(thirdCard);

            if (((card1.getNumber() + card2.getNumber() + card3.getNumber()) % 3 == 0)
                    && ((card1.getShape().ordinal() + card2.getShape().ordinal() + card3.getShape().ordinal()) % 3 == 0)
                    && ((card1.getColor().ordinal() + card2.getColor().ordinal() + card3.getColor().ordinal()) % 3 == 0)
                    && ((card1.getAlpha() + card2.getAlpha() + card3.getAlpha() % 3 == 0)))
                return true;
            else
                return false;
        }

        protected boolean playIsPossible(){
            // to be implemented
            return true;  // temporary placeholder until implementation
        }

        protected String getGameOverMessage(Context context){
            String message = context.getString(R.string.game_over);
            if(mTriplesRemaining > 0)
                message = "      " + message + "\n" + context.getString(R.string.play_not_possible);
            return message;
        }
    }







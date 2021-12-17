package com.github.mathieusoysal.codingame_stats.minifiedpuzzle;

import java.util.*;

/**
 * 
 */
public class MinifiedPuzzle {

    /**
     * Default constructor
     */
    public MinifiedPuzzle() {
    }

    /**
     * 
     */
    private int id;

    /**
     * 
     */
    private int validatorScore;

    /**
     * 
     */
    private boolean submitted;

    /**
     * 
     */
    private long creationTime;

    /**
     * 
     */
    private int rank;

    /**
     * 
     */
    private int solvedcount;

    /**
     * 
     */
    private PuzzleLevel level;

    /**
     * 
     */
    private FeedBack feedBack;

    public int getId() {
        return id;
    }

    public int getValidatorScore() {
        return validatorScore;
    }

    public long getCreationTime() {
        return creationTime;
    }

    public int getRank() {
        return rank;
    }

    public int getSolvedcount() {
        return solvedcount;
    }

    public PuzzleLevel getLevel() {
        return level;
    }

    public FeedBack getFeedBack() {
        return feedBack;
    }

    public boolean isSubmitted() {
        return submitted;
    }

}
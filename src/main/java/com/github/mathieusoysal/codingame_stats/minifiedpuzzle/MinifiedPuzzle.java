package com.github.mathieusoysal.codingame_stats.minifiedpuzzle;


/**
 * 
 */
public class MinifiedPuzzle {

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
    private Feedback feedback;

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

    public Feedback getFeedback() {
        return feedback;
    }

    public boolean isSubmitted() {
        return submitted;
    }

    public Object isCommunityCreation() {
        return null;
    }

}
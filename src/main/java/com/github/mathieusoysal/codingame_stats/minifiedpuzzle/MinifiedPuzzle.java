package com.github.mathieusoysal.codingame_stats.minifiedpuzzle;

import java.util.Date;

/**
 * 
 * MinifiedPuzzle is a class that represents a minified puzzle in the
 * codingame.com, the class is used when we get all puzzles from CodinGame's
 * API.
 * 
 * @author Mathieu Soysal
 */
public class MinifiedPuzzle {

    /**
     * The id of the puzzle.
     */
    private int id;

    /**
     * The validatorScore of the puzzle. 
     */
    private int validatorScore;

    /**
     * If si submitted to CodinGame puzzles or not.
     */
    private boolean submitted;

    /**
     * The date in time of the creation of the puzzle.
     */
    private long creationTime;

    /**
     * The rank of the puzzle.
     */
    private int rank;

    /**
     * The number of user who have solved the puzzle.
     */
    private int solvedCount;

    /**
     * The level of the puzzle.
     * @see com.github.mathieusoysal.codingame_stats.minifiedpuzzle.PuzzleLevel
     */
    private PuzzleLevel level;

    /**
     * The feedbacks of user who have solved the puzzle.
     */
    private Feedback feedback;

    /**
     * If is a community creation or not.
     */
    private boolean communityCreation;

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
        return solvedCount;
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

    public boolean isCommunityCreation() {
        return communityCreation;
    }

    public Date getCreatedDate() {
        return new Date(creationTime);
    }

}
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
     * 
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

    /**
     * @return The id of the puzzle.
     */
    public int getId() {
        return id;
    }

    /**
     * @return The validatorScore of the puzzle.
     */
    public int getValidatorScore() {
        return validatorScore;
    }

    /**
     * @return The creationTime of the puzzle in milliseconds.
     * 
     */
    public long getCreationTime() {
        return creationTime;
    }

    /**
     * @return The rank of the puzzle.
     */
    public int getRank() {
        return rank;
    }

    /**
     * @return The number of user who have solved the puzzle.
     */
    public int getSolvedcount() {
        return solvedCount;
    }

    /**
     * @return The level of the puzzle.
     * @see com.github.mathieusoysal.codingame_stats.minifiedpuzzle.PuzzleLevel
     */
    public PuzzleLevel getLevel() {
        return level;
    }

    /**
     * @return The feedbacks of user who have solved the puzzle.
     * @see com.github.mathieusoysal.codingame_stats.minifiedpuzzle.Feedback
     */
    public Feedback getFeedback() {
        return feedback;
    }

    /**
     * @return true if the puzzle is submitted to CodinGame, false otherwise.
     */
    public boolean isSubmitted() {
        return submitted;
    }

    /**
     * @return true if the puzzle is from community, false otherwise.
     */
    public boolean isCommunityCreation() {
        return communityCreation;
    }

    /**
     * @return The date of the creation of the puzzle.
     * @see java.util.Date
     */
    public Date getCreatedDate() {
        return new Date(creationTime);
    }

}
package com.github.mathieusoysal.codingame_stats.minifiedpuzzle;

import com.google.gson.annotations.SerializedName;

/**
 * 
 * PuzzleLevel class is used to represent the level of a puzzle.
 * 
 * @author Mathieu Soysal
 */
public enum PuzzleLevel {
    /**
     * The tutorial level.
     */
    @SerializedName("tutorial")
    TUTORIAL,

    /**
     * The easy difficulty level.
     */
    @SerializedName("easy")
    EASY,

    /**
     * The medium difficulty level.
     */
    @SerializedName("medium")
    MEDIUM,

    /**
     * The hard difficulty level.
     */
    @SerializedName("hard")
    HARD,

    /**
     * The expert difficulty level.
     */
    @SerializedName("expert")
    EXPERT,

    /**
     * The multi special level.
     */
    @SerializedName("multi")
    MULTI,

    /**
     * The Code Golf special level.
     */
    @SerializedName("codegolf")
    CODEGOLF,

    /**
     * The optimization special level.
     */
    @SerializedName("optim")
    OPTIM;

    /**
     * @return true if is a special level, false if is a normal level.
     */
    public boolean isSpecialLevel() {
        return this == TUTORIAL || this == MULTI || this == CODEGOLF || this == OPTIM;
    }

}
package com.github.mathieusoysal.codingame_stats.minifiedpuzzle;

import com.google.gson.annotations.SerializedName;

/**
 * 
 */
public enum PuzzleLevel {
    @SerializedName("tutorial")
    TUTORIAL,
    @SerializedName("easy")
    EASY,
    @SerializedName("medium")
    MEDIUM,
    @SerializedName("hard")
    HARD,
    @SerializedName("expert")
    EXPERT,
    @SerializedName("multi")
    MULTI,
    @SerializedName("codegolf")
    CODEGOLF,
    @SerializedName("optim")
    OPTIM;


    public boolean isSpecialLevel() {
        return this == TUTORIAL || this == MULTI || this == CODEGOLF || this == OPTIM;
    }

}
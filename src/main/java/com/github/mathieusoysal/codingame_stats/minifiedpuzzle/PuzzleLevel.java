package com.github.mathieusoysal.codingame_stats.minifiedpuzzle;

/**
 * 
 */
public enum PuzzleLevel {
    MEDIUM("medium"),
    HARD("hard"),
    MULTI("multi"),
    EXPERT("expert"),
    EASY("easy"),
    CODEGOLF("codegolf"),
    OPTIM("optim"),
    TUTORIAL("tutorial");

    private String value;

    private PuzzleLevel(String value) {
        this.value = value;
    }

}
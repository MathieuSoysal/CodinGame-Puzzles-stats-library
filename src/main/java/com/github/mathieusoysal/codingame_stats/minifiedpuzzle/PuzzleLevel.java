package com.github.mathieusoysal.codingame_stats.minifiedpuzzle;

/**
 * 
 */
public enum PuzzleLevel {
    TUTORIAL("tutorial"),
    EASY("easy"),
    MEDIUM("medium"),
    HARD("hard"),
    EXPERT("expert"),
    MULTI("multi"),
    CODEGOLF("codegolf"),
    OPTIM("optim");

    private String value;

    public static PuzzleLevel fromValue(String value) {
        value = value.toLowerCase();
        for (PuzzleLevel puzzleLevel : PuzzleLevel.values())
            if (puzzleLevel.value.equals(value))
                return puzzleLevel;
        throw new IllegalArgumentException(value);
    }

    private PuzzleLevel(String value) {
        this.value = value;
    }

    public boolean isSpecialLevel() {
        return this == TUTORIAL || this == MULTI || this == CODEGOLF || this == OPTIM;
    }

}
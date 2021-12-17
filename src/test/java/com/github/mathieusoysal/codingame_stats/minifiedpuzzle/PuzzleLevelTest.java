package com.github.mathieusoysal.codingame_stats.minifiedpuzzle;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.lessThan;
import org.junit.jupiter.api.Test;

public class PuzzleLevelTest {

    @Test
    public void testComparator() {
        assertThat(PuzzleLevel.TUTORIAL, lessThan(PuzzleLevel.EASY));
        assertThat(PuzzleLevel.EASY, lessThan(PuzzleLevel.MEDIUM));
        assertThat(PuzzleLevel.MEDIUM, lessThan(PuzzleLevel.HARD));
        assertThat(PuzzleLevel.HARD, lessThan(PuzzleLevel.EXPERT));
    }

}

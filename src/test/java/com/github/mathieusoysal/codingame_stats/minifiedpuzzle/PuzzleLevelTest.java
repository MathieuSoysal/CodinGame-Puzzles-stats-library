package com.github.mathieusoysal.codingame_stats.minifiedpuzzle;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
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

    @Test
    public void testIsSpecialLevel(){
        assertThat(PuzzleLevel.TUTORIAL.isSpecialLevel(), is(true));
        assertThat(PuzzleLevel.EASY.isSpecialLevel(), is(false));
        assertThat(PuzzleLevel.MEDIUM.isSpecialLevel(), is(false));
        assertThat(PuzzleLevel.HARD.isSpecialLevel(), is(false));
        assertThat(PuzzleLevel.EXPERT.isSpecialLevel(), is(false));
        assertThat(PuzzleLevel.MULTI.isSpecialLevel(), is(true));
        assertThat(PuzzleLevel.CODEGOLF.isSpecialLevel(), is(true));
        assertThat(PuzzleLevel.OPTIM.isSpecialLevel(), is(true));
    }

}

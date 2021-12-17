package com.github.mathieusoysal.codingame_stats;

import com.github.mathieusoysal.codingame_stats.puzzle.Puzzle;
import java.util.List;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;

public class CodinGameTest {

    @Test
    public void testGetPuzzles() {
        CodinGame codinGame = new CodinGame();
        List<Puzzle> puzzles = codinGame.getPuzzles();
        assertThat(puzzles.size(), greaterThan(0));
    }

}

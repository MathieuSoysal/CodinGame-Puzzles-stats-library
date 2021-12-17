package com.github.mathieusoysal.codingame_stats;

import com.github.mathieusoysal.codingame_stats.minifiedpuzzle.MinifiedPuzzle;
import com.github.mathieusoysal.codingame_stats.puzzle.Puzzle;
import java.util.List;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class CodinGameTest {

    @Disabled("TODO: implement")
    @Test
    public void testGetPuzzles() {
        CodinGame codinGame = new CodinGame();
        List<Puzzle> puzzles = codinGame.getPuzzles();
        assertThat(puzzles.size(), greaterThan(0));
    }

    @Test
    void testAllMinifiedPuzzles() {
        CodinGame codinGame = new CodinGame();
        List<MinifiedPuzzle> minifiedPuzzles = codinGame.getAllMinifiedPuzzles();
        assertThat(minifiedPuzzles.size(), greaterThan(0));
    }

    @Test
    void testAllMinifiedPuzzlesNotNull() {
        CodinGame codinGame = new CodinGame();
        List<MinifiedPuzzle> minifiedPuzzles = codinGame.getAllMinifiedPuzzles();
        assertThat(minifiedPuzzles, everyItem(notNullValue()));
    }

    @Test
    void testAllMinifiedPuzzlesNotNullId() {
        CodinGame codinGame = new CodinGame();
        List<MinifiedPuzzle> minifiedPuzzles = codinGame.getAllMinifiedPuzzles();
        assertThat(minifiedPuzzles, everyItem(hasProperty("id", notNullValue())));
    }

}

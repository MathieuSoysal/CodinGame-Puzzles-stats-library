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
    void testGetAllMinifiedPuzzles() {
        CodinGame codinGame = new CodinGame();
        List<MinifiedPuzzle> minifiedPuzzles = codinGame.getAllMinifiedPuzzles();
        assertThat(minifiedPuzzles.size(), greaterThan(0));
    }

    @Test
    void testGetAllMinifiedPuzzlesNotNull() {
        CodinGame codinGame = new CodinGame();
        List<MinifiedPuzzle> minifiedPuzzles = codinGame.getAllMinifiedPuzzles();
        assertThat(minifiedPuzzles, everyItem(notNullValue()));
    }

    @Test
    void testGetAllMinifiedPuzzlesNotNullId() {
        CodinGame codinGame = new CodinGame();
        List<MinifiedPuzzle> minifiedPuzzles = codinGame.getAllMinifiedPuzzles();
        assertThat(minifiedPuzzles, everyItem(hasProperty("id", notNullValue())));
    }

    @Test
    void testGetAllPuzzlesId() {
        CodinGame codinGame = new CodinGame();
        List<Integer> puzzlesId = codinGame.getAllPuzzlesID();
        assertThat(puzzlesId.size(), greaterThan(0));
    }

    @Test
    void testGetAllPuzzlesIdEveryItemNotNull() {
        CodinGame codinGame = new CodinGame();
        List<Integer> puzzlesId = codinGame.getAllPuzzlesID();
        assertThat(puzzlesId, everyItem(notNullValue()));
    }

}

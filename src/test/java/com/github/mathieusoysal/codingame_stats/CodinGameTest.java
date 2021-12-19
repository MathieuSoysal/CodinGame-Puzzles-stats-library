package com.github.mathieusoysal.codingame_stats;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;

import java.util.List;

import com.github.mathieusoysal.codingame_stats.puzzle.Puzzle;

import org.junit.jupiter.api.Test;

class CodinGameTest {

    @Test
    void testGetPuzzles() {
        CodinGame codinGame = new CodinGame();
        List<Puzzle> puzzles = codinGame.getPuzzles();
        assertThat(puzzles.size(), greaterThan(0));
    }

}

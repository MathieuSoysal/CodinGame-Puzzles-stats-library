package com.github.mathieusoysal.codingame_stats.util;

import com.github.mathieusoysal.codingame_stats.minifiedpuzzle.MinifiedPuzzle;
import java.util.List;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.everyItem;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.Matchers.notNullValue;

import org.junit.jupiter.api.Test;

public class CodinGameApiTest {

    @Test
    public void testGetMinifiedPuzzles() {
        List<MinifiedPuzzle> puzzles = CodinGameApi.getAllMinifiedPuzzles();
        assertThat(puzzles.size(), greaterThan(0));
    }

    @Test
    void testGetAllMinifiedPuzzlesNotNull() {
        List<MinifiedPuzzle> minifiedPuzzles = CodinGameApi.getAllMinifiedPuzzles();
        assertThat(minifiedPuzzles, everyItem(notNullValue()));
    }

    @Test
    void testGetAllMinifiedPuzzlesNotNullId() {
        List<MinifiedPuzzle> minifiedPuzzles = CodinGameApi.getAllMinifiedPuzzles();
        assertThat(minifiedPuzzles, everyItem(hasProperty("id", notNullValue())));
    }

}

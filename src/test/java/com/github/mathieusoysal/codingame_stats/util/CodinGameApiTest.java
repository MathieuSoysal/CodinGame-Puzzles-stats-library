package com.github.mathieusoysal.codingame_stats.util;

import com.github.mathieusoysal.codingame_stats.minifiedpuzzle.Feedback;
import com.github.mathieusoysal.codingame_stats.minifiedpuzzle.MinifiedPuzzle;
import java.util.List;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.everyItem;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.Matchers.notNullValue;

import org.junit.jupiter.api.Nested;
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

    @Nested
    class propertyTest {
        List<MinifiedPuzzle> minifiedPuzzles = CodinGameApi.getAllMinifiedPuzzles();

        @Test
        void testGetAllMinifiedPuzzlesNotNullId() {
            assertThat(minifiedPuzzles, everyItem(hasProperty("id", notNullValue())));
        }

        @Test
        void testGetAllMinifiedPuzzlesNotNullLevel() {
            assertThat(minifiedPuzzles.stream().filter(p -> p.getLevel() != null).toList().size(), greaterThan(0));
        }

        @Test
        void testGetAllMinifiedPuzzlesNotNullValidatorScore() {
            assertThat(minifiedPuzzles, everyItem(hasProperty("validatorScore", notNullValue())));
        }

        @Test
        void testGetAllMinifiedPuzzlesNotNullSubmitted() {
            assertThat(minifiedPuzzles, everyItem(hasProperty("submitted", notNullValue())));
        }

        @Test
        void testGetAllMinifiedPuzzlesNotNullCreationTime() {
            assertThat(minifiedPuzzles, everyItem(hasProperty("creationTime", notNullValue())));
        }

        @Test
        void testGetAllMinifiedPuzzlesNotNullRank() {
            assertThat(minifiedPuzzles, everyItem(hasProperty("rank", notNullValue())));
        }

        @Test
        void testGetAllMinifiedPuzzlesNotNullSolvedCount() {
            assertThat(minifiedPuzzles, everyItem(hasProperty("solvedcount", notNullValue())));
        }

        @Test
        void testGetAllMinifiedPuzzlesNotNullFeedBack() {
            assertThat(minifiedPuzzles.stream().filter(p -> p.getFeedback() != null).toList().size(), greaterThan(0));
        }

    }
}

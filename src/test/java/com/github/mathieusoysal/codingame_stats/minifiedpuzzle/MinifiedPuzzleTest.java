package com.github.mathieusoysal.codingame_stats.minifiedpuzzle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import com.google.gson.Gson;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class MinifiedPuzzleTest {

    @Nested
    class ConversionFromJsonTest {
        final static String JSON_MINIFIED_PUZZLE = """
                {
                    \"id\": 250,
                    \"level\": \"hard\",
                    \"validatorScore\": 0,
                    \"submitted\": false,
                    \"creationTime\": 1482243976674,
                    \"rank\": 0,
                    \"solvedCount\": 506,
                    \"communityCreation\": true,
                    \"feedback\": {
                        \"feedbackId\": 251,
                        \"feedbacks\": [
                            2,
                            2,
                            23,
                            45,
                            54
                        ]
                    }
                }
                """;

        MinifiedPuzzle minifiedPuzzle;

        @BeforeEach
        public void setUp() {
            minifiedPuzzle = new Gson().fromJson(JSON_MINIFIED_PUZZLE, MinifiedPuzzle.class);
        }

        @Test
        void testGetId() {
            assertEquals(250, minifiedPuzzle.getId());
        }

        @Test
        void testGetLevel() {
            assertSame(PuzzleLevel.HARD, minifiedPuzzle.getLevel());
        }

        @Test
        void testGetValidatorScore() {
            assertEquals(0, minifiedPuzzle.getValidatorScore());
        }

        @Test
        void testIsSubmitted() {
            assertEquals(false, minifiedPuzzle.isSubmitted());
        }

        @Test
        void testGetCreationTime() {
            assertEquals(1482243976674L, minifiedPuzzle.getCreationTime());
        }

        @Test
        void testGetRank() {
            assertEquals(0, minifiedPuzzle.getRank());
        }

        @Test
        void testGetSolvedCount() {
            assertEquals(506, minifiedPuzzle.getSolvedcount());
        }

        @Test
        void testIsCommunityCreation() {
            assertEquals(true, minifiedPuzzle.isCommunityCreation());
        }

        @Test
        void testGetFeedback() {
            assertEquals(251, minifiedPuzzle.getFeedback().getFeedbackId());
            assertEquals(5, minifiedPuzzle.getFeedback().getFeedbacks().length);
        }

    }

}

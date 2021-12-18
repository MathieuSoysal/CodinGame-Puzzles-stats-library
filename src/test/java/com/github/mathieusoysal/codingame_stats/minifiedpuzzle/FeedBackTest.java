package com.github.mathieusoysal.codingame_stats.minifiedpuzzle;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.google.gson.Gson;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class FeedBackTest {

    @Test
    void testGetMoy() {
        Feedback feedBack = new Feedback(32, new int[] { 2, 2, 2, 2 });
        assertThat(feedBack.getMoy(), is(2.0));
    }

    @Test
    void testGetNbStarsFrom() {
        Feedback feedBack = new Feedback(32, new int[] { 4, 3, 1, 5 });
        assertEquals(4, feedBack.getNbStarsFor(1));
        assertEquals(3, feedBack.getNbStarsFor(2));
        assertEquals(1, feedBack.getNbStarsFor(3));
        assertEquals(5, feedBack.getNbStarsFor(4));
    }

    @Nested
    class FeedbackConversionFromJsonTest {
        final static String JSON_FEEDBACK = """
                    {
                        \"feedbackId\": 1649,
                        \"feedbacks\": [
                            4,
                            3,
                            1,
                            5
                        ]
                    }
                """;

        Feedback feedback;

        @BeforeEach
        public void setUp() {
            feedback = new Gson().fromJson(JSON_FEEDBACK, Feedback.class);
        }

        @Test
        void testGetFeedbackId() {
            assertEquals(1649, feedback.getFeedbackId());
        }

        @Test
        void testGetFeedbacks() {
            assertArrayEquals(new int[] { 4, 3, 1, 5 }, feedback.getFeedbacks());
        }

    }
}

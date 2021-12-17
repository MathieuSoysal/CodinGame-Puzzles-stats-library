package com.github.mathieusoysal.codingame_stats.minifiedpuzzle;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.google.gson.Gson;

import org.junit.jupiter.api.Test;

public class FeedBackTest {

    @Test
    void testGetMoy() {
        FeedBack feedBack = new FeedBack(32, new int[] { 2, 2, 2, 2 });
        assertThat(feedBack.getMoy(), is(2.0));
    }

    @Test
    void testGetNbStarsFrom() {
        FeedBack feedBack = new FeedBack(32, new int[] { 4, 3, 1, 5 });
        assertEquals(4, feedBack.getNbStarsFor(1));
        assertEquals(3, feedBack.getNbStarsFor(2));
        assertEquals(1, feedBack.getNbStarsFor(3));
        assertEquals(5, feedBack.getNbStarsFor(4));
    }

    @Test
    void testConversionFromJsonFeedBack() {
        String json = "{\"feedbackId\":1649,\"feedbacks\":[4,0,1,16,31]}";
        FeedBack feedBack = new Gson().fromJson(json, FeedBack.class);
        assertEquals(1649, feedBack.getFeedbackId());
    }

    @Test
    void testConversionFromJsonFeedBackWithNullAndEmpty() {
        String json = "{\"feedbackId\":1649,\"feedbacks\":[4,0,1,16,31]}";
        FeedBack feedBack = new Gson().fromJson(json, FeedBack.class);
        assertArrayEquals(new int[] { 4, 0, 1, 16, 31 }, feedBack.getFeedbacks());
    }
}

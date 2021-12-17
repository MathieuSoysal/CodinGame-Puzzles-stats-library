package com.github.mathieusoysal.codingame_stats.minifiedpuzzle;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
}

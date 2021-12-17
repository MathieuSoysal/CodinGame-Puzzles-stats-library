package com.github.mathieusoysal.codingame_stats.puzzle.topic;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.lessThan;
import org.junit.jupiter.api.Test;

public class CategoryTest {

    @Test
    public void testComparator() {
        assertThat(Category.FUNDAMENTALS, lessThan(Category.ADVANCED));
        assertThat(Category.FUNDAMENTALS, lessThan(Category.INTERMEDIATE));
        assertThat(Category.INTERMEDIATE, lessThan(Category.ADVANCED));
    }

}

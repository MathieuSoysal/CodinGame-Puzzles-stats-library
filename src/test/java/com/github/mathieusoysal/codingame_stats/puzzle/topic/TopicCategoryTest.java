package com.github.mathieusoysal.codingame_stats.puzzle.topic;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.jupiter.api.Assertions.assertSame;

import com.google.gson.Gson;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class TopicCategoryTest {

    @Test
    public void testComparator() {
        assertThat(TopicCategory.FUNDAMENTALS, lessThan(TopicCategory.ADVANCED));
        assertThat(TopicCategory.FUNDAMENTALS, lessThan(TopicCategory.INTERMEDIATE));
        assertThat(TopicCategory.INTERMEDIATE, lessThan(TopicCategory.ADVANCED));
    }

    @Nested
    class TestConversionFromJson {
        private class TestClassConversion {

            public TopicCategory category;

        }

        @Test
        public void testConversionWithFundamentals() {
            String json = "{\"category\":\"FUNDAMENTALS\"}";
            TestClassConversion testLevel = new Gson().fromJson(json, TestClassConversion.class);
            assertSame(TopicCategory.FUNDAMENTALS, testLevel.category);
        }

        @Test
        public void testConversionWithIntermediate() {
            String json = "{\"category\":\"INTERMEDIATE\"}";
            TestClassConversion testLevel = new Gson().fromJson(json, TestClassConversion.class);
            assertSame(TopicCategory.INTERMEDIATE, testLevel.category);
        }

        @Test
        public void testConversionWithAdvanced() {
            String json = "{\"category\":\"ADVANCED\"}";
            TestClassConversion testLevel = new Gson().fromJson(json, TestClassConversion.class);
            assertSame(TopicCategory.ADVANCED, testLevel.category);
        }

    }

}

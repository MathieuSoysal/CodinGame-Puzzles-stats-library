package com.github.mathieusoysal.codingame_stats.puzzle.topic;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.jupiter.api.Assertions.assertSame;

import com.google.gson.Gson;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class CategoryTest {

    @Test
    public void testComparator() {
        assertThat(Category.FUNDAMENTALS, lessThan(Category.ADVANCED));
        assertThat(Category.FUNDAMENTALS, lessThan(Category.INTERMEDIATE));
        assertThat(Category.INTERMEDIATE, lessThan(Category.ADVANCED));
    }

    @Nested
    class TestConversionFromJson {
        private class TestClassConversion {

            public Category category;

        }

        @Test
        public void testConversionWithFundamentals() {
            String json = "{\"category\":\"FUNDAMENTALS\"}";
            TestClassConversion testLevel = new Gson().fromJson(json, TestClassConversion.class);
            assertSame(Category.FUNDAMENTALS, testLevel.category);
        }

        @Test
        public void testConversionWithIntermediate() {
            String json = "{\"category\":\"INTERMEDIATE\"}";
            TestClassConversion testLevel = new Gson().fromJson(json, TestClassConversion.class);
            assertSame(Category.INTERMEDIATE, testLevel.category);
        }

        @Test
        public void testConversionWithAdvanced() {
            String json = "{\"category\":\"ADVANCED\"}";
            TestClassConversion testLevel = new Gson().fromJson(json, TestClassConversion.class);
            assertSame(Category.ADVANCED, testLevel.category);
        }
        
    }

}

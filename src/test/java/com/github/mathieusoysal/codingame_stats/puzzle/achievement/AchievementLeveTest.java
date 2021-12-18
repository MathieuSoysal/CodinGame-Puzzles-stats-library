package com.github.mathieusoysal.codingame_stats.puzzle.achievement;

import com.google.gson.Gson;

import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.Nested;

public class AchievementLeveTest {

    @Test
    public void testComparator() {
        assertThat(AchievementLevel.BRONZE, lessThan(AchievementLevel.SILVER));
        assertThat(AchievementLevel.BRONZE, lessThan(AchievementLevel.GOLD));
        assertThat(AchievementLevel.SILVER, lessThan(AchievementLevel.GOLD));
    }

    @Nested
    class TestConversion {
        private class TestClassConversion {

            public AchievementLevel level;

        }

        @Test
        public void testConversionWithBronze() {
            String json = "{\"level\":\"BRONZE\"}";
            TestClassConversion testLevel = new Gson().fromJson(json, TestClassConversion.class);
            assertThat(testLevel.level, is(AchievementLevel.BRONZE));
        }

        @Test
        public void testConversionWithSilver() {
            String json = "{\"level\":\"SILVER\"}";
            TestClassConversion testLevel = new Gson().fromJson(json, TestClassConversion.class);
            assertThat(testLevel.level, is(AchievementLevel.SILVER));
        }

        @Test
        public void testConversionWithGold() {
            String json = "{\"level\":\"GOLD\"}";
            TestClassConversion testLevel = new Gson().fromJson(json, TestClassConversion.class);
            assertThat(testLevel.level, is(AchievementLevel.GOLD));
        }
    }

}

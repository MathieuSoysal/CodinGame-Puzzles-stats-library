package com.github.mathieusoysal.codingame_stats.puzzle.achievement;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.lessThan;

import com.google.gson.Gson;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class AchievementLeveTest {

    @Test
    void testComparator() {
        assertThat(AchievementLevel.BRONZE, lessThan(AchievementLevel.SILVER));
        assertThat(AchievementLevel.BRONZE, lessThan(AchievementLevel.GOLD));
        assertThat(AchievementLevel.SILVER, lessThan(AchievementLevel.GOLD));
    }

    @Nested
    class TestConversion {
        private class TestClassConversion {

            AchievementLevel level;

        }

        @Test
        void testConversionWithBronze() {
            String json = "{\"level\":\"BRONZE\"}";
            TestClassConversion testLevel = new Gson().fromJson(json, TestClassConversion.class);
            assertThat(testLevel.level, is(AchievementLevel.BRONZE));
        }

        @Test
        void testConversionWithSilver() {
            String json = "{\"level\":\"SILVER\"}";
            TestClassConversion testLevel = new Gson().fromJson(json, TestClassConversion.class);
            assertThat(testLevel.level, is(AchievementLevel.SILVER));
        }

        @Test
        void testConversionWithGold() {
            String json = "{\"level\":\"GOLD\"}";
            TestClassConversion testLevel = new Gson().fromJson(json, TestClassConversion.class);
            assertThat(testLevel.level, is(AchievementLevel.GOLD));
        }
    }

}

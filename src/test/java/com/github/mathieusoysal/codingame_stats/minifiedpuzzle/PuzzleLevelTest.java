package com.github.mathieusoysal.codingame_stats.minifiedpuzzle;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.lessThan;

import com.google.gson.Gson;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class PuzzleLevelTest {

    @Test
    void testComparator() {
        assertThat(PuzzleLevel.TUTORIAL, lessThan(PuzzleLevel.EASY));
        assertThat(PuzzleLevel.EASY, lessThan(PuzzleLevel.MEDIUM));
        assertThat(PuzzleLevel.MEDIUM, lessThan(PuzzleLevel.HARD));
        assertThat(PuzzleLevel.HARD, lessThan(PuzzleLevel.EXPERT));
    }

    @Test
    void testIsSpecialLevel() {
        assertThat(PuzzleLevel.TUTORIAL.isSpecialLevel(), is(true));
        assertThat(PuzzleLevel.EASY.isSpecialLevel(), is(false));
        assertThat(PuzzleLevel.MEDIUM.isSpecialLevel(), is(false));
        assertThat(PuzzleLevel.HARD.isSpecialLevel(), is(false));
        assertThat(PuzzleLevel.EXPERT.isSpecialLevel(), is(false));
        assertThat(PuzzleLevel.MULTI.isSpecialLevel(), is(true));
        assertThat(PuzzleLevel.CODEGOLF.isSpecialLevel(), is(true));
        assertThat(PuzzleLevel.OPTIM.isSpecialLevel(), is(true));
    }

    @Nested
    class TestConversionFromGson {
        private class TestClassConversion {

            PuzzleLevel level;

        }

        @Test
        void testConversionWithTutorial() {
            String json = "{\"level\":\"tutorial\"}";
            TestClassConversion testLevel = new Gson().fromJson(json, TestClassConversion.class);
            assertThat(testLevel.level, is(PuzzleLevel.TUTORIAL));
        }

        @Test
        void testConversionWithEasy() {
            String json = "{\"level\":\"easy\"}";
            TestClassConversion testLevel = new Gson().fromJson(json, TestClassConversion.class);
            assertThat(testLevel.level, is(PuzzleLevel.EASY));
        }

        @Test
        void testConversionWithMedium() {
            String json = "{\"level\":\"medium\"}";
            TestClassConversion testLevel = new Gson().fromJson(json, TestClassConversion.class);
            assertThat(testLevel.level, is(PuzzleLevel.MEDIUM));
        }

        @Test
        void testConversionWithHard() {
            String json = "{\"level\":\"hard\"}";
            TestClassConversion testLevel = new Gson().fromJson(json, TestClassConversion.class);
            assertThat(testLevel.level, is(PuzzleLevel.HARD));
        }

        @Test
        void testConversionWithExpert() {
            String json = "{\"level\":\"expert\"}";
            TestClassConversion testLevel = new Gson().fromJson(json, TestClassConversion.class);
            assertThat(testLevel.level, is(PuzzleLevel.EXPERT));
        }

        @Test
        void testConversionWithMulti() {
            String json = "{\"level\":\"multi\"}";
            TestClassConversion testLevel = new Gson().fromJson(json, TestClassConversion.class);
            assertThat(testLevel.level, is(PuzzleLevel.MULTI));
        }

        @Test
        void testConversionWithCodegolf() {
            String json = "{\"level\":\"codegolf\"}";
            TestClassConversion testLevel = new Gson().fromJson(json, TestClassConversion.class);
            assertThat(testLevel.level, is(PuzzleLevel.CODEGOLF));
        }

        @Test
        void testConversionWithOptim() {
            String json = "{\"level\":\"optim\"}";
            TestClassConversion testLevel = new Gson().fromJson(json, TestClassConversion.class);
            assertThat(testLevel.level, is(PuzzleLevel.OPTIM));
        }

    }

}

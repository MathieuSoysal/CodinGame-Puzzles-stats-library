package com.github.mathieusoysal.codingame_stats.puzzle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import com.google.gson.Gson;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class TitleMapTest {

    @Nested
    class HashcodeAndEqualsTest {

        @Test
        void testHashcode() {
            TitleMap titleMap1 = new TitleMap("name1", "name2");
            TitleMap titleMap2 = new TitleMap("name1", "name2");
            assertEquals(titleMap1.hashCode(), titleMap2.hashCode());
        }

        @Test
        void testEquals() {
            TitleMap titleMap1 = new TitleMap("name1", "name2");
            TitleMap titleMap2 = new TitleMap("name1", "name2");
            assertEquals(titleMap1, titleMap2);
        }

        @Test
        void testNotEquals1() {
            TitleMap titleMap1 = new TitleMap("name1", "name2");
            TitleMap titleMap2 = new TitleMap("name1", "name2d");
            assertNotEquals(titleMap1, titleMap2);
        }

        @Test
        void testNotEquals2() {
            TitleMap titleMap1 = new TitleMap("name1", "name2");
            TitleMap titleMap2 = new TitleMap("name1d", "name2");
            assertNotEquals(titleMap1, titleMap2);
        }

        @Test
        void testHashcodeNotEquals1() {
            TitleMap titleMap1 = new TitleMap("name1", "name2");
            TitleMap titleMap2 = new TitleMap("name1", "name2d");
            assertNotEquals(titleMap1.hashCode(), titleMap2.hashCode());
        }

        @Test
        void testHashcodeNotEquals2() {
            TitleMap titleMap1 = new TitleMap("name1", "name2");
            TitleMap titleMap2 = new TitleMap("name1d", "name2");
            assertNotEquals(titleMap1.hashCode(), titleMap2.hashCode());
        }

    }

    @Nested
    class ConversionFromJsonTest {
        final static String JSON_TITLEMAP = """
                {
                    \"1\": \"La Bataille\",
                    \"2\": \"War\"
                }
                """;

        TitleMap titleMap;

        @BeforeEach
        void setUp() {
            titleMap = new Gson().fromJson(JSON_TITLEMAP, TitleMap.class);
        }

        @Test
        void testGet1() {
            assertEquals("La Bataille", titleMap.getName1());
        }

        @Test
        void testGet2() {
            assertEquals("War", titleMap.getName2());
        }

    }

}

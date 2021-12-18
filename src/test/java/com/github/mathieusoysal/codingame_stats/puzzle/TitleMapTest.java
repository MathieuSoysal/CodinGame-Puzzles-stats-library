package com.github.mathieusoysal.codingame_stats.puzzle;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.google.gson.Gson;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class TitleMapTest {

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
        public void setUp() {
            titleMap = new Gson().fromJson(JSON_TITLEMAP, TitleMap.class);
        }

        @Test
        public void testGet1() {
            assertEquals("La Bataille", titleMap.getName1());
        }

        @Test
        public void testGet2() {
            assertEquals("War", titleMap.getName2());
        }

    }

}

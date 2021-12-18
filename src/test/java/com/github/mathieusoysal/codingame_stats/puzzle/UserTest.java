package com.github.mathieusoysal.codingame_stats.puzzle;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.google.gson.Gson;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class UserTest {

    @Nested
    class ConversionFromJsonTest {
        final static String JSON_USER = """
                {
                    \"userId\": 155929,
                    \"pseudo\": \"[CG]jupoulton\",
                    \"publicHandle\": \"d39436e9a23b5060ed3efaf1c24b4ba8929551\",
                    \"enable\": false,
                    \"avatar\": 9399538004630,
                    \"cover\": 10055855122642
                }
                """;

        User user;

        @BeforeEach
        public void setUp() {
            user = new Gson().fromJson(JSON_USER, User.class);
        }

        @Test
        public void testGetUserId() {
            assertEquals(155929, user.getUserId());
        }

        @Test
        public void testGetPseudo() {
            assertEquals("[CG]jupoulton", user.getPseudo());
        }

        @Test
        public void testGetPublicHandle() {
            assertEquals("d39436e9a23b5060ed3efaf1c24b4ba8929551", user.getPublicHandle());
        }

    }

}

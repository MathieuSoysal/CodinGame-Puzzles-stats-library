package com.github.mathieusoysal.codingame_stats.puzzle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import com.google.gson.Gson;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class UserTest {

    @Nested
    class HashcodeAndEquals{

        @Test
        void testHashcode() {
            User user1 = new User(1, "pseudo", "publicHandle");
            User user2 = new User(1, "pseudod", "publicHandled");
            assertEquals(user1.hashCode(), user2.hashCode());
        }

        @Test
        void testEquals() {
            User user1 = new User(1, "pseudo", "publicHandle");
            User user2 = new User(1, "pseudod", "publicHandled");
            assertEquals(user1, user2);
        }

        @Test
        void testNotEquals(){
            User user1 = new User(1, "pseudo", "publicHandle");
            User user2 = new User(2, "pseudo", "publicHandle");
            assertNotEquals(user1, user2);
        }

        @Test
        void testHashcodeNotEquals(){
            User user1 = new User(1, "pseudo", "publicHandle");
            User user2 = new User(2, "pseudo", "publicHandle");
            assertNotEquals(user1.hashCode(), user2.hashCode());
        }

    }

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

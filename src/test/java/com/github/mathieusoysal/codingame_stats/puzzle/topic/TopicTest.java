package com.github.mathieusoysal.codingame_stats.puzzle.topic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.google.gson.Gson;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class TopicTest {

    @Nested
    class ConversionFromJsonTest {

        final static String JSON_TOPIC = """
                {
                    \"handle\": \"data-structures\",
                    \"category\": \"FUNDAMENTALS\",
                    \"value\": \"Data Structures\",
                    \"children\": [
                        {
                            \"handle\": \"queues\",
                            \"category\": \"FUNDAMENTALS\",
                            \"value\": \"Queues\",
                            \"children\": []
                        }
                    ]
                }
                """;

        Topic topic;

        @BeforeEach
        public void setUp() {
            topic = new Gson().fromJson(JSON_TOPIC, Topic.class);
        }

        @Test
        public void testGetHandle() {
            assertEquals("data-structures", topic.handle());
        }

        @Test
        public void testGetCategory() {
            assertEquals(TopicCategory.FUNDAMENTALS, topic.category());
        }

        @Test
        public void testGetValue() {
            assertEquals("Data Structures", topic.value());
        }

        @Test
        public void testGetChildren() {
            assertEquals(1, topic.children().size());
        }

    }

}

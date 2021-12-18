package com.github.mathieusoysal.codingame_stats.puzzle.topic;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import com.google.gson.Gson;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class TopicTest {


    @Test
    public void testTopic() {
        Topic topic = new Topic("handle", "value", null, TopicCategory.FUNDAMENTALS);
        assertEquals("handle", topic.getHandle());
        assertEquals("value", topic.getValue());
        assertSame(TopicCategory.FUNDAMENTALS, topic.getCategory());
    }

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
            assertEquals("data-structures", topic.getHandle());
        }

        @Test
        public void testGetCategory() {
            assertEquals(TopicCategory.FUNDAMENTALS, topic.getCategory());
        }

        @Test
        public void testGetValue() {
            assertEquals("Data Structures", topic.getValue());
        }

        @Test
        public void testGetChildren() {
            assertEquals(1, topic.getChildren().size());
        }

    }

}

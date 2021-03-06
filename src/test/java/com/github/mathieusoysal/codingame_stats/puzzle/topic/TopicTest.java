package com.github.mathieusoysal.codingame_stats.puzzle.topic;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import com.google.gson.Gson;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class TopicTest {

    @Test
    void testTopic() {
        Topic topic = new Topic("handle", "value", null, TopicCategory.FUNDAMENTALS);
        assertEquals("handle", topic.getHandle());
        assertEquals("value", topic.getValue());
        assertSame(TopicCategory.FUNDAMENTALS, topic.getCategory());
    }

    @Nested
    class HashcodeAdnEqualsTest {

        @Test
        void testHashcode() {
            Topic topic1 = new Topic("handle", "value", null, TopicCategory.FUNDAMENTALS);
            Topic topic2 = new Topic("handle", "value", null, TopicCategory.FUNDAMENTALS);
            assertEquals(topic1.hashCode(), topic2.hashCode());
        }

        @Test
        void testEquals() {
            Topic topic1 = new Topic("handle", "value", null, TopicCategory.FUNDAMENTALS);
            Topic topic2 = new Topic("handle", "value", null, TopicCategory.FUNDAMENTALS);
            assertEquals(topic1, topic2);
        }

        @Test
        void testNotEquals() {
            Topic topic1 = new Topic("handle", "valued", null, TopicCategory.FUNDAMENTALS);
            Topic topic2 = new Topic("handle", "value", null, TopicCategory.FUNDAMENTALS);
            assertNotEquals(topic1, topic2);
        }

        @Test
        void testHashcodeNotEquals() {
            Topic topic1 = new Topic("handle", "value", null, TopicCategory.FUNDAMENTALS);
            Topic topic2 = new Topic("handle", "valued", null, TopicCategory.FUNDAMENTALS);
            assertNotEquals(topic1.hashCode(), topic2.hashCode());
        }

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
        void setUp() {
            topic = new Gson().fromJson(JSON_TOPIC, Topic.class);
        }

        @Test
        void testGetHandle() {
            assertEquals("data-structures", topic.getHandle());
        }

        @Test
        void testGetCategory() {
            assertEquals(TopicCategory.FUNDAMENTALS, topic.getCategory());
        }

        @Test
        void testGetValue() {
            assertEquals("Data Structures", topic.getValue());
        }

        @Test
        void testGetChildren() {
            assertEquals(1, topic.getChildren().size());
        }

        @Test
        void testGetChildrenHandle() {
            assertEquals("queues", topic.getChildren().get(0).getHandle());
        }

        @Test
        void testGetChildrenCategory() {
            assertEquals(TopicCategory.FUNDAMENTALS, topic.getChildren().get(0).getCategory());
        }

        @Test
        void testGetChildrenValue() {
            assertEquals("Queues", topic.getChildren().get(0).getValue());
        }

    }

}

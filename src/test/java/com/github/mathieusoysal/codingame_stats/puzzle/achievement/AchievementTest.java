package com.github.mathieusoysal.codingame_stats.puzzle.achievement;

import com.google.gson.Gson;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AchievementTest {

    final static String JSON_ACHIEVEMENT = """
                {
                    \"id\": \"PZ_50P_P50\",
                    \"puzzleId\": 50,
                    \"title\": \"50% War\",
                    \"description\": \"Reach a 50% score on War.\",
                    \"points\": 50,
                    \"progress\": 0,
                    \"progressMax\": 1,
                    \"completionTime\": 0,
                    \"imageBinaryId\": 1924507038929,
                    \"level\": \"SILVER\",
                    \"weight\": 7000.0
                }
            """;

    Achievement achievement;

    @BeforeEach
    public void setUp() {
        achievement = new Gson().fromJson(JSON_ACHIEVEMENT, Achievement.class);
    }

    @Test
    void testGetId() {
        assertEquals("PZ_50P_P50", achievement.getId());
    }

    @Test
    void testGetPuzzleId() {
        assertEquals(50, achievement.getPuzzleId());
    }

    @Test
    void testGetTitle() {
        assertEquals("50% War", achievement.getTitle());
    }

    @Test
    void testGetDescription() {
        assertEquals("Reach a 50% score on War.", achievement.getDescription());
    }

    @Test
    void testGetPoints() {
        assertEquals(50, achievement.getPoints());
    }

    @Test
    void testGetProgress() {
        assertEquals(0, achievement.getProgress());
    }

    @Test
    void testGetProgressMax() {
        assertEquals(1, achievement.getProgressMax());
    }

    @Test
    void testGetCompletionTime() {
        assertEquals(0, achievement.getCompletionTime());
    }

    @Test
    void testGetImageBinaryId() {
        assertEquals(1924507038929L, achievement.getImageBinaryId());
    }

    @Test
    void testGetLevel() {
        assertEquals(AchievementLevel.SILVER, achievement.getLevel());
    }

    @Test
    void testGetWeight() {
        assertEquals(7000.0, achievement.getWeight());
    }

}

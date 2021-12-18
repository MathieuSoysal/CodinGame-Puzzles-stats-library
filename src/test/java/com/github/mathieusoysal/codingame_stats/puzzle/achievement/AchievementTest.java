package com.github.mathieusoysal.codingame_stats.puzzle.achievement;

import com.google.gson.Gson;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AchievementTest {

    String json = """
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

    @Test
    void testGetId() {
        Achievement achievement = new Gson().fromJson(json, Achievement.class);
        assertEquals("PZ_50P_P50", achievement.getId());
    }

    @Test
    void testGetPuzzleId() {
        Achievement achievement = new Gson().fromJson(json, Achievement.class);
        assertEquals(50, achievement.getPuzzleId());
    }

    @Test
    void testGetTitle() {
        Achievement achievement = new Gson().fromJson(json, Achievement.class);
        assertEquals("50% War", achievement.getTitle());
    }

    @Test
    void testGetDescription() {
        Achievement achievement = new Gson().fromJson(json, Achievement.class);
        assertEquals("Reach a 50% score on War.", achievement.getDescription());
    }

    @Test
    void testGetPoints() {
        Achievement achievement = new Gson().fromJson(json, Achievement.class);
        assertEquals(50, achievement.getPoints());
    }

    @Test
    void testGetProgress() {
        Achievement achievement = new Gson().fromJson(json, Achievement.class);
        assertEquals(0, achievement.getProgress());
    }

    @Test
    void testGetProgressMax() {
        Achievement achievement = new Gson().fromJson(json, Achievement.class);
        assertEquals(1, achievement.getProgressMax());
    }

    @Test
    void testGetCompletionTime() {
        Achievement achievement = new Gson().fromJson(json, Achievement.class);
        assertEquals(0, achievement.getCompletionTime());
    }

    @Test
    void testGetImageBinaryId() {
        Achievement achievement = new Gson().fromJson(json, Achievement.class);
        assertEquals(1924507038929L, achievement.getImageBinaryId());
    }

    @Test
    void testGetLevel() {
        Achievement achievement = new Gson().fromJson(json, Achievement.class);
        assertEquals(AchievementLevel.SILVER, achievement.getLevel());
    }

    @Test
    void testGetWeight() {
        Achievement achievement = new Gson().fromJson(json, Achievement.class);
        assertEquals(7000.0, achievement.getWeight());
    }

}

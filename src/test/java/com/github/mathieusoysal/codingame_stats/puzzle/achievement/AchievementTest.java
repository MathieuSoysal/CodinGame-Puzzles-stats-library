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
    void test() {
        Achievement achievement = new Gson().fromJson(json, Achievement.class);
        assertEquals("PZ_50P_P50", achievement.id());
    }

    
}

package com.github.mathieusoysal.codingame_stats.puzzle.achievement;

/**
 * 
 */
public record Achievement(
        String id,
        int puzzleId,
        String title,
        String description,
        int points,
        int progress,
        int progressMax,
        int completionTime,
        long imageBinaryId,
        double weight,
        AchievementLevel level) {
}
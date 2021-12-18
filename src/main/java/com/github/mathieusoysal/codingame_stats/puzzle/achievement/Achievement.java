package com.github.mathieusoysal.codingame_stats.puzzle.achievement;

/**
 * 
 */
public class Achievement {

        private String id;
        private int puzzleId;
        private String title;
        private String description;
        private int points;
        private int progress;
        private int progressMax;
        private int completionTime;
        private long imageBinaryId;
        private double weight;
        private AchievementLevel level;

        public Achievement(String string, int i, String string2, String string3, int j, int k, int l, int m, long n,
                double d, AchievementLevel silver) {
        }

        public String getId() {
                return id;
        }

        public int getPuzzleId() {
                return puzzleId;
        }

        public String getTitle() {
                return title;
        }

        public String getDescription() {
                return description;
        }

        public int getPoints() {
                return points;
        }

        public int getProgress() {
                return progress;
        }

        public int getProgressMax() {
                return progressMax;
        }

        public int getCompletionTime() {
                return completionTime;
        }

        public long getImageBinaryId() {
                return imageBinaryId;
        }

        public double getWeight() {
                return weight;
        }

        public AchievementLevel getLevel() {
                return level;
        }

}
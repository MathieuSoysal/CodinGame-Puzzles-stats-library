package com.github.mathieusoysal.codingame_stats.puzzle.achievement;

/**
 * 
 * Achievement class represents CodinGame's achievement.
 * 
 * @author Mathieu Soysal
 * 
 * @see AchievementLevel
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

        Achievement(String id, int puzzleId, String title, String description, int points, int progress,
                        int progressMax, int completionTime, long imageBinaryId, double weight,
                        AchievementLevel level) {
                this.id = id;
                this.puzzleId = puzzleId;
                this.title = title;
                this.description = description;
                this.points = points;
                this.progress = progress;
                this.progressMax = progressMax;
                this.completionTime = completionTime;
                this.imageBinaryId = imageBinaryId;
                this.weight = weight;
                this.level = level;
        }

        @Override
        public int hashCode() {
                final int prime = 31;
                int result = 1;
                result = prime * result + ((id == null) ? 0 : id.hashCode());
                return result;
        }

        @Override
        public boolean equals(Object obj) {
                if (this == obj)
                        return true;
                if (obj == null)
                        return false;
                if (getClass() != obj.getClass())
                        return false;
                Achievement other = (Achievement) obj;
                if (id == null) {
                        if (other.id != null)
                                return false;
                } else if (!id.equals(other.id))
                        return false;
                return true;
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
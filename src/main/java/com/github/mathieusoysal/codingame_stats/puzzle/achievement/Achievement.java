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

        /**
         * @return The id of the achievement.
         */
        public String getId() {
                return id;
        }

        /**
         * @return The id of the puzzle.
         */
        public int getPuzzleId() {
                return puzzleId;
        }

        /**
         * @return The title of the achievement.
         */
        public String getTitle() {
                return title;
        }

        /**
         * @return The description of the achievement.
         */
        public String getDescription() {
                return description;
        }

        /**
         * @return The points of the achievement.
         */
        public int getPoints() {
                return points;
        }

        /**
         * @return The progress of the achievement.
         */
        public int getProgress() {
                return progress;
        }

        /**
         * @return The progress max of the achievement.
         */
        public int getProgressMax() {
                return progressMax;
        }

        /**
         * @return The completion time of the achievement.
         */
        public int getCompletionTime() {
                return completionTime;
        }

        /**
         * @return The image binary id of the achievement.
         */
        public long getImageBinaryId() {
                return imageBinaryId;
        }

        /**
         * @return The weight of the achievement.
         */
        public double getWeight() {
                return weight;
        }

        /**
         * @return The level of the achievement.
         * @see AchievementLevel
         */
        public AchievementLevel getLevel() {
                return level;
        }

}
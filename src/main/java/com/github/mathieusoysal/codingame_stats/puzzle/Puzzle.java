package com.github.mathieusoysal.codingame_stats.puzzle;

import java.util.List;

import com.github.mathieusoysal.codingame_stats.minifiedpuzzle.MinifiedPuzzle;
import com.github.mathieusoysal.codingame_stats.puzzle.achievement.Achievement;
import com.github.mathieusoysal.codingame_stats.puzzle.topic.Topic;

/**
 * 
 */
public class Puzzle extends MinifiedPuzzle {

    /**
     * 
     */
    private String title;

    /**
     * 
     */
    private String description;

    /**
     * 
     */
    private String statement;

    /**
     * 
     */
    private int achievementCount;

    /**
     * 
     */
    private int doneAchievementCount;

    /**
     * 
     */
    private String forumLink;

    /**
     * 
     */
    private int attemptCount;

    /**
     * 
     */
    private int xpPoints;

    /**
     * 
     */
    private String prettyId;

    /**
     * 
     */
    private String detailsPageUrl;

    /**
     * 
     */
    private TitleMap titleMap;

    /**
     * 
     */
    private User contributor;

    /**
     * 
     */
    private List<User> moderators;

    /**
     * 
     */
    private List<Topic> topics;

    /**
     * 
     */
    private List<Achievement> linkedAchievements;

    /**
     * 
     */
    private PuzzleType type;

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getStatement() {
        return statement;
    }

    public int getAchievementCount() {
        return achievementCount;
    }

    public int getDoneAchievementCount() {
        return doneAchievementCount;
    }

    public String getForumLink() {
        return forumLink;
    }

    public int getAttemptCount() {
        return attemptCount;
    }

    public int getXpPoints() {
        return xpPoints;
    }

    public String getPrettyId() {
        return prettyId;
    }

    public String getDetailsPageUrl() {
        return detailsPageUrl;
    }

    public TitleMap getTitleMap() {
        return titleMap;
    }

    public User getContributor() {
        return contributor;
    }

    public List<User> getModerators() {
        return moderators;
    }

    public List<Topic> getTopics() {
        return topics;
    }

    public List<Achievement> getLinkedAchievements() {
        return linkedAchievements;
    }

    public PuzzleType getType() {
        return type;
    }
}
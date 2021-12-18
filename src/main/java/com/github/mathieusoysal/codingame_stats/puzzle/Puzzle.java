package com.github.mathieusoysal.codingame_stats.puzzle;

import java.util.*;

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
    private int achiviementCount;

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
    private int xpPoint;

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
    private boolean communityCreation;

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
    private User moderators;

    /**
     * 
     */
    private Set<Topic> topics;

    /**
     * 
     */
    private Set<Achievement> linkedAchievements;

    /**
     * 
     */
    private PuzzleType type;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getStatement() {
        return statement;
    }

    public int getAchiviementCount() {
        return achiviementCount;
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

    public int getXpPoint() {
        return xpPoint;
    }

    public String getPrettyId() {
        return prettyId;
    }

    public String getDetailsPageUrl() {
        return detailsPageUrl;
    }

    public boolean isCommunityCreation() {
        return communityCreation;
    }

    public TitleMap getTitleMap() {
        return titleMap;
    }

    public User getContributor() {
        return contributor;
    }

    public User getModerators() {
        return moderators;
    }

    public Set<Topic> getTopics() {
        return topics;
    }

    public Set<Achievement> getLinkedAchievements() {
        return linkedAchievements;
    }

    public PuzzleType getType() {
        return type;
    }
}
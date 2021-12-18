package com.github.mathieusoysal.codingame_stats.puzzle;

import java.util.List;

import com.github.mathieusoysal.codingame_stats.minifiedpuzzle.MinifiedPuzzle;
import com.github.mathieusoysal.codingame_stats.puzzle.achievement.Achievement;
import com.github.mathieusoysal.codingame_stats.puzzle.topic.Topic;

/**
 * 
 * Puzzle class represents a CodinGame's puzzle.
 * 
 * @author Mathieu Soysal
 * 
 * @see MinifiedPuzzle
 * @see TitleMap
 * @see Topic
 * @see Achievement
 * @see User
 * @see PuzzleType
 */
public class Puzzle extends MinifiedPuzzle {

    /**
     * The title of the puzzle.
     */
    private String title;

    /**
     * The description of the puzzle.
     */
    private String description;

    /**
     * The statement of the puzzle.
     */
    private String statement;

    /**
     * The number of achievement of the puzzle.
     */
    private int achievementCount;

    /**
     * The number of done achievement of the puzzle.
     */
    private int doneAchievementCount;

    /**
     * The link to forum of the puzzle.
     */
    private String forumLink;

    /**
     * The number of user who have attempted the puzzle.
     */
    private int attemptCount;

    /**
     * The number of xp points of the puzzle.
     */
    private int xpPoints;

    /**
     * The pretty name of the puzzle.
     */
    private String prettyId;

    /**
     * The CodinGame's url to get more details about the puzzle.
     */
    private String detailsPageUrl;

    /**
     * The list of names of the topics of the puzzle.
     * @see TitleMap
     */
    private TitleMap titleMap;

    /**
     * The creator of the puzzle.
     * 
     * @see User
     */
    private User contributor;

    /**
     * The list user that approved the puzzle.
     * 
     * @see User
     */
    private List<User> moderators;

    /**
     * The list of topics of the puzzle.
     * 
     * @see Topic
     */
    private List<Topic> topics;

    /**
     * The list of achievements of the puzzle.
     * 
     * @see Achievement
     */
    private List<Achievement> linkedAchievements;

    /**
     * The type of the puzzle.
     * 
     * @see PuzzleType
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
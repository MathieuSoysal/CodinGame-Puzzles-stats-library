package com.github.mathieusoysal.codingame_stats;

import java.util.*;

/**
 * 
 */
public class Puzzle extends MinifiedPuzzle {

    /**
     * Default constructor
     */
    public Puzzle() {
    }

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

}
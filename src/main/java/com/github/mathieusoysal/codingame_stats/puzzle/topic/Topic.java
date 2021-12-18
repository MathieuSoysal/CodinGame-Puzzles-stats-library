package com.github.mathieusoysal.codingame_stats.puzzle.topic;

import java.util.Set;

public record Topic(
        String handle,
        String value,
        Set<Topic> children,
        TopicCategory category) {
}
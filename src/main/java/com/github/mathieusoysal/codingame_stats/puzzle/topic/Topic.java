package com.github.mathieusoysal.codingame_stats.puzzle.topic;

import java.util.Set;

public class Topic {
        private String handle;
        private String value;
        private Set<Topic> children;
        private TopicCategory category;

        Topic(String handle, String value, Set<Topic> children, TopicCategory category) {
                this.handle = handle;
                this.value = value;
                this.children = children;
                this.category = category;
        }

        public String getHandle() {
            return handle;
        }

        public String getValue() {
            return value;
        }

        public Set<Topic> getChildren() {
            return children;
        }

        public TopicCategory getCategory() {
            return category;
        }
}
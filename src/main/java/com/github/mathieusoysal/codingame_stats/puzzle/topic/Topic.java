package com.github.mathieusoysal.codingame_stats.puzzle.topic;

import java.util.List;

public class Topic {
    private String handle;
    private String value;
    private List<Topic> children;
    private TopicCategory category;

    Topic(String handle, String value, List<Topic> children, TopicCategory category) {
        this.handle = handle;
        this.value = value;
        this.children = children;
        this.category = category;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((category == null) ? 0 : category.hashCode());
        result = prime * result + ((handle == null) ? 0 : handle.hashCode());
        result = prime * result + ((value == null) ? 0 : value.hashCode());
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
        Topic other = (Topic) obj;
        if (category != other.category)
            return false;
        if (handle == null) {
            if (other.handle != null)
                return false;
        } else if (!handle.equals(other.handle))
            return false;
        if (value == null) {
            if (other.value != null)
                return false;
        } else if (!value.equals(other.value))
            return false;
        return true;
    }

    public String getHandle() {
        return handle;
    }

    public String getValue() {
        return value;
    }

    public List<Topic> getChildren() {
        return children;
    }

    public TopicCategory getCategory() {
        return category;
    }
}
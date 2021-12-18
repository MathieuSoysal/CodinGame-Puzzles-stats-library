package com.github.mathieusoysal.codingame_stats.puzzle;

import com.google.gson.annotations.SerializedName;

public class TitleMap {
    @SerializedName("1")
    private String name1;

    @SerializedName("2")
    private String name2;

    TitleMap(String name1, String name2) {
        this.name1 = name1;
        this.name2 = name2;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name1 == null) ? 0 : name1.hashCode());
        result = prime * result + ((name2 == null) ? 0 : name2.hashCode());
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
        TitleMap other = (TitleMap) obj;
        if (name1 == null) {
            if (other.name1 != null)
                return false;
        } else if (!name1.equals(other.name1))
            return false;
        if (name2 == null) {
            if (other.name2 != null)
                return false;
        } else if (!name2.equals(other.name2))
            return false;
        return true;
    }

    public String getName1() {
        return name1;
    }

    public String getName2() {
        return name2;
    }
}
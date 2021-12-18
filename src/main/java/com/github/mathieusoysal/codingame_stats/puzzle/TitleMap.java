package com.github.mathieusoysal.codingame_stats.puzzle;

import com.google.gson.annotations.SerializedName;

public class TitleMap {
    @SerializedName("1")
    private String name1;

    @SerializedName("2")
    private String name2;

    public TitleMap(String string, String string2) {
    }

    public String getName1() {
        return name1;
    }

    public String getName2() {
        return name2;
    }
}
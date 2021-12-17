package com.github.mathieusoysal.codingame_stats.minifiedpuzzle;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.IntStream;

public record FeedBack(int feedBackId,
        int[] feedBacks) {

    /**
     * @return
     */
    public double getMoy() {
        return IntStream.of(feedBacks).sum() / (double) feedBacks.length;
    }

    /**
     * @param numStar
     * @return
     */
    public int getNbStarsFor(int numStar) {
        return feedBacks[numStar - 1];
    }

    @Override
    public String toString() {
        return "FeedBack{" +
                "feedBackId=" + feedBackId +
                ", feedBacks=" + Arrays.toString(feedBacks) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        FeedBack feedBack = (FeedBack) o;
        return feedBackId == feedBack.feedBackId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(feedBackId);
    }

}
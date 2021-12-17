package com.github.mathieusoysal.codingame_stats.minifiedpuzzle;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.IntStream;

public class FeedBack {

    private int feedbackId;
    private int[] feedbacks;

    public FeedBack(int feedbackId, int[] feedbacks) {
        this.feedbackId = feedbackId;
        this.feedbacks = feedbacks;
    }

    /**
     * @return
     */
    public double getMoy() {
        return IntStream.of(feedbacks).sum() / (double) feedbacks.length;
    }

    /**
     * @param numStar
     * @return
     */
    public int getNbStarsFor(int numStar) {
        return feedbacks[numStar - 1];
    }

    @Override
    public String toString() {
        return "FeedBack{" +
                "feedBackId=" + feedbackId +
                ", feedBacks=" + Arrays.toString(feedbacks) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        FeedBack feedBack = (FeedBack) o;
        return feedbackId == feedBack.feedbackId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(feedbackId);
    }

    public int getFeedbackId() {
        return feedbackId;
    }

    public int[] getFeedbacks() {
        return feedbacks;
    }

}
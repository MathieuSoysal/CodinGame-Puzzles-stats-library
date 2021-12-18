package com.github.mathieusoysal.codingame_stats.minifiedpuzzle;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.IntStream;

/**
 * Feedback is feedback from players who have solved the puzzle.
 * 
 * @author Mathieu Soysal
 */
public class Feedback {

    private int feedbackId;
    private int[] feedbacks;

    Feedback(int feedbackId, int[] feedbacks) {
        this.feedbackId = feedbackId;
        this.feedbacks = feedbacks;
    }

    /**
     * @return The average feedback from users who solved the puzzles.
     */
    public double getMoy() {
        return IntStream.of(feedbacks).sum() / (double) feedbacks.length;
    }

    /**
     * @param numStar : the rate number.
     * @return The number of people who rated with {@code numStar}.
     */
    public int getNbStarsFor(int numStar) {
        return feedbacks[numStar - 1];
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "feedbackId=" + feedbackId +
                ", feedbacks=" + Arrays.toString(feedbacks) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Feedback feedBack = (Feedback) o;
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
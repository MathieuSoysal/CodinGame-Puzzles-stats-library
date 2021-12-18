package com.github.mathieusoysal.codingame_stats;

import com.github.mathieusoysal.codingame_stats.minifiedpuzzle.MinifiedPuzzle;
import com.github.mathieusoysal.codingame_stats.puzzle.Puzzle;
import com.github.mathieusoysal.codingame_stats.util.CodinGameApi;

import java.util.List;
import java.util.function.UnaryOperator;

public class CodinGame {
    private static final UnaryOperator<Puzzle> ifPuzzleHasAchievementGetPuzzleWithAchievementInfo = puzzle -> puzzle
            .getAchievementCount() > 0
                    ? CodinGameApi.getPuzzleFromPrettyId(puzzle.getPrettyId())
                    : puzzle;

    public List<Puzzle> getPuzzles() {
        List<Integer> puzzlesId = CodinGameApi
                .getAllMinifiedPuzzles()
                .parallelStream()
                .map(MinifiedPuzzle::getId)
                .toList();
        return CodinGameApi.getPuzzles(puzzlesId)
                .parallelStream()
                .map(ifPuzzleHasAchievementGetPuzzleWithAchievementInfo)
                .toList();
    }

}

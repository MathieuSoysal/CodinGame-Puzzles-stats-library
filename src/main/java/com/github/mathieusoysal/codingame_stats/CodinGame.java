package com.github.mathieusoysal.codingame_stats;

import com.github.mathieusoysal.codingame_stats.minifiedpuzzle.MinifiedPuzzle;
import com.github.mathieusoysal.codingame_stats.puzzle.Puzzle;
import com.github.mathieusoysal.codingame_stats.util.CodinGameApi;

import java.util.List;
import java.util.function.Function;

public class CodinGame implements InterfaceCodinGame {
    private static final Function<Puzzle, Puzzle> ifPuzzleHasAchievementGetPuzzleWithAchievementInfo = puzzle -> puzzle
            .getAchiviementCount() > 0
                    ? CodinGameApi.getPuzzleFromPrettyId(puzzle.getPrettyId())
                    : puzzle;

    @Override
    public void actualise() {
        // TODO Auto-generated method stub
    }

    @Override
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
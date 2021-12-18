package com.github.mathieusoysal.codingame_stats;

import java.util.List;
import java.util.function.UnaryOperator;

import com.github.mathieusoysal.codingame_stats.minifiedpuzzle.MinifiedPuzzle;
import com.github.mathieusoysal.codingame_stats.puzzle.Puzzle;

/**
 * The class to get all Puzzles from CodinGame's API.
 * 
 * @see Puzzle
 * 
 * @author Mathieu Soysal
 */
public class CodinGame {
        private static final UnaryOperator<Puzzle> ifPuzzleHasAchievementGetPuzzleWithAchievementInfo = puzzle -> puzzle
                        .getAchievementCount() > 0
                                        ? CodinGameApi.getPuzzleFromPrettyId(puzzle.getPrettyId())
                                        : puzzle;

        /**
         * Get all puzzles from CodinGame's API.
         * 
         * @return A list of all puzzles.
         */
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

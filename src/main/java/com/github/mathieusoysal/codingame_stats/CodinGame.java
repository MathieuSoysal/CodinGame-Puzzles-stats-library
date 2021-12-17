package com.github.mathieusoysal.codingame_stats;

import com.github.mathieusoysal.codingame_stats.minifiedpuzzle.MinifiedPuzzle;

import java.util.Arrays;
import java.util.List;

import com.github.mathieusoysal.codingame_stats.puzzle.Puzzle;
import kong.unirest.HttpResponse;
import kong.unirest.Unirest;

public class CodinGame implements InterfaceCodinGame {

    @Override
    public void actualise() {
        // TODO Auto-generated method stub
    }

    @Override
    public List<Puzzle> getPuzzles() {
        return null;
    }

    List<MinifiedPuzzle> getAllMinifiedPuzzles() {
        throw new UnsupportedOperationException("Not supported yet.");
    }


}

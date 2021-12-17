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
        HttpResponse<MinifiedPuzzle[]> response = Unirest
                .post("https://www.codingame.com/services/Puzzle/findAllMinimalProgress")
                .header("Content-Type", "application/javascript")
                .header("Cookie",
                        "AWSALB=Uw+f64wN9Z3EYP08w6n7KruagUsOR4ZghF1iv2+N2LVBvBTT7J/1VxLq5fEzTF/PfS8Aq6dIBowfLvjhhAhnKJL5ZUamKHfro27msq8GDVLJyf2J4CoTEnecWO+6; AWSALBCORS=Uw+f64wN9Z3EYP08w6n7KruagUsOR4ZghF1iv2+N2LVBvBTT7J/1VxLq5fEzTF/PfS8Aq6dIBowfLvjhhAhnKJL5ZUamKHfro27msq8GDVLJyf2J4CoTEnecWO+6")
                .body("[null]")
                .asObject(MinifiedPuzzle[].class);
        return Arrays.asList(response.getBody());
    }

    List<Integer> getAllPuzzlesID() {
        return null;
    }

}

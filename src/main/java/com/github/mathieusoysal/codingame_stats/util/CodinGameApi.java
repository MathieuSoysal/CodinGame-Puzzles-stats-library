package com.github.mathieusoysal.codingame_stats.util;

import com.github.mathieusoysal.codingame_stats.minifiedpuzzle.MinifiedPuzzle;
import com.github.mathieusoysal.codingame_stats.puzzle.Puzzle;

import java.util.Arrays;
import java.util.List;
import kong.unirest.HttpResponse;
import kong.unirest.Unirest;

public class CodinGameApi {

    private CodinGameApi() {
        throw new IllegalStateException("Utility class");
    }

    public static List<Puzzle> getPuzzles(List<Integer> puzzleIds) {
        HttpResponse<Puzzle[]> response = Unirest
                .post("https://www.codingame.com/services/Puzzle/findProgressByIds")
                .header("Content-Type", "text/plain")
                .header("Cookie",
                        "AWSALB=hsuAEWBvyEWHintbvmU2u6F10ZfmpKatWjMYC1+eGmspXd6tZFZCpaN66q3ZthiyzGgz00hQTVOYG/rhtK0yWyh0yn+IBmjYF1ELNWeYdmKgQFV+2wovs3yP1Td7; AWSALBCORS=hsuAEWBvyEWHintbvmU2u6F10ZfmpKatWjMYC1+eGmspXd6tZFZCpaN66q3ZthiyzGgz00hQTVOYG/rhtK0yWyh0yn+IBmjYF1ELNWeYdmKgQFV+2wovs3yP1Td7")
                .body(String.format("[%s,null,1]", formatListIds(puzzleIds)))
                .asObject(Puzzle[].class);
        return Arrays.asList(response.getBody());
    }

    public static Puzzle getPuzzleFromPrettyId(String puzzlePrettyId) {
        HttpResponse<Puzzle> response = Unirest.post("https://www.codingame.com/services/Puzzle/findProgressByPrettyId")
                .header("Content-Type", "text/plain")
                .header("Cookie",
                        "AWSALB=SANuFWIY5ynzkVFT4RHB73t1GQh6O01DnPuVYFYwjlvyqWoT+qIPKDh24W4OBmxXXH3muFHCR+aAehVxyuDF0uWYxogcf1AEZWkdVPal5yDjKTYB5gWOaJMzQk3D; AWSALBCORS=SANuFWIY5ynzkVFT4RHB73t1GQh6O01DnPuVYFYwjlvyqWoT+qIPKDh24W4OBmxXXH3muFHCR+aAehVxyuDF0uWYxogcf1AEZWkdVPal5yDjKTYB5gWOaJMzQk3D")
                .body(String.format("[\"%s\", null]", puzzlePrettyId))
                .asObject(Puzzle.class);
        return response.getBody();
    }

    public static List<MinifiedPuzzle> getAllMinifiedPuzzles() {
        HttpResponse<MinifiedPuzzle[]> response = Unirest
                .post("https://www.codingame.com/services/Puzzle/findAllMinimalProgress")
                .header("Content-Type", "application/javascript")
                .header("Cookie",
                        "AWSALB=Uw+f64wN9Z3EYP08w6n7KruagUsOR4ZghF1iv2+N2LVBvBTT7J/1VxLq5fEzTF/PfS8Aq6dIBowfLvjhhAhnKJL5ZUamKHfro27msq8GDVLJyf2J4CoTEnecWO+6; AWSALBCORS=Uw+f64wN9Z3EYP08w6n7KruagUsOR4ZghF1iv2+N2LVBvBTT7J/1VxLq5fEzTF/PfS8Aq6dIBowfLvjhhAhnKJL5ZUamKHfro27msq8GDVLJyf2J4CoTEnecWO+6")
                .body("[null]")
                .asObject(MinifiedPuzzle[].class);
        return Arrays.asList(response.getBody());
    }

    private static String formatListIds(List<Integer> puzzleIds) {
        return String.format("[%s]", String.join(",", puzzleIds.stream().map(String::valueOf).toArray(String[]::new)));
    }

}

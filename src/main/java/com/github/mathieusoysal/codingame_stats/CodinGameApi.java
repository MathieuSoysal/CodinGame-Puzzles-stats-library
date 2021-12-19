package com.github.mathieusoysal.codingame_stats;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import com.github.mathieusoysal.codingame_stats.minifiedpuzzle.MinifiedPuzzle;
import com.github.mathieusoysal.codingame_stats.puzzle.Puzzle;

import kong.unirest.Cache;
import kong.unirest.HttpResponse;
import kong.unirest.Unirest;

/**
 * CodinGameApi is a class that used to interact with the CodinGame's API.
 * 
 * @see Unirest
 * 
 * @author Mathieu Soysal
 */
class CodinGameApi {

    private CodinGameApi() {
        throw new IllegalStateException("Utility class");
    }

    static {
        Unirest.config()
                .cacheResponses(Cache.builder()
                        .depth(20)
                        .maxAge(5, TimeUnit.HOURS))
                .enableCookieManagement(false)
                .addDefaultHeader("Content-Type", "application/javascript");
    }

    static List<Puzzle> getPuzzles(List<Integer> puzzleIds) {
        HttpResponse<Puzzle[]> response = Unirest
                .post("https://www.codingame.com/services/Puzzle/findProgressByIds")
                .body(String.format("[%s,null,1]", formatListIds(puzzleIds)))
                .asObject(Puzzle[].class);
        return Arrays.asList(response.getBody());
    }

    static Puzzle getPuzzleFromPrettyId(String puzzlePrettyId) {
        HttpResponse<Puzzle> response = Unirest.post("https://www.codingame.com/services/Puzzle/findProgressByPrettyId")
                .body(String.format("[\"%s\", null]", puzzlePrettyId))
                .asObject(Puzzle.class);
        return response.getBody();
    }

    static List<MinifiedPuzzle> getAllMinifiedPuzzles() {
        HttpResponse<MinifiedPuzzle[]> response = Unirest
                .post("https://www.codingame.com/services/Puzzle/findAllMinimalProgress")
                
                .body("[null]")
                .asObject(MinifiedPuzzle[].class);
        return Arrays.asList(response.getBody());
    }

    private static String formatListIds(List<Integer> puzzleIds) {
        return String.format("[%s]", String.join(",", puzzleIds.stream().map(String::valueOf).toArray(String[]::new)));
    }

}

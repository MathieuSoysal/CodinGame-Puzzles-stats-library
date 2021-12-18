package com.github.mathieusoysal.codingame_stats.puzzle;

import com.google.gson.Gson;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class PuzzleTest {

    @Nested
    class ConversionFromJsonTest {
        final static String JSON_PUZZLE = """
                {
                    \"id\": 50,
                    \"level\": \"medium\",
                    \"rank\": 1,
                    \"thumbnailBinaryId\": 2550483424936,
                    \"previewBinaryId\": 1629606242375,
                    \"coverBinaryId\": 4769256833559,
                    \"logoBinaryId\": 10046048240771,
                    \"title\": \"War\",
                    \"titleMap\": {
                        \"1\": \"La Bataille\",
                        \"2\": \"War\"
                    },
                    \"description\": \"<strong>Solve this special challenge and enter Winamax's world</strong>\n<br />\nScore, get contacted, and grab the chance to meet the Winamax tech team.\",
                    \"statement\": \"salut\",
                    \"validatorScore\": 0,
                    \"achievementCount\": 2,
                    \"doneAchievementCount\": 0,
                    \"linkedAchievements\": [
                        {
                            \"id\": \"PZ_50P_P50\",
                            \"puzzleId\": 50,
                            \"title\": \"50% War\",
                            \"description\": \"Reach a 50% score on War.\",
                            \"points\": 50,
                            \"progress\": 0,
                            \"progressMax\": 1,
                            \"completionTime\": 0,
                            \"imageBinaryId\": 1924507038929,
                            \"level\": \"SILVER\",
                            \"weight\": 7000.0
                        },
                        {
                            \"id\": \"PZ_100P_P50\",
                            \"puzzleId\": 50,
                            \"title\": \"100% War\",
                            \"description\": \"Reach a 100% score on War.\",
                            \"points\": 50,
                            \"progress\": 0,
                            \"progressMax\": 1,
                            \"completionTime\": 0,
                            \"imageBinaryId\": 1925032048027,
                            \"level\": \"SILVER\",
                            \"weight\": 8600.0
                        }
                    ],
                    \"forumLink\": \"war-puzzle-discussion/2417\",
                    \"solvedCount\": 18153,
                    \"attemptCount\": 27674,
                    \"xpPoints\": 100,
                    \"feedback\": {
                        \"feedbackId\": 1615,
                        \"feedbacks\": [
                            44,
                            81,
                            155,
                            365,
                            664
                        ]
                    },
                    \"topics\": [
                        {
                            \"handle\": \"data-structures\",
                            \"category\": \"FUNDAMENTALS\",
                            \"value\": \"Data Structures\",
                            \"children\": [
                                {
                                    \"handle\": \"queues\",
                                    \"category\": \"FUNDAMENTALS\",
                                    \"value\": \"Queues\",
                                    \"children\": []
                                }
                            ]
                        }
                    ],
                    \"creationTime\": 1422957376000,
                    \"type\": \"CODE\",
                    \"prettyId\": \"winamax-battle\",
                    \"detailsPageUrl\": \"/training/medium/winamax-battle\",
                    \"contentDetails\": {
                        \"description\": \"Your program must determine the winner of a game of War, a simple two-player card game.\",
                        \"learnDescription\": \"Solving this puzzle shows that you can manipulate queues and simulate every step of deterministic card game.\",
                        \"story\": \"Over at Winamax, card games are all the rage. Why don't you join the party?\",
                        \"externalResources\": []
                    },
                    \"communityCreation\": false
                }
                """;

        @Test
        void testPropertyId() {
            Puzzle puzzle = new Gson().fromJson(JSON_PUZZLE, Puzzle.class);
            assertEquals(50, puzzle.getId());
        }
    }

}

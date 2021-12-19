package com.github.mathieusoysal.codingame_stats.puzzle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;

import com.github.mathieusoysal.codingame_stats.minifiedpuzzle.PuzzleLevel;
import com.github.mathieusoysal.codingame_stats.puzzle.topic.TopicCategory;
import com.google.gson.Gson;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class PuzzleTest {

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

        @Test
        void testPropertyLevel() {
            Puzzle puzzle = new Gson().fromJson(JSON_PUZZLE, Puzzle.class);
            assertSame(PuzzleLevel.MEDIUM, puzzle.getLevel());
        }

        @Test
        void testPropertyRank() {
            Puzzle puzzle = new Gson().fromJson(JSON_PUZZLE, Puzzle.class);
            assertEquals(1, puzzle.getRank());
        }

        @Test
        void testPropertyTitle() {
            Puzzle puzzle = new Gson().fromJson(JSON_PUZZLE, Puzzle.class);
            assertEquals("War", puzzle.getTitle());
        }

        @Test
        void testPropertyTitleMap() {
            Puzzle puzzle = new Gson().fromJson(JSON_PUZZLE, Puzzle.class);
            assertEquals("La Bataille", puzzle.getTitleMap().getName1());
            assertEquals("War", puzzle.getTitleMap().getName2());
        }

        @Test
        void testPropertyDescription() {
            Puzzle puzzle = new Gson().fromJson(JSON_PUZZLE, Puzzle.class);
            assertEquals(
                    "<strong>Solve this special challenge and enter Winamax's world</strong>\n<br />\nScore, get contacted, and grab the chance to meet the Winamax tech team.",
                    puzzle.getDescription());
        }

        @Test
        void testPropertyStatement() {
            Puzzle puzzle = new Gson().fromJson(JSON_PUZZLE, Puzzle.class);
            assertEquals("salut", puzzle.getStatement());
        }

        @Test
        void testPropertyValidatorScore() {
            Puzzle puzzle = new Gson().fromJson(JSON_PUZZLE, Puzzle.class);
            assertEquals(0, puzzle.getValidatorScore());
        }

        @Test
        void testPropertyAchievementCount() {
            Puzzle puzzle = new Gson().fromJson(JSON_PUZZLE, Puzzle.class);
            assertEquals(2, puzzle.getAchievementCount());
        }

        @Test
        void testPropertyDoneAchievementCount() {
            Puzzle puzzle = new Gson().fromJson(JSON_PUZZLE, Puzzle.class);
            assertEquals(0, puzzle.getDoneAchievementCount());
        }

        @Test
        void testPropertyLinkedAchievements() {
            Puzzle puzzle = new Gson().fromJson(JSON_PUZZLE, Puzzle.class);
            assertEquals(2, puzzle.getLinkedAchievements().size());
            assertEquals("PZ_50P_P50", puzzle.getLinkedAchievements().get(0).getId());
            assertEquals("PZ_100P_P50", puzzle.getLinkedAchievements().get(1).getId());
        }

        @Test
        void testPropertyForumLink() {
            Puzzle puzzle = new Gson().fromJson(JSON_PUZZLE, Puzzle.class);
            assertEquals("war-puzzle-discussion/2417", puzzle.getForumLink());
        }

        @Test
        void testPropertySolvedCount() {
            Puzzle puzzle = new Gson().fromJson(JSON_PUZZLE, Puzzle.class);
            assertEquals(18153, puzzle.getSolvedcount());
        }

        @Test
        void testPropertyAttemptCount() {
            Puzzle puzzle = new Gson().fromJson(JSON_PUZZLE, Puzzle.class);
            assertEquals(27674, puzzle.getAttemptCount());
        }

        @Test
        void testPropertyXpPoints() {
            Puzzle puzzle = new Gson().fromJson(JSON_PUZZLE, Puzzle.class);
            assertEquals(100, puzzle.getXpPoints());
        }

        @Test
        void testPropertyFeedback() {
            Puzzle puzzle = new Gson().fromJson(JSON_PUZZLE, Puzzle.class);
            assertEquals(1615, puzzle.getFeedback().getFeedbackId());
            assertEquals(5, puzzle.getFeedback().getFeedbacks().length);
            assertEquals(44, puzzle.getFeedback().getFeedbacks()[0]);
            assertEquals(81, puzzle.getFeedback().getFeedbacks()[1]);
            assertEquals(155, puzzle.getFeedback().getFeedbacks()[2]);
            assertEquals(365, puzzle.getFeedback().getFeedbacks()[3]);
            assertEquals(664, puzzle.getFeedback().getFeedbacks()[4]);
        }

        @Test
        void testPropertyTopics() {
            Puzzle puzzle = new Gson().fromJson(JSON_PUZZLE, Puzzle.class);
            assertEquals(1, puzzle.getTopics().size());
            assertEquals("data-structures", puzzle.getTopics().get(0).getHandle());
            assertSame(TopicCategory.FUNDAMENTALS, puzzle.getTopics().get(0).getCategory());
            assertEquals("Data Structures", puzzle.getTopics().get(0).getValue());
            assertEquals(1, puzzle.getTopics().get(0).getChildren().size());
            assertEquals("queues", puzzle.getTopics().get(0).getChildren().get(0).getHandle());
            assertSame(TopicCategory.FUNDAMENTALS, puzzle.getTopics().get(0).getChildren().get(0).getCategory());
            assertEquals("Queues", puzzle.getTopics().get(0).getChildren().get(0).getValue());
            assertEquals(0, puzzle.getTopics().get(0).getChildren().get(0).getChildren().size());
        }

        @Test
        void testPropertyDetailsPageUrl() {
            Puzzle puzzle = new Gson().fromJson(JSON_PUZZLE, Puzzle.class);
            assertEquals("/training/medium/winamax-battle", puzzle.getDetailsPageUrl());
        }

        @Test
        void testPropertyPuzzleType() {
            Puzzle puzzle = new Gson().fromJson(JSON_PUZZLE, Puzzle.class);
            assertSame(PuzzleType.CODE, puzzle.getType());
        }

        @Test
        void testPropertyPrettyId() {
            Puzzle puzzle = new Gson().fromJson(JSON_PUZZLE, Puzzle.class);
            assertEquals("winamax-battle", puzzle.getPrettyId());
        }

        @Test
        void testPropertyCommunityCreation() {
            Puzzle puzzle = new Gson().fromJson(JSON_PUZZLE, Puzzle.class);
            assertFalse(puzzle.isCommunityCreation());
        }

        @Test
        void testPropertyCreationTime() {
            Puzzle puzzle = new Gson().fromJson(JSON_PUZZLE, Puzzle.class);
            assertEquals(1422957376000l, puzzle.getCreationTime());
        }

    }

}

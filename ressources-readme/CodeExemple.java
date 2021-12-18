import java.util.List;

import com.github.mathieusoysal.codingame_stats.puzzle.Puzzle;
import com.github.mathieusoysal.codingame_stats.puzzle.achievement.Achievement;
import com.github.mathieusoysal.codingame_stats.puzzle.topic.Topic;
import com.github.mathieusoysal.codingame_stats.CodinGame;

public class CodeExemple {

    public static void main(String[] args) {
        CodinGame codinGame = new CodinGame();

        // Get all puzzles of CodinGame
        List<Puzzle> puzzles = codinGame.getPuzzles();

        // Iterate over all puzzles
        for (Puzzle puzzle : puzzles) {
            // Print the title of the puzzle
            System.out.println(puzzle.getTitle());

            // Print the solved count of the puzzle
            System.out.println(puzzle.getSolvedcount());

            // Print the attempt count of the puzzle
            System.out.println(puzzle.getAttemptCount());

            // Print the achievement count of the puzzle
            System.out.println(puzzle.getAchievementCount());

            // Print the xp points of the puzzle
            System.out.println(puzzle.getXpPoints());

            // Print the created date of the puzzle
            System.out.println(puzzle.getCreatedDate());

            // Print the title of the puzzle
            System.out.println(puzzle.getTitle());

            // Print the contributor of the puzzle
            System.out.println(puzzle.getContributor());

            // Print the topics of the puzzle
            for (Topic topic : puzzle.getTopics()) {
                System.out.println(topic.getHandle());
                System.out.println(topic.getValue());
            }

            // Print the achievements of the puzzle
            for (Achievement achievement : puzzle.getLinkedAchievements()) {
                System.out.println(achievement.getTitle());
                System.out.println(achievement.getDescription());
                System.out.println(achievement.getPoints());
                System.out.println(achievement.getLevel());
            }

        }

    }
}

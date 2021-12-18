![GitHub Actions](https://github.com/DevLab-umontp/API-JAVA-EDT/workflows/Java%20CI%20with%20Maven/badge.svg)

## <img src="https://www.svgrepo.com/show/232495/java.svg" width="100"> CodinGame Puzzles stats library[![GitHub](https://img.shields.io/github/license/MathieuSoysal/CodinGame-Puzzles-stats-library)](https://github.com/MathieuSoysal/CodinGame-Puzzles-stats-library/blob/master/LICENSE)

Simple library for interacting with CodinGame's puzzle API.

## How to integrate the CodinGame-Puzzles-Stats-library into your code

**Required Java version :** 17

### Maven 

If you have Maven, add the following to the dependencies of your `pom.xml` file:

```xml
<dependency>
  <groupId>io.github.mathieusoysal</groupId>
  <artifactId>CodinGame-Puzzles-Stats</artifactId>
  <version>1.0.0</version>
</dependency>
```

>*See an example of a [pom.xml](https://github.com/DevLab-umontp/Librarie-Java-EDT/blob/main/ressources/pom.xml#L20L24) file with the CodinGame-Puzzles-stats-library*
### Gradle

If you are using Gradle, add the following to the dependencies of your `build.gradle` file:

```
    implementation 'io.github.mathieusoysal:CodinGame-Puzzles-Stats:1.0.0'
```

## Example code for using the CodinGame-Puzzles-Stats library

```java
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
```
>*See more [code samples](ressources/ExempleDeCode.java)*
## Contribution
Suggestions and contributions are always welcome! Please discuss larger changes via an [issue](https://github.com/MathieuSoysal/CodinGame-Puzzles-stats-library/issues) before submitting a request.

## Licence

This project is released under the [GNU General Public License v3.0](https://github.com/MathieuSoysal/CodinGame-Puzzles-stats-library/blob/master/LICENSE)

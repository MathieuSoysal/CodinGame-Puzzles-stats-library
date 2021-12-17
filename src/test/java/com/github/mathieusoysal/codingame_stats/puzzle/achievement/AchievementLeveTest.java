package com.github.mathieusoysal.codingame_stats.puzzle.achievement;

import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class AchievementLeveTest {

    @Test
    public void test() {
        AchievementLevel[] levels = AchievementLevel.values();
        assert levels.length == 3;
        assert levels[0] == AchievementLevel.BRONZE;
        assert levels[1] == AchievementLevel.SILVER;
        assert levels[2] == AchievementLevel.GOLD;
    }

    @Test
    public void testComparator() {
        assertThat(AchievementLevel.BRONZE, lessThan(AchievementLevel.SILVER));
        assertThat(AchievementLevel.BRONZE, lessThan(AchievementLevel.GOLD));
        assertThat(AchievementLevel.SILVER, lessThan(AchievementLevel.GOLD));
    }

}

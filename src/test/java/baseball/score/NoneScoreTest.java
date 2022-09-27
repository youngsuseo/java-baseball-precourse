package baseball.score;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NoneScoreTest {

    @Test
    void construct() {
        NoneScore noneScore = new NoneScore();
        assertThat(noneScore).isNotNull();
    }
}
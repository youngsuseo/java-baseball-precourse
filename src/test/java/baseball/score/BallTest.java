package baseball.score;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BallTest {

    @Test
    void construct() {
        Ball ball = new Ball();
        assertThat(ball).isNotNull();
    }
}
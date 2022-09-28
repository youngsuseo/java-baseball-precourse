package baseball.score;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import static org.assertj.core.api.Assertions.assertThat;

public class BallTest {

    @Test
    void construct() {
        Ball ball = new Ball();
        assertThat(ball).isNotNull();
    }
}
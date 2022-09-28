package test.score;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StrikeTest {

    @Test
    void construct() {
        Strike strike = new Strike();
        assertThat(strike).isNotNull();
    }
}
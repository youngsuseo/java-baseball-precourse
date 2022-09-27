package baseball.score;

import baseball.number.Inputs;
import baseball.number.Results;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class NumberMatcherTest {

    @Test
    void construct() {
        Results results = new Results("123");
        Inputs inputs = new Inputs("243");

        NumberMatcher numberMatcher = new NumberMatcher(results, inputs);
        List<Score> scores = numberMatcher.match();
        assertThat(scores).isNotNull();
    }
}
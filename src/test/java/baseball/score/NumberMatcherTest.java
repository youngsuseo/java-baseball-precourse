package baseball.score;

import baseball.number.Inputs;
import baseball.number.Results;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

public class NumberMatcherTest {

    @DisplayName("결과값과 입력한 값이 올바른지 확인한다.")
    @Test
    void match() {
        Results results = new Results("123");
        Inputs inputs = new Inputs("243");

        NumberMatcher numberMatcher = new NumberMatcher(results, inputs);
        List<Score> scores = numberMatcher.match();

        assertAll(
                () -> assertThat(scores.get(0)).isInstanceOf(Ball.class),
                () -> assertThat(scores.get(1)).isInstanceOf(NoneScore.class),
                () -> assertThat(scores.get(2)).isInstanceOf(Strike.class)
        );
    }

    @DisplayName("숫자 야구 결과값을 받는다.")
    @Test
    void matchedResult() {
        Results results = new Results("123");
        Inputs inputs = new Inputs("243");

        NumberMatcher numberMatcher = new NumberMatcher(results, inputs);
        Map<Score, Integer> scoreIntegerMap = numberMatcher.matchedResult();

        assertAll(
                () -> assertThat(scoreIntegerMap.get(new Strike())).isEqualTo(1),
                () -> assertThat(scoreIntegerMap.get(new Ball())).isEqualTo(1),
                () -> assertThat(scoreIntegerMap.get(new NoneScore())).isEqualTo(1)
        );
    }
}
package test.score;

import test.number.Inputs;
import test.number.Results;
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
        List<ScoreEnum> match = numberMatcher.match();

        assertAll(
                () -> assertThat(match.get(0)).isEqualTo(ScoreEnum.BALL),
                () -> assertThat(match.get(1)).isEqualTo(ScoreEnum.NONE),
                () -> assertThat(match.get(2)).isEqualTo(ScoreEnum.STRIKE)
        );
    }

    @DisplayName("숫자 야구 결과값을 받는다.")
    @Test
    void matchedResult() {
        Results results = new Results("123");
        Inputs inputs = new Inputs("243");

        NumberMatcher numberMatcher = new NumberMatcher(results, inputs);
        Map<ScoreEnum, Integer> scoreEnumIntegerMap = numberMatcher.matchedResult();

        assertAll(
                () -> assertThat(scoreEnumIntegerMap.get(ScoreEnum.STRIKE)).isEqualTo(1),
                () -> assertThat(scoreEnumIntegerMap.get(ScoreEnum.BALL)).isEqualTo(1),
                () -> assertThat(scoreEnumIntegerMap.get(ScoreEnum.NONE)).isEqualTo(1)
        );
    }
}
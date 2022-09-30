package baseball.number;

import baseball.score.Score;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

public class NumberMatcherTest {

    @DisplayName("결과값과 입력한 값이 올바른지 확인한다.")
    @Test
    void match() {
        TargetNumbers targetNumbers = new TargetNumbers("123");
        InputNumbers inputNumbers = new InputNumbers("243");

        NumberMatcher numberMatcher = new NumberMatcher(targetNumbers, inputNumbers);
        List<Score> match = numberMatcher.match();

        assertAll(
                () -> assertThat(match.get(0)).isEqualTo(Score.BALL),
                () -> assertThat(match.get(1)).isEqualTo(Score.NOTHING),
                () -> assertThat(match.get(2)).isEqualTo(Score.STRIKE)
        );
    }
}

package baseball.number;

import baseball.score.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class InputTest {

    @DisplayName("input 데이터 클래스를 정상적으로 생성한다.")
    @Test
    void construct() {
        String inputNumber = "1";
        int inputIndex = 1;
        Input input = new Input(inputIndex, inputNumber);
        assertThat(input).isNotNull();
    }

    @DisplayName("데이터의 값이 숫자 타입이 아닌 경우 예외를 발생합니다.")
    @Test
    void construct_fail() {
        String inputData = "A";
        int inputIndex = 1;
        assertThatThrownBy(() -> new Input(inputIndex, inputData)).isInstanceOf(NumberFormatException.class)
                .hasMessageContaining("For input string: \"" + inputData + "\"");
    }

//    @DisplayName("데이터의 값이 숫자 타입이 아닌 경우 예외를 발생합니다.")
//    @ParameterizedTest
//    @ValueSource(strings = {"A"})
//    void construct_fail(String inputData) {
//        assertThatThrownBy(() -> new Input(inputData)).isInstanceOf(NumberFormatException.class)
//                .hasMessageContaining("For input string: " + inputData);
//    }

    @DisplayName("ball 출력")
    @Test
    void match_ball() {
        Results results = new Results("123");

        Input input = new Input(1, 1);
        ScoreEnum scoreEnum = input.match(results);

        assertThat(scoreEnum).isEqualTo(ScoreEnum.BALL);
    }

    @DisplayName("strike 출력")
    @Test
    void match_strike() {
        Results results = new Results("123");

        Input input = new Input(0, 1);
        ScoreEnum scoreEnum = input.match(results);

        assertThat(scoreEnum).isEqualTo(ScoreEnum.STRIKE);
    }

    @DisplayName("noneScore 출력")
    @Test
    void match_noneScore() {
        Results results = new Results("123");

        Input input = new Input(0, 7);
        ScoreEnum scoreEnum = input.match(results);

        assertThat(scoreEnum).isEqualTo(ScoreEnum.NONE);
    }
}
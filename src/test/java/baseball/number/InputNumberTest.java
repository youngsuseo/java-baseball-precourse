package baseball.number;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class InputNumberTest {
    @DisplayName("InputNumber 클래스를 정상적으로 생성한다.")
    @Test
    void construct() {
        String input = "1";
        InputNumber inputNumber = new InputNumber(input);
        assertThat(inputNumber).isEqualTo(new InputNumber(1));
    }

    @DisplayName("데이터의 값이 숫자 타입이 아닌 경우 NumberFormatException이 발생한다.")
    @Test
    void constructWithNotNumber() {
        String inputData = "A";
        assertThatThrownBy(() -> new InputNumber(inputData)).isInstanceOf(NumberFormatException.class)
                .hasMessageContaining("For input string: \"" + inputData + "\"");
    }

    @DisplayName("InputNumber 클래스 생성시에 3글자가 아닌 경우 예외를 발생한다.")
    @ParameterizedTest
    @ValueSource(strings = {"0", "10"})
    void constructWithOutOfRangeNumbers(String inputData) {
        assertThatThrownBy(() -> new InputNumber(inputData)).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("숫자는 1이상, 9이하의 숫자만 입력 가능합니다.");
    }
}

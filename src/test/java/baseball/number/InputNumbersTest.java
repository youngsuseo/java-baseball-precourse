package baseball.number;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class InputNumbersTest {
    @DisplayName("InputNumbers 클래스가 정상적으로 생성되어, InputNumber 클래스를 정상적으로 생성하는지 확인한다.")
    @Test
    void construct() {
        String inputData = "123";
        InputNumbers inputNumbers = new InputNumbers(inputData);
        List<InputNumber> inputNumberList = inputNumbers.getInputNumberList();
        Assertions.assertThat(inputNumberList).hasSize(3);

        assertAll(
                () -> assertEquals(inputNumberList.get(0), new InputNumber(1)),
                () -> assertEquals(inputNumberList.get(1), new InputNumber(2)),
                () -> assertEquals(inputNumberList.get(2), new InputNumber(3))
        );
    }

    @DisplayName("InputNumbers 클래스 생성시에 3글자가 아닌 경우 예외를 발생한다.")
    @ParameterizedTest
    @ValueSource(strings = {"12", "1234"})
    void constructWithInvalidDataLength(String inputData) {
        assertThatThrownBy(() -> new InputNumbers(inputData)).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("3개의 숫자를 입력해주세요.");
    }
}

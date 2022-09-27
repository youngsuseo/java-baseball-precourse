package baseball.number;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class InputsTest {

    @DisplayName("inputs 클래스가 정상적으로 생성되는지 확인한다.")
    @Test
    void construct() {
        String inputData = "123";
        Inputs inputs = new Inputs(inputData);
        List<Input> inputList = inputs.getInputs();
        assertThat(inputList).hasSize(3);

        assertAll(
                () -> assertEquals(inputList.get(0), new Input(0, 1)),
                () -> assertEquals(inputList.get(1), new Input(1, 2)),
                () -> assertEquals(inputList.get(2), new Input(2, 3))
        );
    }

    @DisplayName("inputs 클래스 생성시에 3글자가 아닌 경우 예외를 발생한다.")
    @Test
    void construct_fail() {
        String inputData = "1234";
        assertThatThrownBy(() -> new Inputs(inputData)).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("3개의 숫자를 입력해주세요.");
    }


}
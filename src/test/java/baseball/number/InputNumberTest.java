package baseball.number;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class InputNumberTest {
    @DisplayName("InputNumber 클래스를 정상적으로 생성한다.")
    @Test
    void construct() {
        String input = "1";
        InputNumber inputNumber = new InputNumber(input);
        assertThat(inputNumber).isEqualTo(new InputNumber(1));
    }
}

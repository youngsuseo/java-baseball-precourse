package baseball.number;

import java.util.Objects;

public class InputNumber {
    private static final int MINIMUM_NUMBER = 1;
    private static final int MAXIMUM_NUMBER = 9;

    private final int inputNumber;

    public InputNumber(String inputData) {
        this(Integer.parseInt(inputData));
    }

    public InputNumber(int inputNumber) {
        if (inputNumber < MINIMUM_NUMBER || inputNumber > MAXIMUM_NUMBER) {
            throw new IllegalArgumentException("숫자는 " + MINIMUM_NUMBER + "이상, " + MAXIMUM_NUMBER + "이하의 숫자만 입력 가능합니다.");
        }

        this.inputNumber = inputNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InputNumber that = (InputNumber) o;
        return inputNumber == that.inputNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(inputNumber);
    }
}

package baseball.number;

import java.util.Objects;

public class InputNumber {

    private final Number number;

    public InputNumber(String inputData) {
        this(Integer.parseInt(inputData));
    }

    public InputNumber(int inputNumber) {
        this(new Number(inputNumber));
    }

    public InputNumber(Number number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InputNumber that = (InputNumber) o;
        return Objects.equals(number, that.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
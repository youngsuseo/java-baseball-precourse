package baseball.number;

import java.util.Objects;

public class TargetNumber {

    private final Number number;

    public TargetNumber(String targetNumberString) {
        this(Integer.parseInt(targetNumberString));
    }

    public TargetNumber(int targetNumber) {
        this(new Number(targetNumber));
    }

    public TargetNumber(Number number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TargetNumber that = (TargetNumber) o;
        return Objects.equals(number, that.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}

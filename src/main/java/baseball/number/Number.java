package baseball.number;

import java.util.Objects;

public class Number {
    private static final int MINIMUM_NUMBER = 1;
    private static final int MAXIMUM_NUMBER = 9;

    private final int number;

    Number(String number) {
        this(Integer.parseInt(number));
    }

    Number(int number) {
        if (number < MINIMUM_NUMBER || number > MAXIMUM_NUMBER) {
            throw new IllegalArgumentException("숫자는 " + MINIMUM_NUMBER + "이상, " + MAXIMUM_NUMBER + "이하의 숫자만 입력 가능합니다.");
        }
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Number number1 = (Number) o;
        return number == number1.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}

package test.number;

import test.score.ScoreEnum;

import java.util.List;
import java.util.Objects;

public class Input {

    private final int inputIndex; // FIXME 원시값 포장
    private final int inputNumber;

    public Input(int inputIndex, String inputNumberString) {
        // FIXME String을 int로 변경할 수 있는지 검증로직 추가, custom 예외로 전환하여 던지는 것 고려 필요
        this.inputIndex = inputIndex;
        this.inputNumber = Integer.parseInt(inputNumberString);
    }

    public Input(int inputIndex, int inputNumber) {
        this.inputIndex = inputIndex;
        this.inputNumber = inputNumber;
    }

    public ScoreEnum match(Results results) {
        List<Result> resultList = results.getResultList();
        // Strike인지 판단한다.
        if (resultList.get(inputIndex).equals(Result.getCachedResult(inputNumber))) {
            return ScoreEnum.STRIKE;
        }

        // Ball인지 판단한다.
        for (int i = 0; i < resultList.size(); i++) {
            if (resultList.get(i).equals(Result.getCachedResult(inputNumber))) {
                return ScoreEnum.BALL;
            }
        }

        // 아니면 None 리턴
        return ScoreEnum.NONE;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Input input = (Input) o;
        return inputIndex == input.inputIndex && inputNumber == input.inputNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(inputIndex, inputNumber);
    }
}
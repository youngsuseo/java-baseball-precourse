package baseball.number;

import baseball.score.Score;

import java.util.List;

public class NumberMatcher {

    private final TargetNumbers targetNumbers;
    private final InputNumbers inputNumbers;

    public NumberMatcher(TargetNumbers targetNumbers, InputNumbers inputNumbers) {
        this.targetNumbers = targetNumbers;
        this.inputNumbers = inputNumbers;
    }

    public List<Score> match() {
        return inputNumbers.match(targetNumbers);
    }
}

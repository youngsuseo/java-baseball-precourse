package baseball.number;

import baseball.number.Input;
import baseball.score.Score;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Inputs {
    private static final int COUNT_OF_NUMBERS = 3;

    private final List<Input> inputs;

    public Inputs(String inputNumbers) {
        String[] splitNumbers = inputNumbers.split("");
        inputs = IntStream.range(0, splitNumbers.length).mapToObj(index -> new Input(index, splitNumbers[index])) // FIXME Stream 대신 for 사용!
                          .collect(Collectors.toList());
        if (inputs.size() != COUNT_OF_NUMBERS) {
            throw new IllegalArgumentException("3개의 숫자를 입력해주세요.");
        }
    }

    public List<Score> match(Results results) {
        List<Score> scores = new ArrayList<>();
        for (Input input : inputs) {
            scores.add(input.match(results));
        }
        return scores;
    }

    public List<Input> getInputs() { // FIXME 우선 getter 생성하고 추후 사용하지 않으면 제거
        return inputs;
    }
}
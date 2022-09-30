package baseball.number;

import java.util.ArrayList;
import java.util.List;

import static baseball.number.NumberConstant.COUNT_OF_NUMBERS;

public class InputNumbers {
    private final List<InputNumber> inputNumberList;

    public InputNumbers(String inputData) {
        inputNumberList = new ArrayList<>();

        String[] splitNumbers = inputData.split("");
        for (String splitNumber : splitNumbers) {
            inputNumberList.add(new InputNumber(splitNumber));
        }

        if (inputNumberList.size() != COUNT_OF_NUMBERS) {
            throw new IllegalArgumentException(COUNT_OF_NUMBERS + "개의 숫자를 입력해주세요.");
        }
    }

    public List<InputNumber> getInputNumberList() {
        return inputNumberList;
    }
}

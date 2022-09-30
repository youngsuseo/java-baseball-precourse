package baseball.number;

import java.util.ArrayList;
import java.util.List;

public class TargetNumbers {

    private final List<TargetNumber> targetNumberList;

    public TargetNumbers(ExtractNumberStrategy extractNumberStrategy) {
        targetNumberList = new ArrayList<>();

        List<Integer> integerList = extractNumberStrategy.extract();
        for (Integer integer : integerList) {
            targetNumberList.add(new TargetNumber(integer));
        }
    }

    public List<TargetNumber> getTargetNumberList() {
        return targetNumberList;
    }
}

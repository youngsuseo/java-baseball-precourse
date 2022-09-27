package baseball;

import baseball.number.Inputs;
import baseball.number.Results;
import baseball.score.NumberMatcher;
import baseball.score.Score;
import baseball.score.ScoreEnum;
import camp.nextstep.edu.missionutils.Console;
import view.InputView;
import view.ResultView;

import java.util.List;
import java.util.Map;

public class Application {
    public static void main(String[] args) {
        Results results = new Results();

        while (true) {
            String inputNumber = InputView.inputNumber();
            Inputs inputs = new Inputs(inputNumber);
            NumberMatcher numberMatcher = new NumberMatcher(results, inputs);
            Map<ScoreEnum, Integer> scoreEnumIntegerMap = numberMatcher.matchedResult();
            ResultView.printResult(scoreEnumIntegerMap);

            if (scoreEnumIntegerMap.get(ScoreEnum.STRIKE) == 3) {
                ResultView.printDone();
                break;
            }
        }


        // TODO: 프로그램 구현
    }
}

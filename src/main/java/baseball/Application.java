package baseball;

import baseball.number.Inputs;
import baseball.number.Results;
import baseball.score.NumberMatcher;
import baseball.score.ScoreEnum;
import view.InputView;
import view.ResultView;

import java.util.Map;

public class Application {
    public static void main(String[] args) {
        game();
    }

    private static void game() {
        Results results = new Results();

        while (true) {
            String inputNumber = InputView.inputNumber();
            Inputs inputs = new Inputs(inputNumber);
            NumberMatcher numberMatcher = new NumberMatcher(results, inputs);
            Map<ScoreEnum, Integer> scoreEnumIntegerMap = numberMatcher.matchedResult();
            ResultView.printResult(scoreEnumIntegerMap);

            if (scoreEnumIntegerMap.get(ScoreEnum.STRIKE) == 3) {
                ResultView.printDone();
                String retry = InputView.retry(); // FIXME 해당 로직도 재귀적으로 좀 더 깔끔하게 정리할 수 있을 것 같다.
                if (retry.equals("1")) {
                    game();
                }
                break;
            }
        }
//        System.exit(0); // TODO 상태값 1, -1은 정상적이지 않은 오류 값으로 -> 예외 발생하면 custom exception에서 출력하도록
    }
}

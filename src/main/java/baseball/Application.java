package baseball;

import baseball.number.Inputs;
import baseball.number.Results;
import baseball.score.Score;
import camp.nextstep.edu.missionutils.Console;
import view.InputView;
import view.ResultView;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        String inputNumber = InputView.inputNumber();
        Results results = new Results();

        Inputs inputs = new Inputs(inputNumber);
        List<Score> match = inputs.match(results);

        ResultView.printResult(match);


        // TODO: 프로그램 구현
    }
}

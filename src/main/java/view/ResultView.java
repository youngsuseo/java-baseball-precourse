package view;

import baseball.score.Score;
import baseball.score.ScoreEnum;

import java.util.List;
import java.util.Map;

public class ResultView {

    private ResultView() {

    }

    public static void printResult(Map<ScoreEnum, Integer> scoreEnumIntegerMap) {
        StringBuilder stringBuilder = new StringBuilder();
        if (scoreEnumIntegerMap.get(ScoreEnum.BALL) != 0) { // FIXME 비었는지 결과 출력하도록 메시지 전달 -> scoreEnumIntegerMap 도 일급 컬렉션으로 만듦
            stringBuilder.append(scoreEnumIntegerMap.get(ScoreEnum.BALL)).append("볼").append(" ");
        }

        if (scoreEnumIntegerMap.get(ScoreEnum.STRIKE) != 0) { // FIXME 비었는지 결과 출력하도록 메시지 전달 -> scoreEnumIntegerMap 도 일급 컬렉션으로 만듦
            stringBuilder.append(scoreEnumIntegerMap.get(ScoreEnum.STRIKE)).append("스트라이크");
        }

        System.out.println(stringBuilder);
    }

    public static void printDone() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임종료");
    }
}

package baseball.score;

import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class Scores {
    private Map<ScoreEnum, Integer> scoreEnumIntegerMap;

    public Scores(List<ScoreEnum> scoreEnumList) {
        initial(scoreEnumList);
    }

    public Scores(Map<ScoreEnum, Integer> scoreEnumIntegerMap) {
        this.scoreEnumIntegerMap = scoreEnumIntegerMap;
    }

    private void initial(List<ScoreEnum> scoreEnumList) {
        Map<ScoreEnum, Integer> scoreEnumIntegerMap = ScoreEnum.scoreMap();
        for (ScoreEnum score : scoreEnumList) {
            scoreEnumIntegerMap.merge(score, 1, Integer::sum); // FIXME 어떻게 결과값을 전달할 것인지?
        }
    }

    public Map<ScoreEnum, Integer> getScoreEnumIntegerMap() {
        return Collections.unmodifiableMap(scoreEnumIntegerMap);
    }
}

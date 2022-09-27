package baseball.score;

import baseball.number.Inputs;
import baseball.number.Results;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberMatcher {
    // FIXME 또한 공유 문제가 있어 테스트 할때마다 데이터를 지우고 수행해야한다.
    private static final Map<ScoreEnum, Integer> MATCHED_RESULTS = new HashMap<ScoreEnum, Integer>() {
        {
            put(ScoreEnum.STRIKE, 0); // FIXME s class 대신 enum을 사용할지 고민 필요
            put(ScoreEnum.BALL, 0);
            put(ScoreEnum.NONE, 0);
        }
    }; // FIXME enum을 사용할거라면 EnumMap 사용 고려

    private final Results results;
    private final Inputs inputs;

    public NumberMatcher(Results results, Inputs inputs) {
        this.results = results;
        this.inputs = inputs;
    }

    public List<ScoreEnum> match() { // FIXME 필요없으면 삭제
        return inputs.match(results);
    }

    public Map<ScoreEnum, Integer> matchedResult() {
        List<ScoreEnum> match = inputs.match(results);
        for (ScoreEnum score : match) {
            MATCHED_RESULTS.merge(score, 1, Integer::sum);
        }
        return MATCHED_RESULTS;
    }
}
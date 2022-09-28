package baseball.score;

import baseball.number.Inputs;
import baseball.number.Results;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberMatcher {
    // FIXME 또한 공유 문제가 있어 테스트 할때마다 데이터를 지우고 수행해야한다.
    private static final Map<ScoreEnum, Integer> MATCHED_RESULTS;

    private final Results results;
    private final Inputs inputs;

    static {
        MATCHED_RESULTS = new EnumMap<ScoreEnum, Integer>(ScoreEnum.class) {
            {
                put(ScoreEnum.STRIKE, 0); // FIXME s class 대신 enum을 사용할지 고민 필요
                put(ScoreEnum.BALL, 0);
                put(ScoreEnum.NONE, 0);
            }
        };
    }

    public NumberMatcher(Results results, Inputs inputs) {
        this.results = results;
        this.inputs = inputs;
    }

    public List<ScoreEnum> match() { // FIXME 필요없으면 삭제
        return inputs.match(results);
    }

    public Map<ScoreEnum, Integer> matchedResult() {
        List<ScoreEnum> match = inputs.match(results);
        initialMatchedResults();
        for (ScoreEnum score : match) {
            MATCHED_RESULTS.merge(score, 1, Integer::sum);
        }
        return MATCHED_RESULTS;
    }

    private void initialMatchedResults() {
        for (Map.Entry<ScoreEnum, Integer> entry : MATCHED_RESULTS.entrySet()) {
            MATCHED_RESULTS.put(entry.getKey(), 0);
        }
    }
}
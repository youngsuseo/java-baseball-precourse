package baseball.score;

import baseball.number.Inputs;
import baseball.number.Results;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberMatcher {
    private static final Map<Score, Integer> MATCHED_RESULTS = new HashMap<Score, Integer>() {
        {
            put(new Strike(), 0); // FIXME s class 대신 enum을 사용할지 고민 필요
            put(new Ball(), 0);
            put(new NoneScore(), 0);
        }
    };

    private final Results results;
    private final Inputs inputs;

    public NumberMatcher(Results results, Inputs inputs) {
        this.results = results;
        this.inputs = inputs;
    }

    public List<Score> match() { // FIXME 필요없으면 삭제
        return inputs.match(results);
    }

    public Map<Score, Integer> matchedResult() {
        List<Score> match = inputs.match(results);
        for (Score score : match) {
            MATCHED_RESULTS.merge(score, 1, Integer::sum);
        }
        return MATCHED_RESULTS;
    }
}
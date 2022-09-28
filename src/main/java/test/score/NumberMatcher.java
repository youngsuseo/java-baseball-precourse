package test.score;

import test.number.Inputs;
import test.number.Results;

import java.util.List;
import java.util.Map;

public class NumberMatcher {
    private final Results results;
    private final Inputs inputs;

    public NumberMatcher(Results results, Inputs inputs) {
        this.results = results;
        this.inputs = inputs;
    }

    public List<ScoreEnum> match() { // FIXME 필요없으면 삭제
        return inputs.match(results);
    }

    public Map<ScoreEnum, Integer> matchedResult() { // FIXME Map 내부 로직 일급컬렉션으로 추출
        List<ScoreEnum> match = inputs.match(results);
        Scores scores = new Scores(match);
        return scores.getScoreEnumIntegerMap();
    }
}
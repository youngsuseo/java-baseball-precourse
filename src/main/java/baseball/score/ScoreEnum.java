package baseball.score;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;

public enum ScoreEnum {
    STRIKE,
    BALL,
    NONE;

    private static final Map<ScoreEnum, Integer> CACHED_SCORE_MAP = new EnumMap<>(ScoreEnum.class);

    static {
        for (ScoreEnum value : values()) {
            CACHED_SCORE_MAP.put(value, 0);
        }
    }

    public static Map<ScoreEnum, Integer> scoreMap() {
        return Collections.unmodifiableMap(CACHED_SCORE_MAP);
    }
}

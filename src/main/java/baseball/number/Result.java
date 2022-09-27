package baseball.number;

import java.io.InputStream;
import java.util.*;

public class Result {
    private static final int RANDOM_NUMBER_SIZE = 10;
    private static final Map<Integer, Result> CACHED_RESULTS = new LinkedHashMap<Integer, Result>() {
        {
            for (int i = 1; i < RANDOM_NUMBER_SIZE; i++) {
                put(i, new Result(i));
            }
        }
    };

    public int resultNumber;

    public Result() {
        // FIXME initial 호출해서 데이터 출력할 수 있도록
        resultNumber = initial();
    }

    public Result(String resultNumber) {
        this(Integer.parseInt(resultNumber));
    }

    public Result(int resultNumber) {
        this.resultNumber = resultNumber;
    }

    int initial() { // private로 변환
        Random random = new Random();
        return random.nextInt(9); // 1~9까지 이므로 데이터 수정 필요, FIXME missionUtils사용건으로 변경
    }

    public static Result getCachedResult(int resultNumber) {
        return CACHED_RESULTS.get(resultNumber);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Result result = (Result) o;
        return resultNumber == result.resultNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(resultNumber);
    }
}
package test.number;

import camp.nextstep.edu.missionutils.Randoms;

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
        // FIXME initial 호출해서 데이터 출력할 수 있도록 -> Result에서는 랜덤값을 만들지 않도록
        resultNumber = initial();
    }

    public Result(String resultNumber) {
        this(Integer.parseInt(resultNumber));
    }

    public Result(int resultNumber) {
        this.resultNumber = resultNumber;
    }

    private int initial() {
        // FIXME random값 추출할 때 중복된 값 추출되지 않도록 -> Result에서는 랜덤값을 만들지 않도록
        return Randoms.pickNumberInRange(1, 9);
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
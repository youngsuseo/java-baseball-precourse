package baseball.number;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Results {

    private final List<Result> resultList;

    public Results() {
        resultList = initial();
    }

    public Results(String numbers) {
        resultList = Arrays.stream(numbers.split("")).map(Result::new).collect(Collectors.toList());
    }

    public Results(List<Result> resultList) {
        this.resultList = resultList;
    }

    private List<Result> initial() {
        return IntStream.range(0, 3).mapToObj(index -> new Result()).collect(Collectors.toList()); // FIXME Stream 대신 for 사용!
    }

    public List<Result> getResultList() {
        return resultList;
    }
}
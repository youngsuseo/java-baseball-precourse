package baseball.number;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Results {
    private static final int MAX_NUMBER = 9;
    private static final List<Integer> PICKABLE_NUMBER = Collections.unmodifiableList(new ArrayList<Integer>(){
        {
            for (int i = 1; i <= MAX_NUMBER; i++) {
                add(i);
            }
        }
    });


    private final List<Result> resultList;

    public Results() { // FIXME 혹시 필요하다면 정적 팩터리 메서드로 제공 : 랜덤 넘버 제공한다는 메서드 표기
        resultList = initial();
    }

    public Results(String numbers) {
        resultList = Arrays.stream(numbers.split("")).map(Result::new).collect(Collectors.toList());
    }

    public Results(List<Result> resultList) {
        this.resultList = resultList;
    }

    private List<Result> initial() { // FIXME 같은 숫자가 중복해서 나올 수 있으므로 해당 내용 수정 필요
        return IntStream.range(0, 3).mapToObj(index -> new Result()).collect(Collectors.toList()); // FIXME Stream 대신 for 사용!
    }

    public List<Result> getResultList() {
        return resultList;
    }
}
package baseball.number;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExtractRandomNumberByShuffleList implements ExtractNumberStrategy {

    @Override
    public List<Integer> extract() {
        List<Integer> integers = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            integers.add(i);
        }
        Collections.shuffle(integers);
        return Collections.unmodifiableList(integers.subList(0, 3));
    }
}

package test.number;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class ExtractRandomNumberByPickNumber implements ExtractNumberStrategy {

    @Override
    public List<Integer> extract() {
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            int randomNumber = Randoms.pickNumberInRange(0, 1);
            if (!integers.contains(randomNumber)) {
                integers.add(randomNumber);
            }
        }
        return integers;
    }
}

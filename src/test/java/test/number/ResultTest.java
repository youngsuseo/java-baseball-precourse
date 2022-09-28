package test.number;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ResultTest {

    @DisplayName("Result를 가지는 숫자들을 생성한다.")
    @Test
    void construct() {
        Result result = new Result();
        assertThat(result).isNotNull();
    }

//    @DisplayName("Result를 가지는 숫자들을 랜덤으로 생성한다. -> ")
//    @Test
//    void initial() {
//        Result result = new Result();
//        int initial = result.initial();
//        System.out.println("initial = " + initial);
//        assertThat(initial).isLessThan(10);
//    }
}
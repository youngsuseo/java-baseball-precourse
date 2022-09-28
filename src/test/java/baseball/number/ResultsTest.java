package baseball.number;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ResultsTest {

    @DisplayName("result 객체 생성을 성공한다.")
    @Test
    void construct() {
        Results results = new Results();
        assertThat(results.getResultList()).hasSize(3);
    }

    @DisplayName("result 객체 생성을 성공한다.")
    @Test
    void construct1() {
        Results results = new Results(new ExtractRandomNumberByShuffleList());
        assertThat(results.getResultList()).hasSize(3);
    }

}
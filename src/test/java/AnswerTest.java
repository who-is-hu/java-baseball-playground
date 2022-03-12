import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;

import static org.assertj.core.api.Assertions.assertThat;


class AnswerTest {

    @Test
    void 랜덤정답생성테스트(){
        ArrayList<Integer> answer = AnswerGenerator.createRandomAnswer();
        HashSet<Integer> numOfNoDupElements = new HashSet<>(answer);
        assertThat(numOfNoDupElements.size()).isEqualTo(AnswerGenerator.ANSWER_DIGIT);
    }


}
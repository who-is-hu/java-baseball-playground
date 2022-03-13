import org.junit.jupiter.api.Test;

import java.util.Arrays;
import static org.assertj.core.api.Assertions.assertThat;

public class BallsTest {

    private Balls answer = new Balls(Arrays.asList(1,2,3));

    @Test
    void strike() {
        assertThat(answer.compare(new Ball(1, 1))).isEqualTo(BallStatus.STRIKE);
    }

    @Test
    void ball() {
        assertThat(answer.compare(new Ball(1, 2))).isEqualTo(BallStatus.BALL);
    }

    @Test
    void miss() {
        assertThat(answer.compare(new Ball(5, 1))).isEqualTo(BallStatus.MISS);
    }

    @Test
    void strike1Ball2(){
        Judgement judgement = answer.compare(new Balls(Arrays.asList(1, 3, 2)));
        assertThat(judgement.getNumStrike()).isEqualTo(1);
        assertThat(judgement.getNumBall()).isEqualTo(2);
    }

    @Test
    void ball3() {
        Judgement judgement = answer.compare(new Balls(Arrays.asList(3, 1, 2)));
        assertThat(judgement.getNumStrike()).isEqualTo(0);
        assertThat(judgement.getNumBall()).isEqualTo(3);
    }

    @Test
    void threeStrike(){
        Judgement judgement = answer.compare(new Balls(Arrays.asList(1, 2, 3)));
        assertThat(judgement.getNumStrike()).isEqualTo(3);
        assertThat(judgement.getNumBall()).isEqualTo(0);
        assertThat(judgement.isGameEnd()).isEqualTo(true);
    }


}

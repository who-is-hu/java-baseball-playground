import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class BallTest {

    private Ball someBallInAnswer = new Ball(5, 3);

    @Test
    void compareStrike(){
        assertThat(someBallInAnswer.compare(new Ball(5, 3))).isEqualTo(BallStatus.STRIKE);
    }

    @Test
    void compareBall(){
        assertThat(someBallInAnswer.compare(new Ball(5, 2))).isEqualTo(BallStatus.BALL);
    }

    @Test
    void compareMiss(){
        assertThat(someBallInAnswer.compare(new Ball(3, 1))).isEqualTo(BallStatus.MISS);
    }
}



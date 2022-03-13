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


}

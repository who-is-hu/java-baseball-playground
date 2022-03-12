import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static org.assertj.core.api.Assertions.assertThat;

class RefereeTest {
    private Referee referee = new Referee();

    @Test
    void threeStrike() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> answer = new ArrayList<>(Arrays.asList(1, 2, 3));

        HashMap<Type, Integer> judgement = referee.judge(answer, input);
        assertThat(judgement.get(Type.STRIKE)).isEqualTo(3);
        assertThat(judgement.get(Type.BALL)).isEqualTo(0);
        assertThat(judgement.get(Type.MISS)).isEqualTo(0);
    }

    @Test
    void twoStrikeOneMiss () {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> answer = new ArrayList<>(Arrays.asList(1, 2, 9));

        HashMap<Type, Integer> judgement = referee.judge(answer, input);
        assertThat(judgement.get(Type.STRIKE)).isEqualTo(2);
        assertThat(judgement.get(Type.BALL)).isEqualTo(0);
        assertThat(judgement.get(Type.MISS)).isEqualTo(1);
    }

    @Test
    void oneStrikeTwoBall() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> answer = new ArrayList<>(Arrays.asList(1, 3, 2));

        HashMap<Type, Integer> judgement = referee.judge(answer, input);
        assertThat(judgement.get(Type.STRIKE)).isEqualTo(1);
        assertThat(judgement.get(Type.BALL)).isEqualTo(2);
        assertThat(judgement.get(Type.MISS)).isEqualTo(0);
    }
}
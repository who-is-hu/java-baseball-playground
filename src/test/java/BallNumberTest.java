import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;
import static org.assertj.core.api.Assertions.assertThat;

public class BallNumberTest {

    @Test
    public void 볼_값_유효값_검증(){
        Assertions.assertThatThrownBy(()->{
            new BallNumber(0);
        }).isInstanceOf(Exception.class);

        Assertions.assertThatThrownBy(()->{
            new BallNumber(10);
        }).isInstanceOf(Exception.class);
    }
}

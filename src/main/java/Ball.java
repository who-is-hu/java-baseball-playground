import java.util.Objects;

public class Ball {

    private BallNumber ballNumber;
    private int place; // 이건 귀찮아서.. 자리수 3 안넘어가는 검증하면 될듯

    public Ball(int number, int place) {
        this.ballNumber = new BallNumber(number);
        this.place = place;
    }

    public BallStatus compare(Ball ball) {
        if(this.equals(ball)) {
            return BallStatus.STRIKE;
        }
        if(this.isMatchBall(ball)) {
            return BallStatus.BALL;
        }
        return BallStatus.MISS;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return this.place == ball.place && this.ballNumber.equals(ball.ballNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ballNumber, place);
    }

    private boolean isMatchBall(Ball ball) {
        return this.ballNumber.equals(ball.ballNumber);
    }
}

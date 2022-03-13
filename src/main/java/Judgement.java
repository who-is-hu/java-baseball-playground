public class Judgement {

    private int ball;
    private int strike;

    public int getNumBall() {
        return ball;
    }

    public int getNumStrike() {
        return strike;
    }

    public void report(BallStatus status) {
        // 여긴 아무리 생각해도 else 가 있는게 더 나은것 같음
        if (status.isStrike()) {
            strike++;
        } else if (status.isBall()) {
            ball++;
        }
    }

    public boolean isGameEnd() {
        return strike == Balls.MAX_LENGTH;
    }
}

import java.util.ArrayList;
import java.util.List;

public class Balls {

    public static final int MAX_LENGTH = 3;
    private final ArrayList<Ball> balls;

    public Balls(List<Integer> ballNumbers) {
        this.balls = createBalls(ballNumbers);
    }

    private static ArrayList<Ball> createBalls(List<Integer> ballNumbers) {
        ArrayList<Ball> list = new ArrayList<>();
        for (int i = 0; i < MAX_LENGTH; i++) {
            list.add(new Ball(ballNumbers.get(i), i + 1));
        }
        return list;
    }

    public BallStatus compare(Ball ball) {
        return balls.stream()
                .map(thisBall -> thisBall.compare(ball))
                .filter(BallStatus::isNotMiss)
                .findFirst()
                .orElse(BallStatus.MISS);
    }

    public Judgement compare(Balls balls) {
        Judgement judgement = new Judgement();
        this.balls.stream()
                .forEach(ball -> judgement.report(balls.compare(ball)));
        return judgement;
    }
}

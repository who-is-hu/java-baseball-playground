import java.util.HashMap;

public class OutputManager {

    public static void showInningResult(HashMap<BallStatus, Integer> judgement) {
        if(judgement.get(BallStatus.MISS) == AnswerGenerator.ANSWER_DIGIT) {
            System.out.println("miss");
            return;
        }
        System.out.printf("%d strike %d ball\n", judgement.get(BallStatus.STRIKE), judgement.get(BallStatus.BALL));
    }
}

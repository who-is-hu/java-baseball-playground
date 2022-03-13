import java.util.HashMap;

public class OutputManager {

    public static void showInningResult(HashMap<Type, Integer> judgement) {
        if(judgement.get(Type.MISS) == AnswerGenerator.ANSWER_DIGIT) {
            System.out.println("miss");
            return;
        }
        System.out.printf("%d strike %d ball\n", judgement.get(Type.STRIKE), judgement.get(Type.BALL));
    }
}

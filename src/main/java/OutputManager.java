import java.util.HashMap;

public class OutputManager {

    public static void showInningResult(Judgement judgement) {
        if(judgement.isMiss()) {
            System.out.println("miss");
            return;
        }
        System.out.printf("%d strike %d ball\n", judgement.getNumStrike(), judgement.getNumBall());
    }
}

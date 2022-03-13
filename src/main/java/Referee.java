import java.util.ArrayList;
import java.util.HashMap;

public class Referee {

    public HashMap<BallStatus, Integer> judge(ArrayList<Integer> answer, ArrayList<Integer> input) throws IllegalArgumentException {
        if(answer.size() != input.size()) {
            throw new IllegalArgumentException("길이 안맞음");
        }

        HashMap<BallStatus, Integer> judgement = new HashMap<>();
        judgement.put(BallStatus.STRIKE, 0);
        judgement.put(BallStatus.BALL, 0);
        judgement.put(BallStatus.MISS, 0);

        for(int i = 0; i<input.size(); i++) {
            int inputNumber = input.get(i);
            BallStatus typ = getType(inputNumber, i, answer);
            int val = judgement.get(typ);
            judgement.put(typ, val + 1);
        }
        return judgement;
    }

    private BallStatus getType(int number, int numberIndex, ArrayList<Integer> answer){
        int sameNumberIndex = answer.indexOf(number);
        if(sameNumberIndex == numberIndex) {
            return BallStatus.STRIKE;
        }
        if(sameNumberIndex != -1) {
            return BallStatus.BALL;
        }
        return BallStatus.MISS;
    }
}

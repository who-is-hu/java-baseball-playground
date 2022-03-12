import java.util.ArrayList;
import java.util.HashMap;

public class Referee {

    public HashMap<Type, Integer> judge(ArrayList<Integer> answer, ArrayList<Integer> input) throws IllegalArgumentException {
        if(answer.size() != input.size()) {
            throw new IllegalArgumentException("길이 안맞음");
        }

        HashMap<Type, Integer> judgement = new HashMap<>();
        judgement.put(Type.STRIKE, 0);
        judgement.put(Type.BALL, 0);
        judgement.put(Type.MISS, 0);

        for(int i = 0; i<input.size(); i++) {
            int inputNumber = input.get(i);
            Type typ = getType(inputNumber, i, answer);
            int val = judgement.get(typ);
            judgement.put(typ, val + 1);
        }
        return judgement;
    }

    private Type getType(int number, int numberIndex, ArrayList<Integer> answer){
        int sameNumberIndex = answer.indexOf(number);
        if(sameNumberIndex == numberIndex) {
            return Type.STRIKE;
        }
        if(sameNumberIndex != -1) {
            return Type.BALL;
        }
        return Type.MISS;
    }
}

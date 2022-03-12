import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AnswerGenerator {

    public final static int ANSWER_DIGIT = 3;

    public static ArrayList<Integer> createRandomAnswer() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < ANSWER_DIGIT; i++) {
            list.add(getNumberNotIn(list));
        }
        return list;
    }

    public static int getNumberNotIn(final ArrayList<Integer> list) {
        Random random = new Random();
        ArrayList<Integer> availableNumbers = new ArrayList<>(
                IntStream.range(1, 10).boxed().collect(Collectors.toList()));

        availableNumbers.removeAll(list);
        int randomIdx = random.nextInt(availableNumbers.size()) - 1;
        return availableNumbers.get(randomIdx);
    }
}

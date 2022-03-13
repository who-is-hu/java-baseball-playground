import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static InputManager im = new InputManager();

    public static void main(String[] args) {
        try {
            logic();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void logic() throws IOException {
        do {
            playGame();
        } while (wantContinue());
    }

    public static void playGame() throws IOException {
        int trial = 0;
        Judgement judgement;
        Balls randomAnswer = new Balls(AnswerGenerator.createRandomAnswer());

        do {
            judgement = randomAnswer.compare(im.inputAnswer());
            OutputManager.showInningResult(judgement);
            trial++;
        } while(!judgement.isGameEnd());

        System.out.println(trial + "회에 성공!");
    }

    private static boolean wantContinue() {
        System.out.println("do you want to continue game? (y/n)");
        String input = sc.nextLine();
        return input.equals("y");
    }
}

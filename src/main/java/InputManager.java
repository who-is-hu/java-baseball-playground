import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class InputManager {
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public Balls inputAnswer() throws IOException {
        System.out.println("input three numbers : ");
        String input = reader.readLine();
        StringTokenizer tokens = new StringTokenizer(input, " ");

        ArrayList<Integer> answer = new ArrayList<>();
        while(tokens.hasMoreTokens()){
            answer.add(Integer.parseInt(tokens.nextToken()));
        }
        return new Balls(answer);
    }
}

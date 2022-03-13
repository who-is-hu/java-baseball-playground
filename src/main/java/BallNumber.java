public class BallNumber {
    private int value;

    public BallNumber(int value) throws IllegalArgumentException {
        if(value < 1 || value > 9) {
            throw new IllegalArgumentException();
        }
        this.value = value;
    }
}

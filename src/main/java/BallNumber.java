public class BallNumber {
    private int value;

    public BallNumber(int value) throws IllegalArgumentException {
        if (value < 1 || value > 9) {
            throw new IllegalArgumentException();
        }
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BallNumber that = (BallNumber) o;

        return value == that.value;
    }

    @Override
    public int hashCode() {
        return value;
    }
}

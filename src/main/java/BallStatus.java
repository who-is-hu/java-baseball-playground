public enum BallStatus {
    STRIKE,
    BALL,
    MISS;

    public boolean isNotMiss(){
        return this != MISS;
    }

    public boolean isStrike() {
        return this == STRIKE;
    }

    public boolean isBall() {
        return this == BALL;
    }
}

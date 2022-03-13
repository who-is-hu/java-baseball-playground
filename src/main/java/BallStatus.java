public enum BallStatus {
    STRIKE,
    BALL,
    MISS;

    public boolean isNotMiss(){
        return this != MISS;
    }
}

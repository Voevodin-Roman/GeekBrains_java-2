package Homework_2_1;

public class Runningroad implements Obstacle {

    private final String type = "Runningroad";
    private final int distance;

    public String getType() {
        return type;
    }

    public Runningroad(int distance) {
        this.distance = distance;
    }

    @Override
    public String type() {
        return type;
    }

    @Override
    public int size() {
        return distance;
    }
}

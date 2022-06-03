package Homework_2_1;

public class Wall implements Obstacle  {
    private final String type = "Wall";
    private final int height;

    public String getType() {
        return type;
    }

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public int size() {
        return height;

    }

    @Override
    public String type() {
        return type;
    }
}

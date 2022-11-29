package worker;

public class Worker {

    private final String name;
    private final Position position;
    private final int daysOnThePlatform;

    public Worker(String name, Position position, int daysOnThePlatform) {
        this.name = name;
        this.position = position;
        this.daysOnThePlatform = daysOnThePlatform;
    }

    public String getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }

    public int getDaysOnThePlatform() {
        return daysOnThePlatform;
    }
}

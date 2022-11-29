package worker;

public enum Position {

    MANUAL_WORKER("Manual worker"),
    MEDIC("Medic"),
    MANAGER("Manager");

    private final String position;

    Position(String position) {
        this.position = position;
    }

    public String getValue() {
        return position;
    }
}
